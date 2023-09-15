package com.npavlicek.SpringDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecretController {
	@GetMapping("/secret")
	public String getSecret() {
		return "/index.html";
	}
}
