package fr.vilment.universite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.vilment.universite.domain.Enseignant;

@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant, Integer> {

}
