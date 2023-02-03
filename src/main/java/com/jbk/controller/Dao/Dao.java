package com.jbk.controller.Dao;



import java.util.List;

import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.jbk.controller.Config.Config;
import com.jbk.controller.Entity.Product;
import com.jbk.controller.Config.Config;

public class Dao {

	Product product=null;
	List<Product> list;
	String sql;
	private SessionFactory sessionFactory=Config.getSessionFactory();
	
		public boolean saveProduct(Product product){
			boolean isSave=false;	
			Session session = sessionFactory.openSession();
			try {
					Transaction transaction=session.beginTransaction();
					session.save(product);
					transaction.commit();
					return true;
			}catch(Exception e){
					e.printStackTrace();
			}finally {
				session.close();
			}
			return false;
			
		}
		public Product getProductById(long productId) {
			
			Session session=sessionFactory.openSession();
			try {
				 product = session.get(Product.class, productId);
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
			return product;
		}
		public List<Product> getProductByCountWise(int cout,int tot) {
			
			Session session=sessionFactory.openSession();
			List<Product> list=null;
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.setFirstResult(cout);
				criteria.setMaxResults(tot);
				list = criteria.list();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
			return list;
		}
		public boolean deletePoductByProductId(long productId) {
			boolean isdelete=false;
			Session session=sessionFactory.openSession();
			try {
				Transaction transaction=session.beginTransaction();
				product=session.get(Product.class, productId);
				session.delete(product);
				transaction.commit();
				return isdelete=true;
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
			return isdelete;
		}
		public List<Product> getAllProduct() {
			Session session = sessionFactory.openSession();
			try {
				Criteria criteria = session.createCriteria(Product.class);
				list = criteria.list();
				return list;
	 		} catch (Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
				return null;
			}
		public  List<Product>  getAllProductAssending(){
			Session session = sessionFactory.openSession();
			List<Product> list=null;
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.addOrder(Order.asc("productName"));
				list = criteria.list();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
				return list;
			}
		public  List<Product>  getAllProductDesending(){
			Session session = sessionFactory.openSession();
			List<Product> list=null;
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.addOrder(Order.desc("productName"));
				list = criteria.list();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
				return list;
			}
		
		public boolean updatePoductByProductId(Product product) {
			Session session = sessionFactory.openSession();	
			boolean isUpdate=false;
			try {
				Transaction transaction=session.beginTransaction();
				session.update(product);
				transaction.commit();
				return isUpdate=true;
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
			return isUpdate=false;
		}
		public List<Product> serchProductbyName(String cName, String pName){
			Session session = sessionFactory.openSession();
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.add(Restrictions.like(cName,"%"+pName+"%"));
				List<Product> list = criteria.list();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
				
			return list;
		}
		public List<Product> greterThanProduct(double productPrice){
			Session session = sessionFactory.openSession();
			List<Product> list=null;
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.add(Restrictions.gt("productPrice",productPrice));
				list = criteria.list();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
				
			
			return list;
		}
		public List<Product> lessThanProduct(double productPrice){
			Session session = sessionFactory.openSession();
			List<Product> list=null;
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.add(Restrictions.lt("productPrice",productPrice));
				list = criteria.list();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
		return list;
		}
		public List<Product> equalProductByProductName(String productName1){
			Session session = sessionFactory.openSession();
			List<Product> list=null;
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.add(Restrictions.eq("productName",productName1));
				list = criteria.list();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
			return list;
		}
		public List<Product> betweenProductByPrice(double price1,double price2){
			Session session = sessionFactory.openSession();
			List<Product> list=null;
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.add(Restrictions.between("productPrice",price1,price2));
				list = criteria.list();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
			return list;
		}
		public List<Product> greaterThanEqualToProductByPice(double productPrice4){
			Session session = sessionFactory.openSession();
			List<Product> list=null;
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.add(Restrictions.gt("productPrice",productPrice4));
				list = criteria.list();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
		return list;
		}
		public List<Product> lessThanEqualToProductByPice(double productPrice4){
			Session session = sessionFactory.openSession();
			List<Product> list=null;
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.add(Restrictions.le("productPrice",productPrice4));
				list = criteria.list();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
		return list;
		}
		public boolean colunmIsEmpty(String colName) {
			Session session = sessionFactory.openSession();
			boolean isEmpty=false;
			try {
				Criteria criteria = session.createCriteria(Product.class);
				criteria.add(Restrictions.isEmpty(colName));
				isEmpty = criteria.isReadOnly();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				session.close();
			}
		return isEmpty;	
		}
}

