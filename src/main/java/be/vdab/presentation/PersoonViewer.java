package be.vdab.presentation;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import be.vdab.Persoon;
import be.vdab.PersoonEigenschap;
import be.vdab.services.PersoonService;

@Component
public class PersoonViewer {
	private PersoonEigenschap[] eigenschappen;
	private final PersoonService persoonService;

	public PersoonViewer(PersoonEigenschap[] eigenschappen, PersoonService persoonService) {
		this.eigenschappen = eigenschappen;
		this.persoonService = persoonService;
	}

	public void afbeelden() {
		for (Persoon persoon : persoonService.findAll()) {
			if (Arrays.asList(eigenschappen).contains(PersoonEigenschap.PERSOON_NR))
				System.out.println(persoon.getPersoonNr());
			if (Arrays.asList(eigenschappen).contains(PersoonEigenschap.VOORNAAM))
				System.out.println(persoon.getVoornaam());
			if (Arrays.asList(eigenschappen).contains(PersoonEigenschap.FAMILIENAAM))
				System.out.println(persoon.getFamilienaam());
			if (Arrays.asList(eigenschappen).contains(PersoonEigenschap.AANTAL_KINDEREN))
				System.out.println(persoon.getAantalKinderen());
		}
	}
}
