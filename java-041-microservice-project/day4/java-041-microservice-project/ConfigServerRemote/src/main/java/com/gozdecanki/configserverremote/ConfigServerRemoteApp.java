package com.gozdecanki.configserverremote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerRemoteApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerRemoteApp.class, args);
	}

}
