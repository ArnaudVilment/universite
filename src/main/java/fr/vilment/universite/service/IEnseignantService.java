package fr.vilment.universite.service;

import java.util.List;

import fr.vilment.universite.domain.Enseignant;

public interface IEnseignantService {

	public List<Enseignant> selectAll();
	public Enseignant selectOn(int id);
	public void deleteOne(int id);
	public Enseignant newEnseignant(Enseignant ens);
	public void editEnseignant(Enseignant ens);
	public List<Enseignant> findAllByOrderByNom();
	public List<Enseignant> findAllByOrderByNomDesc();
	
	public List<Enseignant> checkPhoto(List<Enseignant> lE);
	public Enseignant checkPhoto(Enseignant lE);
	
	public List<Enseignant> findEnseignantByNom(String nom);
}
