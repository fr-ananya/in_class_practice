package service;

import model.*;

import java.util.List;

public interface ShoesService {
    Admin changeAdminPassword(Long id, String newPassword);
    Product addProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);
    List<Product> getProducts(); // New method
    List<User> getUsers();
    List<User> searchUsers(String keyword);
    List<Purchase> getPurchaseReports(String date, String category);
}
