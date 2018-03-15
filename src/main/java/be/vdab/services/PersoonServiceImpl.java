package be.vdab.services;

import java.util.List;

import be.vdab.Persoon;
import be.vdab.repositories.PersoonRepository;

public class PersoonServiceImpl implements PersoonService {
	private final PersoonRepository persoonRepository;
	
	public PersoonServiceImpl(PersoonRepository persoonRepository) {
		this.persoonRepository = persoonRepository;
	}
	
	@Override
	public List<Persoon> findAll() {
		return persoonRepository.findAll();
	}
	
}
