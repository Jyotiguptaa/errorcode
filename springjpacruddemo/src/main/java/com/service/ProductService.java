package com.service;
import java.util.ArrayList;

import com.model.*;
public interface ProductService {

		
		Product addProductDetails(Product product);

		// list of all products
		

		ArrayList<Product> ListOfProducts();

		// Delete of Product

		void deleteProductById(long id);

		// view of particular Product by id

		void viewProductById(long id);

		// update of particular Product by id

		void updateOfProductById(long id);

	
}
