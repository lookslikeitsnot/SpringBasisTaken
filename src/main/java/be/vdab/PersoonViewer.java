package be.vdab;

import java.util.Arrays;
import java.util.List;

public class PersoonViewer {
	PersoonEigenschap[] eigenschappen;

	public PersoonViewer(PersoonEigenschap[] eigenschappen) {
		this.eigenschappen = eigenschappen;
	}

	public void afbeelden(List<Persoon> personen) {
		for (Persoon persoon : personen) {
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
