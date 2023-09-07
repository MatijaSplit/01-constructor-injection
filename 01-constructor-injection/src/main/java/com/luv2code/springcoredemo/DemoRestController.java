package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	// define private field for the dependeny
	private Coach myCoach;
	
	//define constructor for the dependency injectionm
	
	@Autowired
	public DemoRestController(Coach theCoach){
		myCoach=theCoach;
	}
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}

}
