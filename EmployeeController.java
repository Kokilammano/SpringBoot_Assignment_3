//Employee Controller Page

package com.abc.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("employ")
public class EmployeeController {
	@RequestMapping("employee")
	public String employeeMsg(Model m) {
		m.addAttribute("msg", "Welcome to Employee Page");
		return "employee";
	}
}
