package service;


//
//import com.example.sportyshoes.entity.Admin;
//import com.example.sportyshoes.entity.Product;
//import com.example.sportyshoes.entity.Purchase;
//import com.example.sportyshoes.entity.User;
//import com.example.sportyshoes.repository.AdminRepository;
//import com.example.sportyshoes.repository.ShoesRepository;
//import com.example.sportyshoes.repository.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.*;
import repository.AdminRepository;
import repository.ShoesRepository;
import repository.UserRepository;

import java.util.List;

@Service
public class ShoesServiceImpl implements ShoesService {

    @Autowired
    private ShoesRepository shoesRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin changeAdminPassword(Long id, String newPassword) {
        Admin admin = adminRepository.findById(id).orElseThrow();
        admin.setPassword(newPassword);
        return adminRepository.save(admin);
    }

    @Override
    public Product addProduct(Product product) {
        return shoesRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return shoesRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        shoesRepository.deleteById(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> searchUsers(String keyword) {
        return userRepository.findByUsernameContaining(keyword);
    }

    @Override
    public List<Purchase> getPurchaseReports(String date, String category) {
        // Implementation of filtering purchase reports by date and category
        return null; // Modify as needed
    }

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
}
