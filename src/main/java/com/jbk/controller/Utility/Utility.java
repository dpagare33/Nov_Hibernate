package com.jbk.controller.Utility;

import java.util.Scanner;

import com.jbk.controller.Entity.Product;

public class Utility {

public static Product getPrepareProductData(Scanner scanner) {
		
		System.out.println("Enter Product Id");
		long productId=scanner.nextLong();
	
		System.out.println("Enter Product Name");
		String productName=scanner.next();
		
		System.out.println("Enter Category Id ");
		long categoryId=scanner.nextLong();
		
		System.out.println("Enter Supplyer Id");
		long supplyerId=scanner.nextLong();
		
		System.out.println("Enter Product Qty");
		int productQty=scanner.nextInt();
		
		System.out.println("Enter Product Price");
		double productPrice=scanner.nextDouble();
		
		Product product=new Product(productId, productName, supplyerId, categoryId, productQty, productPrice);
		
		return product;
	}
	
	

}
