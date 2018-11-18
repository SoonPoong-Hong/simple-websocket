package com.parfait.study.simplewebsocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Profile("stomp")
@EnableWebSocketMessageBroker // => 이건 그냥 선언적인 것이므로 이렇게 텅빈 Configuration에 해도 상관없다.
@Configuration
public class StompWebSocketConfig2  {

}
