package fr.vilment.universite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.vilment.universite.domain.Enseignant;
import fr.vilment.universite.repository.IEnseignantRepository;
import fr.vilment.universite.service.IEnseignantService;

@Service
public class EnseignantServiceImpl implements IEnseignantService {

	@Autowired
	private IEnseignantRepository eR;

	@Override
	public List<Enseignant> selectAll() {
		// TODO Auto-generated method stub
		return eR.findAll();
	}

	@Override
	public Enseignant selectOn(int id) {
		// TODO Auto-generated method stub
		return eR.getOne(id);
	}

	@Override
	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		eR.deleteById(id);
	}

	@Override
	public void newEnseignant(Enseignant ens) {
		// TODO Auto-generated method stub
		eR.save(ens);
	}

	@Override
	public void editEnseignant(Enseignant ens) {
		// TODO Auto-generated method stub
		eR.save(ens);
	}
	
	@Override
	public List<Enseignant> findAllByOrderByNom() {
		// TODO Auto-generated method stub
		return eR.findAllByOrderByNom();
	}

	@Override
	public List<Enseignant> findAllByOrderByNomDesc() {
		// TODO Auto-generated method stub
		return eR.findAllByOrderByNomDesc();
	}
}
