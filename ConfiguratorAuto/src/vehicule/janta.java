package vehicule;

public class janta {

	private String nume;
	private String culoare;
	private Integer dimensiune;

	public janta(String nume, String culoare, Integer dimensiune) {
		super();
		this.nume = nume;
		this.culoare = culoare;
		this.dimensiune = dimensiune;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public Integer getDimensiune() {
		return dimensiune;
	}

	public void setDimensiune(Integer dimensiune) {
		this.dimensiune = dimensiune;
	}

	@Override
	public String toString() {
		return ",janta " + nume + ", culoarea " + culoare + ", dimensiunea de " + dimensiune;
	}

}
