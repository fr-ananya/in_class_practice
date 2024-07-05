package com.service;


import com.model.*;
import com.repository.JdbcShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoesServiceImpl implements ShoesService {



    private final JdbcShoesRepository jdbcShoesRepository;
    
    @Autowired
    public ShoesServiceImpl(JdbcShoesRepository jdbcShoesRepository) {
        this.jdbcShoesRepository = jdbcShoesRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return jdbcShoesRepository.findAllProducts();
    }


    @Override
    public int addProduct(Product product) {
        return jdbcShoesRepository.addProduct(product);
    }

    @Override
    public int updateProduct(Product product) {
        return jdbcShoesRepository.updateProduct(product);
    }

    @Override
    public int deleteProduct(Long id) {
        return jdbcShoesRepository.deleteProductById(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return jdbcShoesRepository.findAllCategories();
    }

    @Override
    public Category getCategoryById(Long id) {
        return jdbcShoesRepository.findCategoryById(id);
    }

    @Override
    public int saveCategory(Category category) {
        return jdbcShoesRepository.saveCategory(category);
    }

    @Override
    public int updateCategory(Category category) {
        return jdbcShoesRepository.updateCategory(category);
    }

    @Override
    public int deleteCategory(Long id) {
        return jdbcShoesRepository.deleteCategoryById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return jdbcShoesRepository.findAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return jdbcShoesRepository.findUserById(id);
    }

    @Override
    public int saveUser(User user) {
        return jdbcShoesRepository.saveUser(user);
    }

    @Override
    public int updateUser(User user) {
        return jdbcShoesRepository.updateUser(user);
    }

    @Override
    public int deleteUser(Long id) {
        return jdbcShoesRepository.deleteUserById(id);
    }

    @Override
    public List<User> searchUsers(String keyword) {
        return jdbcShoesRepository.searchUsers(keyword);
    }

    @Override
    public List<Purchase> getAllPurchases() {
        return jdbcShoesRepository.findAllPurchases();
    }

    @Override
    public List<Purchase> getPurchasesByDateAndCategory(String startDate, String endDate, Long categoryId) {
        return jdbcShoesRepository.findPurchasesByDateAndCategory(startDate, endDate, categoryId);
    }

    @Override
    public int savePurchase(Purchase purchase) {
        return jdbcShoesRepository.savePurchase(purchase);
    }
}
