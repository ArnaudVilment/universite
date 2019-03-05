package fr.vilment.universite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.vilment.universite.domain.Enseignant;
import fr.vilment.universite.domain.Matiere;

@Repository
public interface IMatiereRepository extends JpaRepository<Matiere, Integer> {

	public List<Matiere> findAllByOrderByNom();
	public List<Matiere> findAllByOrderByNomDesc();
}
