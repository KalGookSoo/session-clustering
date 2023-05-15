package com.kalgooksoo.sessionclusteringsecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class SessionClusteringSecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionClusteringSecondApplication.class, args);
	}

	@RestController
	public static class SessionController {

		@GetMapping("/session")
		public String getSessionId(HttpServletRequest request) {
			return request.getSession().getId();
		}
	}

}
