package com.twilio.twiliotok;

import org.springframework.stereotype.Component;

@Component
public class Token {
	
	private String TWILIO_ACCESS_TOKEN = "";
	
	public void setTWILIO_ACCESS_TOKEN(String TWILIO_ACCESS_TOKEN) {
		this.TWILIO_ACCESS_TOKEN = TWILIO_ACCESS_TOKEN;
	}
	
	public String getTWILIO_ACCESS_TOKEN() {
		return TWILIO_ACCESS_TOKEN;
	}
}
