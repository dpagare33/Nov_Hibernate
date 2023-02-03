package com.jbk.controller;

import java.util.List;
import java.util.Scanner;

import com.jbk.controller.Entity.Product;
import com.jbk.controller.Service.Service;
import com.jbk.controller.Utility.Utility;
public class Controller {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Product product=null;
		long productId;
		char ch;
		
		boolean  st;
		System.out.println("Show Product Deatails");
		Service service=new Service();
		do {
				System.out.println("Press 1 for save Product");
				System.out.println("Press 2 for serching product by productID");
				System.out.println("Press 3 for delete product by productID");
				System.out.println("Press 4 for Update product by productID");
				System.out.println("press 5 for Dispaly All Record");
				System.out.println("press 6 for Dispaly All Record in Ascending Order by Name");
				System.out.println("press 7 for Dispaly All Record in Descending Order by Name");
				System.out.println("press 8 for Serching Record by Name");
				System.out.println("Press 9 for Serching by row wise ");
				System.out.println("Press 10 for gresterthan product by price ");
				System.out.println("Press 11 for lessthan product by price  ");
				System.out.println("Press 12  for Serching Record by Equal Name  ");
				System.out.println("Press 13 for between product by price  ");
				System.out.println("Press 14 for greter than equal to product by price  ");
				System.out.println("Press 15 for less than equal to product by price  ");
				System.out.println("Press 16 for colunm Name for Check colum empty or Not");
				
				System.out.println("Enter your choice");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1: product=Utility.getPrepareProductData(scanner);
						st=service.saveProduct(product);
						if(st) {
								System.out.println("Record Added sucessfully");
						}else {
							System.out.println("Record is Already Exists"+product.getProductId());
						}
					break;
				case 2:	System.out.println("Enter Product Id");
						productId=scanner.nextLong();
						product = service.getProductById(productId);
						if(product!=null) {
							System.out.println(product);
						}else {
							System.out.println("Record is  Not Exists");
						}
					break;
				case 3:System.out.println("Enter product Id ");
						productId=scanner.nextLong();
						st=service.deletePoductByProductId(productId);
						if(st) {
							System.out.println("Record Deleted Sucessfully");
						}else{
							System.out.println("Record is Not Exist");
						}	
					break;
				case 4: product = Utility.getPrepareProductData(scanner);
						st=service.updatePoductByProductId(product);
						if(st) {
							System.out.println("Record Update Sucessfully");
						}else {
							System.out.println("Record not Exists");
						}
					break;
				case 5:List<Product> list=service.getAllProduct();
						if(list.isEmpty() || list==null) {
							System.out.println("List is Empty");
						}else {		
							for (Product product2 : list) {
								System.out.println(product2);
 							}
						}
					break;
				case 6: list = service.getAllProductAssending();
						if(list.isEmpty() || list==null) {
							System.out.println("List is Empty");
						}else {		
							for (Product product2 : list) {
								System.out.println(product2);
							}
						}
					break;
				case 7: list = service.getAllProductDesending();
						if(list.isEmpty() || list==null) {
							System.out.println("List is Empty");
						}else {		
							for (Product product2 : list) {
								System.out.println(product2);
							}
						}
					break;
				case 8:	System.out.println("Enter coloum Name by Serching");
						String cName=scanner.next();
						System.out.println("Enter Product Name");
						String productName = scanner.next();
						list =  service.serchProductbyName(cName,productName);
						if(list.isEmpty() || list == null) {
							System.out.println("Record is  Not Exists");
						}else {
							for (Product product2 : list) {
								System.out.println(product2);
							}
						}
					break;
				
				case 9:System.out.println("Enter Row Number");
						int cout=scanner.nextInt();
						System.out.println("Enter total Number count");
						int tot=scanner.nextInt();
						
						list = service.getProductByCountWise(cout,tot);	
						if(list.isEmpty()) {
							System.out.println(" Record is not Exists");
						}else {
							for (Product product1 : list) {
								System.out.println(product1);
							}
						}	
						break;
				case 10:System.out.println("Enter Product price");
						double productPrice=scanner.nextDouble();
						 list=service.greaterThanProduct(productPrice);
						 if(list.isEmpty()) {
								System.out.println(" Record is not Exists");
							}else {
								for (Product product1 : list) {
									System.out.println(product1);
								}
							}
					break;
				case 11:System.out.println("Enter Product price");
						double productPrice1=scanner.nextDouble();
						list=service.lessThanProduct(productPrice1);
						 if(list.isEmpty()) {
								System.out.println(" Record is not Exists");
							}else {
								for (Product product1 : list) {
									System.out.println(product1);
								}
							}
						break;
				case 12:System.out.println("Enter Product Name");
						String productName1=scanner.next();
						list=service.equalProductByProductName(productName1);
						if(list.isEmpty()) {
							System.out.println(" Record is not Exists");
						}else {
							for (Product product1 : list) {
								System.out.println(product1);
							}
						}
					break;
				case 13:System.out.println("Enter Product price1");
						double productPrice2=scanner.nextDouble();
						System.out.println("Enter Product price2");
						double productPrice3=scanner.nextDouble();
						list=service.betweenProductByPrice(productPrice2, productPrice3);
						if(list.isEmpty()) {
							System.out.println(" Record is not Exists");
						}else {
							for (Product product1 : list) {
								System.out.println(product1);
							}
						}
					break;
				case 14:System.out.println("Enter Product price");
					 double productPrice4=scanner.nextDouble();
					 list=service.greaterThanEqualToProductByPice(productPrice4);
					 if(list.isEmpty()) {
							System.out.println(" Record is not Exists");
						}else {
							for (Product product1 : list) {
								System.out.println(product1);
							}
						}
					 break;
					 
				case 15:System.out.println("Enter Product price");
						double productPrice5=scanner.nextDouble();
						list=service.lessThanEqualToProductByPice(productPrice5);
						if(list.isEmpty()) {
							System.out.println(" Record is not Exists");
						}else {
							for (Product product1 : list) {
								System.out.println(product1);
							}
						}
						break;
				case 16:System.out.println("Enter Colunm Name");
						String colName=scanner.next();
						boolean isEmpty =service.colunmIsEmpty(colName);
						if(isEmpty) {
							System.out.println("Colum is Empty");
						}else {
							System.out.println("colum is Not Empty");
						}
							
					break;
					default:System.out.println("Invalid chice ");
						break;
			
				}
			System.out.println("Do yoy want to Continue Yes/No");
			ch=scanner.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
