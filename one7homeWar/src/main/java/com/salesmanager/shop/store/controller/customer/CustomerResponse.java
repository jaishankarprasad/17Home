package com.salesmanager.shop.store.controller.customer;


public class CustomerResponse {
	

	public CustomerResponse() {
		
	}
	String errorMessage;
	String successMessage;
	String status;
	String otpSessionId;
	
	public String getOtpSessionId() {
		return otpSessionId;
	}
	public void setOtpSessionId(String otpSessionId) {
		this.otpSessionId = otpSessionId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
