package com.producer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;


@Service
public class MessageService {
	
	@Autowired
	JmsTemplate jms;

	public void send(String messageaddr){

		jms.convertAndSend("Insert.Addr::Insert.Addr", messageaddr);
	}

}
