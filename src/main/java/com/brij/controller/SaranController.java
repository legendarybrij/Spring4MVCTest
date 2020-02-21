package com.brij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/")
public class SaranController {
	@RequestMapping(method = RequestMethod.GET)
	public String displaySaran(ModelMap model) {
		model.addAttribute("greeting", "This is from Saran");
		return "welcome";
	}
	@RequestMapping(value = "/rioh", method = RequestMethod.GET)
	public String displayRioh(ModelMap model) {
		model.addAttribute("greeting", "This is from Rioh");
		return "welcome";
	}
//	@RequestMapping(value = "/brij", method = RequestMethod.GET)
//	public String displayBrij(ModelMap model) {
//		model.addAttribute("greeting", "This is from Brij");
//		return "welcome";
//	}
//	@RequestMapping(value = "/moath", method = RequestMethod.GET)
//	public String displayMoah(ModelMap model) {
//		model.addAttribute("greeting", "This is from Moath");
//		return "welcome";
//	}
}