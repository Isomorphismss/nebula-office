package com.example.emos.wx.task;

import com.example.emos.wx.service.MessageService;
import com.rabbitmq.client.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageTask {

    @Autowired
    private ConnectionFactory factory;

    @Autowired
    private MessageService messageService;

}
