package fr.vilment.universite.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.vilment.universite.controller.IEtudiantController;
import fr.vilment.universite.service.impl.EtudiantServiceImpl;

@Controller
public class EtudiantControllerImpl implements IEtudiantController {

	@Autowired
	private EtudiantServiceImpl eS;
	
	@GetMapping(path="/listEtudiant")
	public String selectAllEtudiant(Model model) {
		
		model.addAttribute("listEtudiant", eS.selectAll());
		return "/listEtudiant";
	}
}
