package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

public class DbOperations {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductService productService = context.getBean("productServiceImpl", ProductService.class);
		List<Product> product = productService.findAllProducts();
		for (Product products : product) {
			System.out.println(products);
		}

		/*
		 * Product product1=productService.findProductById(1002); if(product1!=null) {
		 * product1.setPrice(54726); productService.updateProduct(product1); } else
		 * System.out.println("product not found");
		 */
		// Product product2=new Product(1001, "Moible", "Mi", 10000f);
		// productService.addProduct(product2);

		/*
		 * Product product1=productService.findProductById(1002); if(product1!=null) {
		 * productService.removeProduct(product1); } else
		 * System.out.println("product not found");
		 */

	}
}
