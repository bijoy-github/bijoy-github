package com.example.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
	
	@RequestMapping(value="/healthCheck" ,method=RequestMethod.GET)
	@ResponseBody
	public String healthCheck() {
		return "OK";
		
	}

}
