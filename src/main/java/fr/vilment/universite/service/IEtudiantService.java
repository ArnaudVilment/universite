package fr.vilment.universite.service;

import java.util.List;

import fr.vilment.universite.domain.Etudiant;

public interface IEtudiantService {

	public List<Etudiant> selectAll();
	public Etudiant selectOn(int id);
	public void deleteOne(int id);
	public void newEtudiant(Etudiant etudiant);
	public void editEtudiant(Etudiant etudiant);
}
