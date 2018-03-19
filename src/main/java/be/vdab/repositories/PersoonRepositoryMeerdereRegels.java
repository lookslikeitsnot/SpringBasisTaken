package be.vdab.repositories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import be.vdab.Persoon;

@Component
@Qualifier("TXT")
public class PersoonRepositoryMeerdereRegels implements PersoonRepository {
	private final Path path;

	public PersoonRepositoryMeerdereRegels(@Value("${persoonTXT}")  String path) {
		this.path = Paths.get(path);
	}

	public List<Persoon> findAll(){
		List<Persoon> personen = new ArrayList<>();
		if(path.toFile().exists()) {
			try {
				List<String> lijnen = Files.lines(path).collect(Collectors.toList());
				for(int i = 0; i<lijnen.size();i+=4) {
					personen.add(
							new Persoon(
									Integer.parseInt(lijnen.get(i)), 
									lijnen.get(i+1), 
									lijnen.get(i+2), 
									Integer.parseInt(lijnen.get(i+3))));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		} else {
			throw new IllegalArgumentException();
		}
		
		return personen;
	}
}
