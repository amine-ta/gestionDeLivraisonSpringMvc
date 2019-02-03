package com.gestionLivraison.spring.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String Index() {
		return"Index";
	}
	
	@RequestMapping("/mainDashboard")
	public String adminDashBord() {
		return"dashboard-main";
	}
	
}
