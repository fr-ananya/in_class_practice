package com.repository;

import com.model.*;


import java.util.List;

import org.springframework.stereotype.Repository;


public interface JdbcShoesRepository {
    List<Product> findAllProducts();

    int addProduct(Product product);
    int updateProduct(Product product);
    int deleteProductById(Long id);

    List<Category> findAllCategories();
    Category findCategoryById(Long id);
    int saveCategory(Category category);
    int updateCategory(Category category);
    int deleteCategoryById(Long id);

    List<User> findAllUsers();
    User findUserById(Long id);
    int saveUser(User user);
    int updateUser(User user);
    int deleteUserById(Long id);
    List<User> searchUsers(String keyword);

    List<Purchase> findAllPurchases();
    List<Purchase> findPurchasesByDateAndCategory(String startDate, String endDate, Long categoryId);
    int savePurchase(Purchase purchase);
}
