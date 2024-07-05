//package sportyshoes.com;
//
//import model.*;
//
//
//import repository.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.ResponseEntity;
//
//import java.util.Date;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class SportyShoesApplicationTests {
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private AdminRepository adminRepository;
//
//    @Autowired
//    private PurchaseRepository purchaseRepository;
//
//    @BeforeEach
//    public void setup() {
//        productRepository.deleteAll();
//        userRepository.deleteAll();
//        adminRepository.deleteAll();
//        purchaseRepository.deleteAll();
//    }
//
//    @Test
//    public void testAddAndGetProducts() {
//        Product product = new Product();
//        product.setName("Test Product");
//        product.setPrice(100.0);
//        productRepository.save(product);
//
//        List<Product> products = productRepository.findAll();
//        assertThat(products).hasSize(1);
//        assertThat(products.get(0).getName()).isEqualTo("Test Product");
//    }
//
//    @Test
//    public void testAddAndGetUsers() {
//        User user = new User();
//        user.setUsername("testuser");
//        user.setPassword("password");
//        user.setEmail("testuser@example.com");
//        userRepository.save(user);
//
//        List<User> users = userRepository.findAll();
//        assertThat(users).hasSize(1);
//        assertThat(users.get(0).getUsername()).isEqualTo("testuser");
//    }
//
//    @Test
//    public void testAddAndGetAdmins() {
//        Admin admin = new Admin();
//        admin.setUsername("adminuser");
//        admin.setPassword("adminpass");
//        admin.setEmail("admin@example.com");
//        adminRepository.save(admin);
//
//        List<Admin> admins = adminRepository.findAll();
//        assertThat(admins).hasSize(1);
//        assertThat(admins.get(0).getUsername()).isEqualTo("adminuser");
//    }
//
//    @Test
//    public void testAddAndGetPurchaseRecords() {
//        User user = new User();
//        user.setUsername("testuser");
//        user.setPassword("password");
//        user.setEmail("testuser@example.com");
//        userRepository.save(user);
//
//        Product product = new Product();
//        product.setName("Test Product");
//        product.setPrice(100.0);
//        productRepository.save(product);
//
//        Purchase purchase = new Purchase();
//        purchase.setProduct(product);
//        purchase.setUser(user);
//        purchase.setPurchaseDate(new Date());
//        purchaseRepository.save(purchase);
//
//        List<Purchase> purchases = purchaseRepository.findAll();
//        assertThat(purchases).hasSize(1);
//        assertThat(purchases.get(0).getProduct().getName()).isEqualTo("Test Product");
//        assertThat(purchases.get(0).getUser().getUsername()).isEqualTo("testuser");
//    }
//}
