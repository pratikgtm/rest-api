package com.practice.code.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by p0g00b8 on 18/04/19
 */
@SpringBootApplication(scanBasePackages = {"com.practice.code"})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
