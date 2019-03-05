package fr.vilment.universite.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import fr.vilment.universite.domain.Matiere;

public interface IMatiereController {

	public String selectAllMatiere(Model model);
	public String getMatiere(Model model, int id);
	public String delMatiere(Model model, @PathVariable int id);
	public String newMatiere(Model model);
	public String newMatiere(Model model, Matiere pz);
	public String editMatiere(Model model, @PathVariable int id);
	public String getListMatiereTrierAsc(Model model);
	public String getListMatiereTrierDesc(Model model);
}
