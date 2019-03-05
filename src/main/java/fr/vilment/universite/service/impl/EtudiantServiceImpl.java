package fr.vilment.universite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.vilment.universite.domain.Etudiant;
import fr.vilment.universite.repository.IEtudiantRepository;
import fr.vilment.universite.service.IEtudiantService;

@Service
public class EtudiantServiceImpl implements IEtudiantService{

	@Autowired
	private IEtudiantRepository eR;
	
	@Override
	public List<Etudiant> selectAll() {
		// TODO Auto-generated method stub
		return eR.findAll();
	}

	@Override
	public Etudiant selectOn(int id) {
		// TODO Auto-generated method stub
		return eR.getOne(id);
	}

	@Override
	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		eR.deleteById(id);
	}

	@Override
	public void newEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		eR.save(etu);
	}

	@Override
	public void editEtudiant(Etudiant etu) {
		// TODO Auto-generated method stub
		eR.save(etu);
	}

	@Override
	public List<Etudiant> findAllByOrderByNom() {
		// TODO Auto-generated method stub
		return eR.findAllByOrderByNom();
	}

	@Override
	public List<Etudiant> findAllByOrderByNomDesc() {
		// TODO Auto-generated method stub
		return eR.findAllByOrderByNomDesc();
	}

}
