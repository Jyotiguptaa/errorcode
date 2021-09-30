package com.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import  com.service.*;
import com.model.*;
import com.service.implementation.*;


@RestController
public class ProductController {
  //injecting the dependencies of product implementation
	@Autowired
	ProductServiceImpl service;

	//inserting product details like id ,name,manufacturer
	
	@PostMapping("/addproductdetails")
	Product addProductDetails(@RequestBody Product product) {
			
		Product prod = service.addProductDetails(product);
		return prod;

	}
	@GetMapping("/listofproduct")
	ArrayList<Product> getproductdetails(){
		ArrayList<Product> getlist=service.ListOfProducts();
		return getlist;
	}
//	@DeleteMapping("/deleteproduct")
////	deleteproduct(long id){
//// deletefromlist=service.deleteProductById(id);
////	return deletefromlist;
//	}
	
}