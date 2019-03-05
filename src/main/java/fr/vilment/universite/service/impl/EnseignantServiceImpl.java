package fr.vilment.universite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.vilment.universite.domain.Enseignant;
import fr.vilment.universite.repository.EnseignantRepository;
import fr.vilment.universite.service.IEnseignantService;

@Service
public class EnseignantServiceImpl implements IEnseignantService {

	@Autowired
	private EnseignantRepository pR;

	@Override
	public List<Enseignant> selectAll() {
		// TODO Auto-generated method stub
		return pR.findAll();
	}

	@Override
	public Enseignant selectOn(int id) {
		// TODO Auto-generated method stub
		return pR.getOne(id);
	}

	@Override
	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		pR.deleteById(id);
	}

	@Override
	public void newProfesseur(Enseignant professeur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfesseur(Enseignant professeur) {
		// TODO Auto-generated method stub
		
	}
}
