package fr.vilment.universite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.vilment.universite.domain.Note;
import fr.vilment.universite.repository.INoteRepository;
import fr.vilment.universite.service.INoteService;

@Service
public class NoteServiceImpl implements INoteService {

	@Autowired
	private INoteRepository nR;
	
	@Override
	public List<Note> selectAll() {
		// TODO Auto-generated method stub
		return nR.findAll();
	}

	@Override
	public Note selectOn(int id) {
		// TODO Auto-generated method stub
		return nR.getOne(id);
	}

	@Override
	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		nR.deleteById(id);
	}

	@Override
	public void newNote(Note not) {
		// TODO Auto-generated method stub
		nR.save(not);
	}

	@Override
	public void editNote(Note not) {
		// TODO Auto-generated method stub
		nR.save(not);
	}

	@Override
	public List<Note> findAllByOrderByNote() {
		// TODO Auto-generated method stub
		return nR.findAllByOrderByNote();
	}

	@Override
	public List<Note> findAllByOrderByNoteDesc() {
		// TODO Auto-generated method stub
		return nR.findAllByOrderByNoteDesc();
	}

}
