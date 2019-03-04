package fr.vilment.universite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.vilment.universite.domain.Etudiant;
import fr.vilment.universite.repository.EtudiantRepository;
import fr.vilment.universite.service.IEtudiantService;

@Service
public class EtudiantServiceImpl implements IEtudiantService{

	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Override
	public List<Etudiant> selectAll() {
		// TODO Auto-generated method stub
		return etudiantRepository.findAll();
	}

	@Override
	public Etudiant selectOn(int id) {
		// TODO Auto-generated method stub
		return etudiantRepository.getOne(id);
	}

	@Override
	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		etudiantRepository.deleteById(id);
	}

	@Override
	public void newEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

}
