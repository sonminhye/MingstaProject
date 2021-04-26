package com.mingsta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MingstagramApiController {
	
	@GetMapping(value="/hello")
	public String mingstagram() {
		return "minsta start";
	}
}
