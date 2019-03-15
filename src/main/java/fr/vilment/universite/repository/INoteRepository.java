package fr.vilment.universite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.vilment.universite.domain.Note;
import fr.vilment.universite.domain.NotePK;

@Repository
public interface INoteRepository extends JpaRepository<Note, NotePK> {

	public List<Note> findAllByOrderByNote();
	public List<Note> findAllByOrderByNoteDesc();
}
