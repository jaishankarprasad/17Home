package com.salesmanager.core.business.services.system;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtpRespose {
    @JsonProperty("Status")
	public String status;

    @JsonProperty("Details")
    public String details;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

}
