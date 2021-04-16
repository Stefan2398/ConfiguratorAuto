package vehicule;

import java.util.ArrayList;
import java.util.Arrays;

public class motocicleta extends Vehicul {

	private roata roata;
	private ArrayList<optiune> listaDeOptiuni;
	private String combustibil;

	public motocicleta(String culoare, Integer motor, String brand, String tip, String model, Integer putere,
			roata roata, ArrayList<optiune> listaDeOptiuni, String combustibil, Integer pret) {
		super(culoare, motor, brand, tip, model, putere, pret);
		this.roata = roata;
		this.listaDeOptiuni = listaDeOptiuni;
		this.combustibil = combustibil;

	}

	public roata getRoata() {
		return roata;
	}

	public void setRoata(roata roata) {
		this.roata = roata;
	}

	public ArrayList<optiune> getListaDeOptiuni() {
		return listaDeOptiuni;
	}

	public void setListaDeOptiuni(ArrayList<optiune> listaDeOptiuni) {
		this.listaDeOptiuni = listaDeOptiuni;
	}

	public String getCombustibil() {
		return combustibil;
	}

	public void setCombustibil(String combustibil) {
		this.combustibil = combustibil;
	}

	@Override
	public String toString() {
		return "Motocicleta " + getBrand() + ", de culoare " + getCuloare() + ", are un motor de " + getMotor()
				+ " cu o putere de " + getPutere() + "cp" + ", model " + getModel() + ", este o masina de " + getTip()
				+ ". " + "Optiunile suplimentare sunt: " + Arrays.toString(listaDeOptiuni.toArray());
	}

}
