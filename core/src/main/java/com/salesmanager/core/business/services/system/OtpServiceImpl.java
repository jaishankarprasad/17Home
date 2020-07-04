package com.salesmanager.core.business.services.system;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("otpService")
public class OtpServiceImpl implements OtpService{
	
	@Value("${otp.endpoint.url}")
	private String otpEndPointUrl;
	
	@Value("${otp.endpoint.apiKey}")
	private String otpEndPointApiKey;
	
	@Autowired
    RestTemplate restTemplate;
    
	/**
	 * https://2factor.in/API/V1/{api_key}/SMS/{phone_number}/AUTOGEN
	 * 
	 * https://2factor.in/API/V1/1c23359d-8457-11e9-ade6-0200cd936042/SMS/+918884030002/AUTOGEN/WatNew
	 */
	private String getSendSmsOtpUrl(String mobileNumber) {
		return new StringBuilder().append(otpEndPointUrl)
				.append(otpEndPointApiKey)
				.append("/SMS/")
				.append(mobileNumber)
				.append("/AUTOGEN/WatNew")
				.toString();	
	}
	/**
	 * https://2factor.in/API/V1/{api_key}/SMS/VERIFY/{session_id}/{otp_input}
	 * 
	 * https://2factor.in/API/V1/1c23359d-8457-11e9-ade6-0200cd936042/SMS/VERIFY/f406ba96-f46c-4ca6-9307-231a103f5f10/612769
	 */
	private String getVerifySmsOtpUrl(String sessionId,String otpNumber) {
		return new StringBuilder().append(otpEndPointUrl)
				.append(otpEndPointApiKey)
				.append("/SMS/VERIFY/")
				.append(sessionId)	
				.append("/")
				.append(otpNumber)
				.toString();	
	}
    
	@Override
	public OtpRespose sendSmsOtp(String mobileNumber) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      return restTemplate.exchange(getSendSmsOtpUrl(mobileNumber), HttpMethod.GET, entity, OtpRespose.class).getBody();
	}
	
	@Override
	public OtpRespose verifySmsOtp(String sessionId,String otp) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      return restTemplate.exchange(getVerifySmsOtpUrl(sessionId,otp), HttpMethod.GET, entity, OtpRespose.class).getBody();
	}
}
