package com.charter.ads.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class AdsController {

	@GetMapping("/test")
	public String testing() {
		return "Success";
	}
}
