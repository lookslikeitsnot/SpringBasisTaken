package be.vdab;

import java.util.List;

public class PersoonViewer {
	private boolean aantalKinderenTonen;

	public PersoonViewer(boolean aantalKinderenTonen) {
		this.aantalKinderenTonen = aantalKinderenTonen;
	}

	public void afbeelden(List<Persoon> personen) {
		for (Persoon persoon : personen) {
			System.out.println(persoon.getPersoonNr());
			System.out.println(persoon.getVoornaam());
			System.out.println(persoon.getFamilienaam());
			if (aantalKinderenTonen) {
				System.out.println(persoon.getAantalKinderen());
			}
		}
	}

	public void setAantalKinderenTonen(boolean aantalKinderenTonen) {
		this.aantalKinderenTonen = aantalKinderenTonen;
	}
}
