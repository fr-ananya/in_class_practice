package controller;

import model.*;

import service.ShoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ShoesService shoesService;

    @PutMapping("/change-password/{id}")
    public String changePassword(@PathVariable Long id, @RequestParam String newPassword, Model model) {
        Admin admin = shoesService.changeAdminPassword(id, newPassword);
        model.addAttribute("admin", admin);
        return "redirect:/admin/manage-products";
    }

    @GetMapping("/manage-products")
    public String manageProducts(Model model) {
        List<Product> products = shoesService.getProducts();
        model.addAttribute("products", products);
        return "admin/manage-products";
    }

    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute Product product) {
        shoesService.addProduct(product);
        return "redirect:/admin/manage-products";
    }

    @PostMapping("/update-product")
    public String updateProduct(@ModelAttribute Product product) {
        shoesService.updateProduct(product);
        return "redirect:/admin/manage-products";
    }

    @PostMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable Long id) {
        shoesService.deleteProduct(id);
        return "redirect:/admin/manage-products";
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = shoesService.getUsers();
        model.addAttribute("users", users);
        return "admin/users";
    }

    @GetMapping("/users/search")
    public String searchUsers(@RequestParam String keyword, Model model) {
        List<User> users = shoesService.searchUsers(keyword);
        model.addAttribute("users", users);
        return "admin/users";
    }

    @GetMapping("/purchase-reports")
    public String getPurchaseReports(@RequestParam(required = false) String date, 
                                      @RequestParam(required = false) String category, 
                                      Model model) {
        List<Purchase> purchases = shoesService.getPurchaseReports(date, category);
        model.addAttribute("purchases", purchases);
        return "admin/purchase-reports";
    }
}
