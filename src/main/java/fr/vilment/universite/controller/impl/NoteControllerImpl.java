package fr.vilment.universite.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.vilment.universite.controller.INoteController;
import fr.vilment.universite.domain.Note;
import fr.vilment.universite.service.impl.NoteServiceImpl;

public class NoteControllerImpl implements INoteController {

	// Logger
	Logger log = LoggerFactory.getLogger(NoteControllerImpl.class);
	
	@Autowired
	private NoteServiceImpl nS;
		
	@Override
	@GetMapping(path="/listNote")
	public String selectAllNote(Model model) {
		
		model.addAttribute("listNote", nS.selectAll());
		log.info("Taille de la liste des Notes : " + nS.selectAll().size());
		return "/listNote";
	}
	
	@Override
	@GetMapping(value = "/infoNote/{id}")
	public String getNote(Model model, int id) {
		// TODO Auto-generated method stub
		model.addAttribute("not", nS.selectOn(id));
		return "infoNote";
	}

	@Override
	@GetMapping(value = "/delNote/{id}")
	public String delNote(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		nS.deleteOne(id);
		return "redirect:/listNote";
	}
	
	@Override
	@GetMapping(value = "/newNote")
	public String newNote(Model model) {
		// TODO Auto-generated method stub
		Note not = new Note();
		model.addAttribute("not", not);
		return "newNote";
	}

	@Override
	@PostMapping(value = "/newNote")
	public String newNote(Model model, Note not) {
		// TODO Auto-generated method stub
		nS.newNote(not);
		return "redirect:/listNote";
	}

	@Override
	@GetMapping(value = "/editNote/{id}")
	public String editNote(Model model, @PathVariable int id) {
		// TODO Auto-generated method stub
		model.addAttribute("not", nS.selectOn(id));
		return "newNote";
	}
	
	@Override
	@GetMapping(value = "/triNoteAsc")
	public String getListNoteTrierAsc(Model model) {
		
		model.addAttribute("listNote", nS.findAllByOrderByNote());
		return "listNote";
	}
	
	@Override
	@GetMapping(value = "/triNoteDesc")
	public String getListNoteTrierDesc(Model model) {
		
		model.addAttribute("listNote", nS.findAllByOrderByNoteDesc());
		return "listNote";
	}
}
