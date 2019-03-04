package fr.vilment.universite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.vilment.universite.service.impl.ProfesseurServiceImpl;

@Controller
public class ProfesseurController {

	@Autowired
	private ProfesseurServiceImpl professeurService;
	
	@GetMapping(path="/listProfesseur")
	public String selectAllProfesseur(Model model) {
		
		model.addAttribute("listProfesseur", professeurService.selectAll());
		return "/listProfesseur";
	}
}
