package fr.vilment.universite.service;

import java.util.List;

import fr.vilment.universite.domain.Note;

public interface INoteService {

	public List<Note> selectAll();
	public Note selectOn(int id);
	public void deleteOne(int id);
	public void newNote(Note not);
	public void editNote(Note not);
	public List<Note> findAllByOrderByNote();
	public List<Note> findAllByOrderByNoteDesc();
}
