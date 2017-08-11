package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {
	
	@Value("${toll.rates}")
	String rate;
	@Value("${toll.gates}")
	String gates;
	@Value("${toll.start}")
	String tollStart;
	
	@RequestMapping("/rate")
	public String getRate(Model m) {
		m.addAttribute("rate", rate);
		m.addAttribute("gates", gates);
		m.addAttribute("tollstart", tollStart);
		
		return "rateView";
	}
}
