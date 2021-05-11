package com.info.jwt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubMergeDemo1Application {

	private String merge = "merge demo" ;
	
	public static void main(String[] args) {
		System.out.println("i am in dear");
		SpringApplication.run(GitHubMergeDemo1Application.class, args);
	}

}
