//Customer Controller Page

package com.abc.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("cust")
public class CustomerController {
	@RequestMapping("customer")
	public String customerPage(Model m) {
		m.addAttribute("msg", "Welcome To Customer Page");
		return "customer";
	}
}
