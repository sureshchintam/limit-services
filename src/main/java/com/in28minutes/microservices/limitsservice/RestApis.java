package com.in28minutes.microservices.limitsservice;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api")
public class RestApis {

	@RequestMapping(value="testing",method=RequestMethod.GET,produces=MediaType.TEXT_PLAIN_VALUE)
	public String testing()
	{
		return "Hello Restful webservices";
		
		
	}
	
}
