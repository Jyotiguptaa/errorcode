package com.service.implementation;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jparepositpory.*;
import com.model.*;
import com.service.*;
@Service
public class ProductServiceImpl implements ProductService{
	//dependency injection  busines logic class
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProductDetails(Product product) {
				
		Product productdetails = productRepository.save(product);
		return productdetails;
	}

	@Override
	public ArrayList<Product> ListOfProducts() {
		ArrayList<Product> listofproduct=(ArrayList<Product>) productRepository.findAll();
		// TODO Auto-generated method stub
		return listofproduct;
	}

	@Override
	public void deleteProductById(long id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);

	}

	@Override
	public void viewProductById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOfProductById(long id) {
		// TODO Auto-generated method stub
		
	}

}