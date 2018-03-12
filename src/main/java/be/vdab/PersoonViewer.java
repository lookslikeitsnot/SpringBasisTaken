package be.vdab;

import java.util.List;

public class PersoonViewer {
	PersoonEigenschap[] eigenschappen;

	public PersoonViewer(PersoonEigenschap[] eigenschappen) {
		this.eigenschappen = eigenschappen;
	}

	public void afbeelden(List<Persoon> personen) {
		for (Persoon persoon : personen) {
			System.out.println(persoon.getPersoonNr());
			System.out.println(persoon.getVoornaam());
			System.out.println(persoon.getFamilienaam());
			System.out.println(persoon.getAantalKinderen());
		}
	}
}
