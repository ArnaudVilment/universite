package fr.vilment.universite.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.vilment.universite.controller.IMatiereController;
import fr.vilment.universite.domain.Matiere;
import fr.vilment.universite.service.impl.MatiereServiceImpl;

@Controller
public class MatiereControllerImpl implements IMatiereController {

	// Logger
	Logger log = LoggerFactory.getLogger(MatiereControllerImpl.class);
	
	@Autowired
	private MatiereServiceImpl mS;
		
	@Override
	@GetMapping(path="/listMatiere")
	public String selectAllMatiere(Model model) {
		
		model.addAttribute("listMatiere", mS.selectAll());
		log.info("Taille de la liste des Matieres : " + mS.selectAll().size());
		return "/listMatiere";
	}
	
	@Override
	@GetMapping(value = "/infoMatiere/{id}")
	public String getMatiere(Model model, int id) {
		// TODO Auto-generated method stub
		model.addAttribute("mat", mS.selectOn(id));
		return "infoMatiere";
	}

	@Override
	@GetMapping(value = "/delMatiere/{id}")
	public String delMatiere(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		mS.deleteOne(id);
		return "redirect:/listMatiere";
	}
	
	@Override
	@GetMapping(value = "/newMatiere")
	public String newMatiere(Model model) {
		// TODO Auto-generated method stub
		Matiere mat = new Matiere();
		model.addAttribute("mat", mat);
		return "newMatiere";
	}

	@Override
	@PostMapping(value = "/newMatiere")
	public String newMatiere(Model model, Matiere mat) {
		// TODO Auto-generated method stub
		mS.newMatiere(mat);
		return "redirect:/listMatiere";
	}

	@Override
	@GetMapping(value = "/editMatiere/{id}")
	public String editMatiere(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		model.addAttribute("mat", mS.selectOn(id));
		return "newMatiere";
	}
	
	@Override
	@GetMapping(value = "/triMatiereAsc")
	public String getListMatiereTrierAsc(Model model) {
		
		model.addAttribute("listMatiere", mS.findAllByOrderByNom());
		return "listMatiere";
	}
	
	@Override
	@GetMapping(value = "/triMatiereDesc")
	public String getListMatiereTrierDesc(Model model) {
		
		model.addAttribute("listMatiere", mS.findAllByOrderByNomDesc());
		return "listMatiere";
	}
}
