package com.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.producer.service.MessageService;
import com.producer.service.MessageServiceCard;

@RestController
public class MessageControllerCard {

	@Autowired
	MessageServiceCard service;
	
	
	@PostMapping("/insertcard")
	public String send(@RequestBody String messagecard) {
		service.send(messagecard);		
		return messagecard;
			
	}	
	
	
}