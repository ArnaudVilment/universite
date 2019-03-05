package fr.vilment.universite.service;

import java.util.List;

import fr.vilment.universite.domain.Matiere;

public interface IMatiereService {

	public List<Matiere> selectAll();
	public Matiere selectOn(int id);
	public void deleteOne(int id);
	public void newMatiere(Matiere mat);
	public void editMatiere(Matiere mat);
	public List<Matiere> findAllByOrderByNom();
	public List<Matiere> findAllByOrderByNomDesc();
}
