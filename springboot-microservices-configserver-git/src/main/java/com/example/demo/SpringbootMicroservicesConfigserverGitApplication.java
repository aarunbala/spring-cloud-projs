package com.example.demo;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootMicroservicesConfigserverGitApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringbootMicroservicesConfigserverGitApplication.class, args);
		System.out.println("Hello "+Cipher.getMaxAllowedKeyLength("AES"));
	}
}
