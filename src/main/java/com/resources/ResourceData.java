package com.resources;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class ResourceData {
	
	
	@GetMapping
	public String getResources(@AuthenticationPrincipal final UserDetails userDetails)
	{
		String userName = userDetails.getUsername();
		System.out.println(userName);
		return "resources";
	}
}
