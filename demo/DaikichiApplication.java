package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping("daikichi/travel/{city}")
    public String vaca(@PathVariable("city") String city) {
    	return "Congratulations! You will soon travel to "+city+"!";
    }
    @RequestMapping("daikichi/lotto/{num}")
    public String lotto(@PathVariable("num") int num) {
    	if (num % 2 == 0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers.";
    	} else {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	}
    }
		
}
