package com.repository;

import com.model.*;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JdbcShoesRepositoryImpl implements JdbcShoesRepository {


    private final JdbcTemplate jdbcTemplate;
    
    @Autowired
    public JdbcShoesRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static class ProductRowMapper implements RowMapper<Product> {
        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product product = new Product();
            product.setId(rs.getLong("id"));
            product.setName(rs.getString("name"));
            product.setPrice(rs.getDouble("price"));
            product.setCategoryId(rs.getLong("category_id"));
            return product;
        }
    }
    
   
    // RowMapper for Category entity
    private static class CategoryRowMapper implements RowMapper<Category> {
        @Override
        public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
            Category category = new Category();
            category.setId(rs.getLong("id"));
            category.setName(rs.getString("name"));
            return category;
        }
    }

    // RowMapper for User entity
    private static class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setUsername(rs.getString("username"));

            return user;
        }
    }

    // RowMapper for Purchase entity
    private static class PurchaseRowMapper implements RowMapper<Purchase> {
        @Override
        public Purchase mapRow(ResultSet rs, int rowNum) throws SQLException {
            Purchase purchase = new Purchase();
            purchase.setId(rs.getLong("id"));
            purchase.setProductId(rs.getLong("product_id"));
            purchase.setUserId(rs.getLong("user_id"));
            purchase.setPurchaseDate(rs.getDate("purchase_date")); // Assuming purchase_date is of type DATE
            return purchase;
        }
    }


    @Override
    public List<Product> findAllProducts() {
        return jdbcTemplate.query("SELECT * FROM products", new ProductRowMapper());
    }


    @Override
    public int addProduct(Product product) {
        return jdbcTemplate.update("INSERT INTO products (name, price, category_id) VALUES (?, ?, ?)",
                product.getName(), product.getPrice(), product.getCategoryId());
    }

    @Override
    public int updateProduct(Product product) {
        return jdbcTemplate.update("UPDATE products SET name = ?, price = ?, category_id = ? WHERE id = ?",
                product.getName(), product.getPrice(), product.getCategoryId(), product.getId());
    }

    @Override
    public int deleteProductById(Long id) {
        return jdbcTemplate.update("DELETE FROM products WHERE id = ?", id);
    }
    
    @Override
    public List<Category> findAllCategories() {
        String sql = "SELECT * FROM categories";
        return jdbcTemplate.query(sql, new CategoryRowMapper());
    }
    
    @Override
    public int saveCategory(Category category) {
        String sql = "INSERT INTO categories (id, name) VALUES (?, ?)";
        return jdbcTemplate.update(sql, category.getId(), category.getName());
    }
    
    @Override
    public int updateCategory(Category category) {
        String sql = "UPDATE categories SET name = ? WHERE id = ?";
        return jdbcTemplate.update(sql, category.getName(), category.getId());
    }

    @Override
    public int deleteCategoryById(Long id) {
        String sql = "DELETE FROM categories WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
    
    @Override
    public List<User> findAllUsers() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    @Override
    public User findUserById(Long id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,  new UserRowMapper(), new Object[]{id});
    }

    @Override
    public int saveUser(User user) {
        String sql = "INSERT INTO users (id, username, email) VALUES (?, ?)";
        return jdbcTemplate.update(sql, user.getId(), user.getUsername());
    }

    @Override
    public List<User> searchUsers(String keyword) {
        String sql = "SELECT * FROM users WHERE username LIKE ?";
        return jdbcTemplate.query(sql,new UserRowMapper(), new Object[]{"%" + keyword + "%"});
    }

    @Override
    public List<Purchase> findAllPurchases() {
        String sql = "SELECT * FROM purchases";
        return jdbcTemplate.query(sql, new PurchaseRowMapper());
    }

    @Override
    public List<Purchase> findPurchasesByDateAndCategory(String startDate, String endDate, Long categoryId) {
        String sql = "SELECT * FROM purchases WHERE purchase_date BETWEEN ? AND ? AND category_id = ?";
        return jdbcTemplate.query(sql, new PurchaseRowMapper() , new Object[]{startDate, endDate, categoryId});
    }

    @Override
    public int savePurchase(Purchase purchase) {
        String sql = "INSERT INTO purchases (id, product_id, user_id, purchase_date) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, purchase.getId(), purchase.getProductId(), purchase.getUserId(), purchase.getPurchaseDate());
    }


    @Override
    public Category findCategoryById(Long id) {
        String sql = "SELECT * FROM categories WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql,  new CategoryRowMapper(), new Object[]{id});
        } catch (EmptyResultDataAccessException ex) {
            return null; // Handle case where no category with given ID is found
        }
    }



    @Override
    public int updateUser(User user) {
        String sql = "UPDATE users SET username = ?, email = ? WHERE id = ?";
        return jdbcTemplate.update(sql, user.getUsername(), user.getId());
    }



    @Override
    public int deleteUserById(Long id) {
        String sql = "DELETE FROM users WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }


  
}
