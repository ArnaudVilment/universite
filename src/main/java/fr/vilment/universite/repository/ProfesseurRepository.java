package fr.vilment.universite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.vilment.universite.domain.Professeur;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Integer> {

}
