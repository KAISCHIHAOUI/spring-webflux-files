package com.assist.webflux.file;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assist.webflux.file.service.FileStorageService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class SpringWebfluxFiles implements CommandLineRunner {

  @Resource
  FileStorageService storageService;

  public static void main(String[] args) {
    SpringApplication.run(SpringWebfluxFiles.class, args);
  }

  @Override
  public void run(String... arg) throws Exception {
    storageService.init();
  }
}
