package com.gestionLivraison.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionLivraison.model.Commande;


@Controller
@RequestMapping("/Employee")
public class EmployeeController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/")
	public String homeEmployee() {
		return"employee/home-Employee";
	}
	
	@RequestMapping("/RechercherCommande")
	public String EmployeeRechercherCommande() {
		return"employee/rechercherCommande";
	}
	
	@RequestMapping("/formAjouterCommande")
	public String EmployeeFormAjouterCommande(Model theModel) { 
	
	   //Create new model 
	Commande theCommande = new Commande();
	  // add commande object to the model
	theModel.addAttribute("commande",theCommande);
		
		return"employee/form-ajouterCommande";
	}
	
	
	@RequestMapping("/processAjouterCommande")
	public String EmployeeProcessAjouterCommande(
			@Valid @ModelAttribute("commande")Commande theCommande,
			BindingResult theBindingResult) {
		//log the input data 
		
		System.out.println("the Commande " +theCommande.getCodeProduit());
		if(theBindingResult.hasErrors()) {
			return "employee/form-ajouterCommande";
		}
		else {
			return "employee/employee-confirmation";
		}
	}
	
	
	@RequestMapping("/InfluencerProfile")
	public String EmployeeInfluencerProfile() {
		return"employee/influencer-profile";
	}
	

	
}
