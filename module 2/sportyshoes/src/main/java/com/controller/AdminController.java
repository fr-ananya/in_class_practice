package com.controller;


import com.model.*;
import com.service.ShoesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ShoesService shoesService;

    // Admin endpoints
    @PostMapping("/change-password")
    public int changePassword(@RequestParam Long id, @RequestParam String newPassword) {
        // Implement logic to change admin password
        return 0; // Placeholder for implementation
    }

    // Product endpoints
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return shoesService.getAllProducts();
    }

//    @GetMapping("/products/{id}")
//    public Product getProductById(@PathVariable Long id) {
//        return shoesService.getProductById(id);
//    }

    @PostMapping("/products")
    public int addProduct(@RequestBody Product product) {
        return shoesService.addProduct(product);
    }

    @PutMapping("/products/{id}")
    public int updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return shoesService.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public int deleteProduct(@PathVariable Long id) {
        return shoesService.deleteProduct(id);
    }
    
    @GetMapping("/purchases")
    public List<Purchase> getAllPurchases() {
        return shoesService.getAllPurchases();
    }

    @GetMapping("/purchases/search")
    public List<Purchase> getPurchasesByDateAndCategory(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate,
            @RequestParam(required = false) Long categoryId) {
        // Convert Date to String in your service method if necessary
        return shoesService.getPurchasesByDateAndCategory(startDate.toString(), endDate.toString(), categoryId);
    }

    @PostMapping("/purchases")
    public int addPurchase(@RequestBody Purchase purchase) {
        return shoesService.savePurchase(purchase);
    }

}
