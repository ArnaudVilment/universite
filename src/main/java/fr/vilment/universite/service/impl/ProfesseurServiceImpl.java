package fr.vilment.universite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.vilment.universite.domain.Professeur;
import fr.vilment.universite.repository.ProfesseurRepository;
import fr.vilment.universite.service.IProfesseurService;

@Service
public class ProfesseurServiceImpl implements IProfesseurService {

	@Autowired
	private ProfesseurRepository professeurRepository;

	@Override
	public List<Professeur> selectAll() {
		// TODO Auto-generated method stub
		return professeurRepository.findAll();
	}

	@Override
	public Professeur selectOn(int id) {
		// TODO Auto-generated method stub
		return professeurRepository.getOne(id);
	}

	@Override
	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		professeurRepository.deleteById(id);
	}

	@Override
	public void newProfesseur(Professeur professeur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfesseur(Professeur professeur) {
		// TODO Auto-generated method stub
		
	}
}
