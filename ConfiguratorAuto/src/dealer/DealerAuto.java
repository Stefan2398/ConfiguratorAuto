package dealer;

import java.util.ArrayList;

import vehicule.Masina;
import vehicule.motocicleta;

public class DealerAuto {

	private ArrayList<Masina> garajMasini;
	private ArrayList<motocicleta> garajMotociclete;

	public DealerAuto(ArrayList<Masina> garajMasini, ArrayList<motocicleta> garajMotociclete) {
		this.garajMasini = garajMasini;
		this.garajMotociclete = garajMotociclete;

	}

	public ArrayList<Masina> getGarajMasini() {
		return garajMasini;
	}

	public void setGarajMasini(ArrayList<Masina> garajMasini) {
		this.garajMasini = garajMasini;
	}

	public ArrayList<motocicleta> getGarajMotociclete() {
		return garajMotociclete;
	}

	public void setGarajMotociclete(ArrayList<motocicleta> garajMotociclete) {
		this.garajMotociclete = garajMotociclete;
	}

	@Override
	public String toString() {
		return "DealerAuto [garajMasini=" + garajMasini + ", garajMotociclete=" + garajMotociclete + "]";
	}

}
