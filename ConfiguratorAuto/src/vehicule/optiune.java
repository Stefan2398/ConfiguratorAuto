package vehicule;

public class optiune {

	private String nume;
	private Integer pret;

	public optiune(String nume, Integer pret) {
		super();
		this.nume = nume;
		this.pret = pret;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Integer getPret() {
		return pret;
	}

	public void setPret(Integer pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "\n" + "optiune " + getNume() + " " + getPret() + "$ ";
	}

}
