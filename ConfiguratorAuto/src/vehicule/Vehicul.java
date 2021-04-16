package vehicule;

public class Vehicul {
	private String culoare;
	private Integer motor;
	private String brand;
	private String tip;
	private String model;
	private Integer putere;
	private Integer pret;

	public Vehicul(String culoare, Integer motor, String brand, String tip, String model, Integer putere,
			Integer pret) {
		this.culoare = culoare;
		this.motor = motor;
		this.brand = brand;
		this.tip = tip;
		this.model = model;
		this.putere = putere;
		this.pret = pret;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public Integer getMotor() {
		return motor;
	}

	public void setMotor(Integer motor) {
		this.motor = motor;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getPutere() {
		return putere;
	}

	public void setPutere(Integer putere) {
		this.putere = putere;
	}

	public Integer getPret() {
		return pret;
	}

	public void setPret(Integer pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "Vehicul [culoare=" + culoare + ", motor=" + motor + ", brand=" + brand + ", tip=" + tip + ", model="
				+ model + ", putere=" + putere + ", pret=" + pret + "]";
	}

}
