package com.app.vms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.vms.model.Visitor;
import com.app.vms.service.VisitorService;

@Controller
public class VisitorController {

	@Autowired
	private VisitorService visitorService;
	
	@PostMapping(value = "/saveVisitor")
	public String saveVisitor(ModelMap model, @ModelAttribute("visitor")Visitor visitor) {
		List<Visitor> allVisitors = visitorService.getAllVisitors();
		model.addAttribute("allVisitors", allVisitors);
		visitorService.saveVisitor(visitor);
		return "welcome";
		}
	
	@GetMapping(value = "/allVisitors")
	public String getAllVisitors(ModelMap model) {
	List<Visitor> allVisitors = visitorService.getAllVisitors();
	model.addAttribute("allVisitors", allVisitors);
	return "displayvisitors";
	}
	
	@GetMapping(value = "/login")
    public String showLoginPage(ModelMap model){
        return "welcome";
    }
	
	
}
