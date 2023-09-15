package com.npavlicek.SpringDemo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.WebAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
	@GetMapping("/login")
	public String getLoginPage() {
		System.out.println("On login page");
		return "/index.html";
	}

	@PostMapping("/error")
	public void printError(HttpServletRequest req) {
		HttpSession session = req.getSession();
		AuthenticationException exception = (AuthenticationException) session.getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
		System.out.println(exception.getMessage());
	}
}
