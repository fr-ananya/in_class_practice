package com.service;

import com.model.*;


import java.util.List;

import org.springframework.stereotype.Service;


@Service

public interface ShoesService {
    // Product services
    List<Product> getAllProducts();
    
    int addProduct(Product product);
    int updateProduct(Product product);
    int deleteProduct(Long id);

    // Category services
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    int saveCategory(Category category);
    int updateCategory(Category category);
    int deleteCategory(Long id);

    // User services
    List<User> getAllUsers();
    User getUserById(Long id);
    int saveUser(User user);
    int updateUser(User user);
    int deleteUser(Long id);
    List<User> searchUsers(String keyword);

    // Purchase services
    List<Purchase> getAllPurchases();
    List<Purchase> getPurchasesByDateAndCategory(String startDate, String endDate, Long categoryId);
    int savePurchase(Purchase purchase);
}
