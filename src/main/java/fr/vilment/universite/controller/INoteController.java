package fr.vilment.universite.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import fr.vilment.universite.domain.Note;

public interface INoteController {

	public String selectAllNote(Model model);
	public String getNote(Model model, int id);
	public String delNote(Model model, @PathVariable int id);
	public String newNote(Model model);
	public String newNote(Model model, Note pz);
	public String editNote(Model model, @PathVariable int id);
	public String getListNoteTrierAsc(Model model);
	public String getListNoteTrierDesc(Model model);
}
