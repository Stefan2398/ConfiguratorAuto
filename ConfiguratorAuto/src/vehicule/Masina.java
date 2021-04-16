package vehicule;

import java.util.ArrayList;
import java.util.Arrays;

public class Masina extends Vehicul {

	private Integer greutate;
	private roata roata;
	private ArrayList<optiune> listaDeOptiuni;

	public Masina(String culoare, Integer motor, String brand, String tip, String model, Integer putere,
			Integer greutate, roata roata, Integer pret, ArrayList<optiune> listaDeOptiuni) {
		super(culoare, motor, brand, tip, model, putere, pret);
		this.greutate = greutate;
		this.roata = roata;
		this.listaDeOptiuni = listaDeOptiuni;

	}

	public Integer getGreutate() {
		return greutate;
	}

	public roata getRoata() {
		return roata;
	}

	public ArrayList<optiune> getListaDeOptiuni() {
		return listaDeOptiuni;
	}

	public void setListaDeOptiuni(ArrayList<optiune> listaDeOptiuni) {
		this.listaDeOptiuni = listaDeOptiuni;
	}

	@Override
	public String toString() {
		return "Masina " + getBrand() + " " + getModel() + " este de culoare " + getCuloare() + ", are un motor de  "
				+ getMotor() + " care are " + getPutere() + "cp" + ", este de tip " + getTip() + ", cu greutatea de "
				+ getGreutate() + " kg." + " Roata " + getRoata() + "Optiuni suplimentare: "
				+ Arrays.toString(listaDeOptiuni.toArray());
	}

}
