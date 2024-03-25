package com.producer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;


@Service
public class MessageServiceCard {
	
	@Autowired
	JmsTemplate jms;

	public void send(String messagecard){

		jms.convertAndSend("Insert.Card::Insert.Card", messagecard);
	}

}
