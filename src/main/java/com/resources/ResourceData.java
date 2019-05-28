package com.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class ResourceData {
	
	
	@GetMapping
	public String getResources()
	{
		return "resources";
	}
}
