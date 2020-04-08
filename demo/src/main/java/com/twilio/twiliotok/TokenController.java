package com.twilio.twiliotok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

	@Autowired
	private Token token;
	
	@Autowired
	private TokenGenerator tokenGenerator;
	
	@RequestMapping(value = "/demo", produces = "application/json", method = RequestMethod.GET)
	public String hello() {
		return "Rishabh";
	}
	
	@RequestMapping(value = "/token", produces = "application/json", method = RequestMethod.GET)
	public Token token(@RequestParam("identity") String identity) {
		
		System.out.println(identity);
		String TWILIO_ACCESS_TOKEN = tokenGenerator.generateToken(identity); 
		System.out.println(TWILIO_ACCESS_TOKEN);
		token.setTWILIO_ACCESS_TOKEN(TWILIO_ACCESS_TOKEN);
		
		return token;
	}
}
