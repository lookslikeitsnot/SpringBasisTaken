package be.vdab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;

import be.vdab.Persoon;
import be.vdab.repositories.PersoonRepository;

//@Service
class PersoonServiceImpl implements PersoonService {
	private final PersoonRepository persoonRepository;
	
	PersoonServiceImpl(@Qualifier("TXT") PersoonRepository persoonRepository) {
		this.persoonRepository = persoonRepository;
	}
	
	@Override
	public List<Persoon> findAll() {
		return persoonRepository.findAll();
	}
	
}
