package com.transcendenttopicals.orderService;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {

	@Id
	private String orderId;
	
	private HashMap<String, Integer> shoppingCart;
	private String shippingId;
	private String paymentId;
	private String status;
	
	
	public Order() {
		
	}
	
	
	
	public Order(String orderId, HashMap<String, Integer> shoppingCart,
			 String shippingId, String status) {
		super();
		this.orderId = orderId;
		this.shoppingCart = shoppingCart;
		this.shippingId = shippingId;
		this.status = status;
	}



	public BigDecimal calculateTax() {
		//TODO implement
		return null;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getOrderId() {
		return orderId;
	}



	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}



	public HashMap<String, Integer> getShoppingCart() {
		return shoppingCart;
	}



	public void setShoppingCart(HashMap<String, Integer> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}




	public String getShippingId() {
		return shippingId;
	}



	public void setShippingId(String shippingId) {
		this.shippingId = shippingId;
	}



	public String getPaymentId() {
		return paymentId;
	}



	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	
	
	
	
	
	
	
}
