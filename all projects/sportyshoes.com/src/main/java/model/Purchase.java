package model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate purchaseDate;
    
    @ManyToOne
    private Product product;
    
    @ManyToOne
    private User user;
    // other fields, constructors, getters, setters

    
    
    public Purchase() {};
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Purchase(Long id, LocalDate purchaseDate, Product product, User user) {
		super();
		this.id = id;
		this.purchaseDate = purchaseDate;
		this.product = product;
		this.user = user;
	}
    
    
}
