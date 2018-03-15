package be.vdab.repositories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import be.vdab.Persoon;

public class PersoonRepositoryCSV implements PersoonRepository {
	private final Path path;

	public PersoonRepositoryCSV(String path) {
		this.path = Paths.get(path);
	}

	public List<Persoon> findAll() {
		List<Persoon> personen = new ArrayList<>();
		if (path.toFile().exists()) {
			try (Stream<String> stream = Files.lines(path)) {
				stream.forEach(lijn -> personen.add(new Persoon(
						Integer.parseInt(lijn.split(",")[0]), 
						lijn.split(",")[1], 
						lijn.split(",")[2], 
						Integer.parseInt(lijn.split(",")[3]
				))));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			throw new IllegalArgumentException();
		}
		return personen;
	}
}
