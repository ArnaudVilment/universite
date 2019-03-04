package fr.vilment.universite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.vilment.universite.service.impl.EtudiantServiceImpl;

@Controller
public class EtudiantController {

	@Autowired
	private EtudiantServiceImpl etudiantService;
	
	@GetMapping(path="/listEtudiant")
	public String selectAllEtudiant(Model model) {
		
		model.addAttribute("listEtudiant", etudiantService.selectAll());
		return "/listEtudiant";
	}
}
