package com.info.jwt.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubMergeDemo1Application {


	
  private Integer nameId = 23 ;
	private Integer mergeId = 2345678;
	private String merge = "merge demo" ;

	public static void main(String[] args) {
		System.out.println("i am in dear");
		List<Integer> asList = Arrays.asList(1,2,3,4,6,7,5);
		List<Integer> collect = asList.stream().distinct().collect(Collectors.toList());
		System.out.println("collect list :"+collect);
		SpringApplication.run(GitHubMergeDemo1Application.class, args);
	}

}
