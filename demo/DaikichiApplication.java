package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication

//1. annotation 
@RestController
public class DaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiApplication.class, args);
	}
    
    // 1. Annotation
    @RequestMapping("/daikichi")
    // 3. Method that maps to the request route above
    public String hello() { // 3
            return "Welcome!";
    }
    
    @RequestMapping("/daikichi/today")
    public String today() {
    	return "Today you will find luck in all your endeavors!";
    }
    @RequestMapping("/daikichi/tomorrow")
    public String tomorrow() {
    	return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
		
}
