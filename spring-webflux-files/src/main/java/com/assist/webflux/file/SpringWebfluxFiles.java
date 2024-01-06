package com.assist.webflux.file;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.assist.webflux.file.service.FileStorageService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class SpringWebfluxFiles{

  @Resource
  FileStorageService storageService;

  public static void main(String[] args) {
    SpringApplication.run(SpringWebfluxFiles.class, args);
  }

  public CommandLineRunner initRunnner()
  {
	  return args -> {this.storageService.init();};
  }
  
	/*@Override
	  public void run(String... arg) throws Exception {
	  storageService.init(); }
	 */
}
