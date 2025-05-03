package com.shubham.SpringBootWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shubham.SpringBootWebApp.model.Product;

@Service
public class ProductService {
	
	List <Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Iphone",5000),
			new Product (102,"Cannon Camera", 7000),
			new Product(103,"shrutu",211)));


	
	
	public List<Product> getProduct(){
		return products;
	}

	public Product getProductById(int prod_id) {

		return products.stream()
				.filter(p->p.getProdId() == prod_id)
				.findFirst().orElse(new Product(100,"no item",0));				
	}
	public void addProduct(Product prod) {
		products.add(prod);
	}

	public void updateProduct(Product prod) {
		int index=0;
		for (int i=0;i<products.size();i++)
		{
			if (products.get(i).getProdId()== prod.getProdId());
			index=i;
		}
		products.set(index,prod);
		
	}

	public void deleteProduct(int prod_id)
	{
		int index=0;
		for (int i=0;i<products.size();i++)
		{
			if (products.get(i).getProdId()== prod_id)
			index=i;
		}
		products.remove(index);
		
	}

}
