package com.example.emos.wx.config;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public ConnectionFactory getFactory() {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("http://${ENV}");
        factory.setPort(5672);
        return factory;
    }

}
