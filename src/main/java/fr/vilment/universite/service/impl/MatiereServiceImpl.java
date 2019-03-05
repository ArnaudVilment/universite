package fr.vilment.universite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.vilment.universite.domain.Matiere;
import fr.vilment.universite.repository.IMatiereRepository;
import fr.vilment.universite.service.IMatiereService;

@Service
public class MatiereServiceImpl implements IMatiereService {

	@Autowired
	private IMatiereRepository mR;
	
	@Override
	public List<Matiere> selectAll() {
		// TODO Auto-generated method stub
		return mR.findAll();
	}

	@Override
	public Matiere selectOn(int id) {
		// TODO Auto-generated method stub
		return mR.getOne(id);
	}

	@Override
	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		mR.deleteById(id);
	}

	@Override
	public void newMatiere(Matiere mat) {
		// TODO Auto-generated method stub
		mR.save(mat);
	}

	@Override
	public void editMatiere(Matiere mat) {
		// TODO Auto-generated method stub
		mR.save(mat);
	}

	@Override
	public List<Matiere> findAllByOrderByNom() {
		// TODO Auto-generated method stub
		return mR.findAllByOrderByNom();
	}

	@Override
	public List<Matiere> findAllByOrderByNomDesc() {
		// TODO Auto-generated method stub
		return mR.findAllByOrderByNomDesc();
	}

}
