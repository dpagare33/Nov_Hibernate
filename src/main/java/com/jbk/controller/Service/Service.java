package com.jbk.controller.Service;

import java.util.List;
import java.util.Scanner;

//import com.jbk.controller.product;
import com.jbk.controller.Dao.Dao;
//import com.jbk.controller.Dao.pubic;
import com.jbk.controller.Entity.Product;

public class Service {

	Dao dao=new Dao();
	 public boolean saveProduct(Product product) {
	 		boolean isSave=dao.saveProduct(product);
		return isSave;
	 }
	 public Product getProductById(long productId){
		 
		 Product product=dao.getProductById(productId);
		 
		return product; 
	 }
	 public boolean deletePoductByProductId(long productId) {
		 boolean isDelete=dao.deletePoductByProductId(productId);
		 return isDelete;
	 }
	 public List<Product> getAllProduct() {
		return dao.getAllProduct();
	 }
	 public List<Product> getAllProductAssending(){
		 	return dao.getAllProductAssending();
	 }	
	 public List<Product> getAllProductDesending(){
		 	return dao.getAllProductDesending();
	 }			
	 public boolean updatePoductByProductId(Product product) {
		boolean isUpdate =dao.updatePoductByProductId(product);
		 return isUpdate;
	 }
	 public List<Product> serchProductbyName(String cName,String pname) {
		 return dao.serchProductbyName(cName,pname);
	 }
	 public List<Product> getProductByCountWise(int cout,int tot){
		 return dao.getProductByCountWise(cout,tot); 
	 }
	 public List<Product> lessThanProduct(double productPrice){
		return dao.lessThanProduct(productPrice); 
	 }
	 public List<Product> greaterThanProduct(double productPrice){
		 return dao.greterThanProduct(productPrice);
	 }
	 public List<Product> equalProductByProductName(String productName1){
		 return dao.equalProductByProductName(productName1);
	 }
	 public List<Product> betweenProductByPrice(double price1,double price2){
		 return dao.betweenProductByPrice(price1, price2);
	 }
	public List<Product> greaterThanEqualToProductByPice(double productPrice4) {
		return dao.greaterThanEqualToProductByPice(productPrice4);
	}

	public List<Product> lessThanEqualToProductByPice(double productPrice5) {
		return dao.lessThanEqualToProductByPice(productPrice5);
	
	}
	public boolean colunmIsEmpty(String colName) {
		return  dao.colunmIsEmpty(colName);
	}
}
