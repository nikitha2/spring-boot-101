package com.microservices.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		Course[] listOfCourses = {
				new Course(1, "Learn AWS", "MicroServices101"),
				new Course(2, "Learn DevOps", "MicroServices101"),
				new Course(3, "Learn Spreing boot", "MicroServices101"),
				new Course(4, "Learn Spreing boot", "MicroServices105")
		};
		
		
		return (List<Course>) Arrays.asList(listOfCourses);
	}
}
