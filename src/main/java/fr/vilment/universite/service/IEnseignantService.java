package fr.vilment.universite.service;

import java.util.List;

import fr.vilment.universite.domain.Enseignant;

public interface IEnseignantService {

	public List<Enseignant> selectAll();
	public Enseignant selectOn(int id);
	public void deleteOne(int id);
	public void newEnseignant(Enseignant ens);
	public void editEnseignant(Enseignant ens);
	public List<Enseignant> findAllByOrderByNom();
	public List<Enseignant> findAllByOrderByNomDesc();
}
