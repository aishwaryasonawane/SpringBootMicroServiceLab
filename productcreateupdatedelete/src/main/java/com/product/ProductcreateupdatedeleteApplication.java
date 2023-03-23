package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@SpringBootApplication
public class ProductcreateupdatedeleteApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductcreateupdatedeleteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
        // passing the value of product
		Product p1 = Product.builder().productName("Hp").price(30000).build();
		Product p2 = Product.builder().productName("Lg").price(35000).build();
		Product p3 = Product.builder().productName("Dell").price(40000).build();
		Product p4 = Product.builder().productName("lenevo").price(50000).build();
        
		// saving the product objects
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);

		// printing the massage
		System.out.println("---------------All saved--------");

	}

}
