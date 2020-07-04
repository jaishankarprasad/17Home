package com.salesmanager.core.business.services.system;

public interface OtpService {

	OtpRespose sendSmsOtp(String mobileNumber);
	OtpRespose verifySmsOtp(String sessionId, String otp);
}
