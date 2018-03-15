package be.vdab.repositories;

import java.util.List;

import be.vdab.Persoon;

public interface PersoonRepository {
	List<Persoon> findAll();
}
