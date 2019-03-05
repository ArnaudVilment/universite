package fr.vilment.universite.service;

import java.util.List;

import fr.vilment.universite.domain.Enseignant;
import fr.vilment.universite.domain.Etudiant;

public interface IEtudiantService {

	public List<Etudiant> selectAll();
	public Etudiant selectOn(int id);
	public void deleteOne(int id);
	public void newEtudiant(Etudiant etu);
	public void editEtudiant(Etudiant etu);
	public List<Etudiant> findAllByOrderByNom();
	public List<Etudiant> findAllByOrderByNomDesc();
}
