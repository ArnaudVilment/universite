package fr.vilment.universite.service;

import java.util.List;

import fr.vilment.universite.domain.Professeur;

public interface IProfesseurService {

	public List<Professeur> selectAll();
	public Professeur selectOn(int id);
	public void deleteOne(int id);
	public void newProfesseur(Professeur professeur);
	public void editProfesseur(Professeur professeur);
}
