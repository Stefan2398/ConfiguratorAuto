package vehicule;

public class roata {

	private janta janta;
	private anvelopa anvelopa;
	private String marca;

	public roata(vehicule.janta janta, vehicule.anvelopa anvelopa, String marca) {
		super();
		this.janta = janta;
		this.anvelopa = anvelopa;
		this.marca = marca;
	}

	public janta getJanta() {
		return janta;
	}

	public void setJanta(janta janta) {
		this.janta = janta;
	}

	public anvelopa getAnvelopa() {
		return anvelopa;
	}

	public void setAnvelopa(anvelopa anvelopa) {
		this.anvelopa = anvelopa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "\n" + getMarca() + " " + getJanta();
	}

}
