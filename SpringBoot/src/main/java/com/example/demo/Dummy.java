package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Dummy {

	@RequestMapping(value="/dummy", method=RequestMethod.GET)
	public @ResponseBody String echoServer(@RequestParam("text") String PARAM1){	
		return PARAM1;
	}
	
}
