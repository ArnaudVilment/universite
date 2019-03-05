package fr.vilment.universite.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.vilment.universite.controller.IEnseignantController;
import fr.vilment.universite.service.impl.EnseignantServiceImpl;

@Controller
public class EnseignantControllerImpl implements IEnseignantController {

	// Logger
	Logger log = LoggerFactory.getLogger(EnseignantControllerImpl.class);
	
	@Autowired
	private EnseignantServiceImpl pS;
	
	@GetMapping(path="/listEnseignant")
	public String selectAllProfesseur(Model model) {
		
		model.addAttribute("listEnseignant", pS.selectAll());
		log.info("Taille de la liste des enseignants : " + pS.selectAll().size());
		return "/listEnseignant";
	}
}
