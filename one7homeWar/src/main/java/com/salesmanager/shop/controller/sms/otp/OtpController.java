package com.salesmanager.shop.controller.sms.otp;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.salesmanager.core.business.services.system.OtpRespose;
import com.salesmanager.core.business.services.system.OtpService;

@Controller
@CrossOrigin
public class OtpController {

	@Inject
	OtpService otpService;
	
	@RequestMapping(value="/otp/{mobileNumber}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	OtpRespose sendSmsOtp(@PathVariable("mobileNumber") String mobileNumber) {
		return otpService.sendSmsOtp(mobileNumber);
	}
	@RequestMapping(value="/otp/verify/{sessionId}/{otp}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	OtpRespose verifySmsOtp(@PathVariable("sessionId") String sessionId,@PathVariable("otp") String otp) {
		return otpService.verifySmsOtp(sessionId, otp);
	}
}
