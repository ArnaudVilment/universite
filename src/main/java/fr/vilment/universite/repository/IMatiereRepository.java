package fr.vilment.universite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.vilment.universite.domain.Matiere;

@Repository
public interface IMatiereRepository extends JpaRepository<Matiere, Integer> {

	public List<Matiere> findAllByOrderByNom();
	public List<Matiere> findAllByOrderByNomDesc();

	@Query(value="select * from t_matiere where id_enseignant != :id_enseignant or id_enseignant is null", nativeQuery=true)
	public List<Matiere> findAllNonEns(@Param("id_enseignant") int id_enseignant);
	
	@Query(value="select * from t_matiere where id = :id_matiere", nativeQuery=true)
	public List<Matiere> findAllByIdMatiere(@Param("id_matiere") int id_matiere);
	
	@Query(value="select * from t_matiere where nom like :nom%", nativeQuery=true)
	public List<Matiere> findMatiereByNom(@Param("nom") String nom);
}
