package vehicule;

public class anvelopa {

	private String nume;
	private Integer latime;
	private Integer inaltime;
	private Integer diamteru;

	public anvelopa(String nume, Integer latime, Integer inaltime, Integer diamteru) {
		super();
		this.nume = nume;
		this.latime = latime;
		this.inaltime = inaltime;
		this.diamteru = diamteru;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Integer getLatime() {
		return latime;
	}

	public void setLatime(Integer latime) {
		this.latime = latime;
	}

	public Integer getInaltime() {
		return inaltime;
	}

	public void setInaltime(Integer inaltime) {
		this.inaltime = inaltime;
	}

	public Integer getDiamteru() {
		return diamteru;
	}

	public void setDiamteru(Integer diamteru) {
		this.diamteru = diamteru;
	}

}
