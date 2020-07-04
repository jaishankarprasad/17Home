package com.salesmanager.shop.controller.vendor.product;

import java.util.List;

import com.salesmanager.shop.store.controller.customer.VendorResponse;

public class VendorsList {

	String status;
	String message;
	
	private List<VendorResponse> vendorsDataForProduct;

	public List<VendorResponse> getVendorsDataForProduct() {
		return vendorsDataForProduct;
	}

	public void setVendorsDataForProduct(List<VendorResponse> vendorsDataForProduct) {
		this.vendorsDataForProduct = vendorsDataForProduct;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
