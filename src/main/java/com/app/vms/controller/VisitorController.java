package com.app.vms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.vms.model.Visitor;
import com.app.vms.service.VisitorService;

@Controller
public class VisitorController {

	@Autowired
	private VisitorService visitorService;
	
	@PostMapping(value = "saveVisitor")
	public void saveVisitor() {
		Visitor visitor = new Visitor();
		visitor.setFirstName("Srinath");
		visitor.setLastName("Kondaveeti");
		visitorService.saveVisitor(visitor);
		}
	
	@GetMapping(value = "allVisitors")
	public void getAllVisitors() {
	List<Visitor> allVisitors = visitorService.getAllVisitors();
	for (Visitor visitor : allVisitors) {
		System.out.println(visitor.getFirstName());
		System.out.println(visitor.getLastName());
	}
	
	}
	
	@GetMapping(value = "/login")
    public String showLoginPage(ModelMap model){
        return "welcome";
    }
	
	
}
