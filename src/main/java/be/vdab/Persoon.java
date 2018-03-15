package be.vdab;

public class Persoon {
	private int persoonNr;
	private String voornaam;
	private String familienaam;
	private int aantalKinderen;
	
	public Persoon(int persoonNr, String voornaam, String familienaam, int aantalKinderen) {
		this.persoonNr = persoonNr;
		this.voornaam = voornaam;
		this.familienaam = familienaam;
		this.aantalKinderen = aantalKinderen;
	}
	public int getPersoonNr() {
		return persoonNr;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public String getFamilienaam() {
		return familienaam;
	}
	public int getAantalKinderen() {
		return aantalKinderen;
	}
	
	@Override
	public String toString() {
		return persoonNr + ". " + voornaam + " " + familienaam + " heeft " + aantalKinderen + " kinderen.";
	}
}
