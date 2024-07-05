package com.config;

import com.model.*; 
import com.service.ShoesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializeShoesSetup implements CommandLineRunner {

    @Autowired
    private ShoesService shoesService;

    @Override
    public void run(String... args) throws Exception {
        // Adding Products
        System.out.println("\nAdding Products...");
        shoesService.addProduct(new Product("Running Shoes", 99.99));
        shoesService.addProduct(new Product("Basketball Shoes", 129.99));
        System.out.println("\nAll Products:");
        System.out.println(shoesService.getAllProducts());

        // Updating Category
        System.out.println("\nUpdating Category...");
        Category category = new Category("Running");
        shoesService.saveCategory(category);
        System.out.println("\nAll Categories:");
        System.out.println(shoesService.getAllCategories());
    }
}
