package com.luv2code.springboot.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.mvc.entity.Uczen;
import com.luv2code.springboot.mvc.service.UczenService;


@Controller
@RequestMapping("/uczen")
public class UczenController {

	// need to inject our customer service
	@Autowired
	private UczenService uczenService;
	
	@GetMapping("/list")
	public String listUczen(Model theModel) {
		
		// get customers from the service
		List<Uczen> theUczen = uczenService.getUczens();
				
		// add the customers to the model
		theModel.addAttribute("uczens", theUczen);
		
		return "list-uczen";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Uczen theUczen = new Uczen();
		
		theModel.addAttribute("uczen", theUczen);
		
		return "customer-form";
	}
	
	@PostMapping("/saveUczen")
	public String saveUczen(@ModelAttribute("uczen") Uczen theUczen) {
		
		// save the customer using our service
		uczenService.saveUczen(theUczen);	
		
		return "redirect:/uczen/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("uczenId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Uczen theUczen = uczenService.getUczen(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("uczen", theUczen);
		
		// send over to our form		
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteUczen(@RequestParam("uczenId") int theId) {
		
		// delete the customer
		uczenService.deleteUczen(theId);
		
		return "redirect:/uczen/list";
	}
}










