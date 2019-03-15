package fr.vilment.universite.service;

import java.util.List;

import fr.vilment.universite.domain.Note;
import fr.vilment.universite.domain.NotePK;

public interface INoteService {

	public List<Note> selectAll();
	public Note findOn(int id_etudiant, int id_matiere);
	public void deleteOne(Note note);
	public Note newNote(Note not);
	public void editNote(Note not);
	public List<Note> findAllByOrderByNote();
	public List<Note> findAllByOrderByNoteDesc();
}
