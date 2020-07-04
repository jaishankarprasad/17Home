package com.salesmanager.shop.store.controller.order;

public class OrderRequest {

	private String cartCode;
	private String preferedShippingAddress;
	private String userId;
	private String encData;
	private String orderId;
	
	public String getEncData() {
		return encData;
	}
	public void setEncData(String encData) {
		this.encData = encData;
	}
	public String getCartCode() {
		return cartCode;
	}
	public void setCartCode(String cartCode) {
		this.cartCode = cartCode;
	}
	public String getPreferedShippingAddress() {
		return preferedShippingAddress;
	}
	public void setPreferedShippingAddress(String preferedShippingAddress) {
		this.preferedShippingAddress = preferedShippingAddress;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
}
