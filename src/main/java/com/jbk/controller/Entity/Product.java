package com.jbk.controller.Entity;

import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
public class Product{

		@Id
		private long productId;
		private String productName;
		private long supplyerId;
		private long categoryId;
		private int productQty;
		private double productPrice;
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Product(long productId, String productName, long supplyerId, long categoryId, int productQty,
				double productPrice) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.supplyerId = supplyerId;
			this.categoryId = categoryId;
			this.productQty = productQty;
			this.productPrice = productPrice;
		}
		public long getProductId() {
			return productId;
		}
		public void setProductId(long productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public long getSupplyerId() {
			return supplyerId;
		}
		public void setSupplyerId(long supplyerId) {
			this.supplyerId = supplyerId;
		}
		public long getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(long categoryId) {
			this.categoryId = categoryId;
		}
		public int getProductQty() {
			return productQty;
		}
		public void setProductQty(int productQty) {
			this.productQty = productQty;
		}
		public double getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", supplyerId=" + supplyerId
					+ ", categoryId=" + categoryId + ", productQty=" + productQty + ", productPrice=" + productPrice + "]";
		}
		
}
