package fr.vilment.universite.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.vilment.universite.controller.IEnseignantController;
import fr.vilment.universite.domain.Enseignant;
import fr.vilment.universite.service.impl.EnseignantServiceImpl;

@Controller
public class EnseignantControllerImpl implements IEnseignantController {

	// Logger
	Logger log = LoggerFactory.getLogger(EnseignantControllerImpl.class);
	
	@Autowired
	private EnseignantServiceImpl eS;
	
	@Override
	@GetMapping(path="/listEnseignant")
	public String selectAllEnseignant(Model model) {
		
		model.addAttribute("listEnseignant", eS.selectAll());
		log.info("Taille de la liste des enseignants : " + eS.selectAll().size());
		return "/listEnseignant";
	}
	
	@Override
	@GetMapping(value = "/infoEnseignant/{id}")
	public String getEnseignant(Model model, int id) {
		// TODO Auto-generated method stub
		model.addAttribute("ens", eS.selectOn(id));
		return "infoEnseignant";
	}

	@Override
	@GetMapping(value = "/delEnseignant/{id}")
	public String delEnseignant(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		eS.deleteOne(id);
		return "redirect:/listEnseignant";
	}
	
	@Override
	@GetMapping(value = "/newEnseignant")
	public String newEnseignant(Model model) {
		// TODO Auto-generated method stub
		Enseignant ens = new Enseignant();
		model.addAttribute("ens", ens);
		return "newEnseignant";
	}

	@Override
	@PostMapping(value = "/newEnseignant")
	public String newEnseignant(Model model, Enseignant ens) {
		// TODO Auto-generated method stub
		eS.newEnseignant(ens);
		return "redirect:/listEnseignant";
	}

	@Override
	@GetMapping(value = "/editEnseignant/{id}")
	public String editEnseignant(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		model.addAttribute("ens", eS.selectOn(id));
		return "newEnseignant";
	}
	
	@Override
	@GetMapping(value = "/triEnseignantAsc")
	public String getListEnseignantTrierAsc(Model model) {
		
		model.addAttribute("listEnseignant", eS.findAllByOrderByNom());
		return "listEnseignant";
	}
	
	@Override
	@GetMapping(value = "/triEnseignantDesc")
	public String getListEnseignantTrierDesc(Model model) {
		
		model.addAttribute("listEnseignant", eS.findAllByOrderByNomDesc());
		return "listEnseignant";
	}
}
