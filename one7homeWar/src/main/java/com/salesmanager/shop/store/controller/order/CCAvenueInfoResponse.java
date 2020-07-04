package com.salesmanager.shop.store.controller.order;

public class CCAvenueInfoResponse {
	private String encRequest;
	private String accessCode;
	private String paymentGatewayUrl;
	
	public String getEncRequest() {
		return encRequest;
	}
	public void setEncRequest(String encRequest) {
		this.encRequest = encRequest;
	}
	public String getAccessCode() {
		return accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	public String getPaymentGatewayUrl() {
		return paymentGatewayUrl;
	}
	public void setPaymentGatewayUrl(String paymentGatewayUrl) {
		this.paymentGatewayUrl = paymentGatewayUrl;
	}
	
}
