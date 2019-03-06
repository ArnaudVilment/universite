package fr.vilment.universite.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.vilment.universite.controller.IEtudiantController;
import fr.vilment.universite.domain.Etudiant;
import fr.vilment.universite.service.impl.EtudiantServiceImpl;

@Controller
public class EtudiantControllerImpl implements IEtudiantController {

	// Logger
	Logger log = LoggerFactory.getLogger(EtudiantControllerImpl.class);
		
	@Autowired
	private EtudiantServiceImpl eS;
	
	@Override
	@GetMapping(path="/listEtudiant")
	public String selectAllEtudiant(Model model) {
		
		model.addAttribute("listEtudiant", eS.selectAll());
		return "etudiant/listEtudiant";
	}

	@Override
	@GetMapping(value = "/infoEtudiant/{id}")
	public String getEtudiant(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		model.addAttribute("etu", eS.selectOn(id));
		return "etudiant/infoEtudiant";
	}

	@Override
	@GetMapping(value = "/delEtudiant/{id}")
	public String delEtudiant(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		eS.deleteOne(id);
		return "redirect:/listEtudiant";
	}
	
	@Override
	@GetMapping(value = "/newEtudiant")
	public String newEtudiant(Model model) {
		// TODO Auto-generated method stub
		Etudiant etu = new Etudiant();
		model.addAttribute("etu", etu);
		return "etudiant/newEtudiant";
	}

	@Override
	@PostMapping(value = "/newEtudiant")
	public String newEtudiant(Model model, Etudiant etu) {
		// TODO Auto-generated method stub
		eS.newEtudiant(etu);
		return "redirect:/listEtudiant";
	}

	@Override
	@GetMapping(value = "/editEtudiant/{id}")
	public String editEtudiant(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		model.addAttribute("etu", eS.selectOn(id));
		return "etudiant/newEtudiant";
	}
	
	@Override
	@GetMapping(value = "/triEtudiantAsc")
	public String getListEtudiantTrierAsc(Model model) {
		
		model.addAttribute("listEtudiant", eS.findAllByOrderByNom());
		return "etudiant/listEtudiant";
	}
	
	@Override
	@GetMapping(value = "/triEtudiantDesc")
	public String getListEtudiantTrierDesc(Model model) {
		
		model.addAttribute("listEtudiant", eS.findAllByOrderByNomDesc());
		return "etudiant/listEtudiant";
	}
}
