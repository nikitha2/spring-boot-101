package com.microservices.springboot.learnspringbootv2.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {
	// @Autowired
	// HelloWorldBean helloWorldBean;

	// localhost:8080/hello-world
	@GetMapping(path = "/hello-world") // Can also use @RequestMapping(method = RequestMethod.GET, path=
										// "/hello-world")
	public String[] retriveHelloWorld() {

		String[] hw = { "Hello world", "HELLO WORLD" };

		return hw;
	}

	// localhost:8080/hello-world-bean
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean[] retriveHelloWorldBean() {

		// helloWorldBean.setMessage("Hello world");
		HelloWorldBean[] hwBean = { new HelloWorldBean("Hello world"), new HelloWorldBean("HELLO WORLD") };

		return hwBean;
	}
	
	// localhost:8080/hello-world/{name}
		@GetMapping(path = "/hello-world/path-variable/{name}")
		public HelloWorldBean[] retriveHelloWorldPathVariable(@PathVariable String name) {

			// helloWorldBean.setMessage("Hello world");
			HelloWorldBean[] hwBean = { new HelloWorldBean(String.format("Hello world, %s", name)), 
					                    new HelloWorldBean("HELLO WORLD") };

			return hwBean;
		}

}
