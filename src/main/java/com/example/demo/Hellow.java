package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hellow {

	@RequestMapping("/")
	public void hello( HttpServletResponse response ) throws IOException {

		response.getWriter().print("test111s");
	}
}
