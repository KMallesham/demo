package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish")
public class Wish {

	@GetMapping("/msg")
		public String greatMsg() {
			return "Hello mallesham";
		
	}
}
