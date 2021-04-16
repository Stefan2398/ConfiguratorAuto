package main;

import java.util.ArrayList;

import dealer.DealerAuto;
import vehicule.Masina;
import vehicule.anvelopa;
import vehicule.janta;
import vehicule.motocicleta;
import vehicule.optiune;
import vehicule.roata;

public class Configurator {

	public static void main(String[] args) {

		janta janta1 = new janta("Dotz", "negru", 16);
		janta janta2 = new janta("Zedd", "galben", 19);
		anvelopa anvelopa1 = new anvelopa("Michelin", 165, 40, 18);
		anvelopa anvelopa2 = new anvelopa("Continental", 295, 40, 21);
		roata roata1 = new roata(janta1, anvelopa1, "Audi");
		roata roata2 = new roata(janta2, anvelopa2, "Merecedes");
		roata roata3 = new roata(janta1, anvelopa2, "Honda");
		optiune optiune1 = new optiune("Piele", 1000);
		optiune optiune2 = new optiune("Automata", 3500);
		optiune optiune3 = new optiune("Senzori parcare", 500);
		optiune optiune4 = new optiune("Mod sport", 5000);
		optiune optiune5 = new optiune("Mahon", 2500);
		ArrayList<optiune> optiuni = new ArrayList<optiune>();
		optiuni.add(optiune1);
		optiuni.add(optiune4);
		optiuni.add(optiune3);
		Masina Mercedes = new Masina("albastra", 2200, "Mercedes", "limuzina", "c220", 136, 2000, roata2, 88000,
				optiuni);
		Masina Honda = new Masina("rosie", 1600, "Honda", "limuzina", "civic", 160, 1500, roata3, 27000, optiuni);
		ArrayList<optiune> optiuni2 = new ArrayList<optiune>();
		optiuni.add(optiune2);
		optiuni.add(optiune5);
		motocicleta Bmw = new motocicleta("verde", 1200, "BMW", "curse", "I74", 120, roata2, optiuni, "benzina", 12000);
		ArrayList<Masina> garajMasina = new ArrayList<Masina>();
		ArrayList<motocicleta> garajMoto = new ArrayList<motocicleta>();
		garajMasina.add(Mercedes);
		garajMasina.add(Honda);
		Masina Toyota = new Masina("verde", 1500, "Toyota", "hatchback", "Iaris", 90, 1300, roata1, 16000, optiuni);
		Masina Audi = new Masina("alba", 3000, "Audi", "limuzina", "S7", 467, 2500, roata1, 100000, optiuni);
		garajMoto.add(Bmw);
		garajMasina.add(Toyota);
		garajMasina.add(Audi);
		motocicleta Kawasachi = new motocicleta("portocalie", 900, "Kawasachi", "strada", "M432", 70, roata1, optiuni,
				"benzina", 10000);
		DealerAuto dealer = new DealerAuto(garajMasina, garajMoto);
		garajMoto.add(Kawasachi);
		System.out.println(Mercedes);
		System.out.println(" ");
		System.out.println(Honda);
		System.out.println(" ");
		System.out.println(Bmw);
		System.out.println(" ");

		ArrayList<Masina> masiniPremium = new ArrayList<Masina>();
		System.out.print("Masinile cu pretul mai mare de 60000 sunt: ");
		// System.out.println(" ");
		for (Masina masina : garajMasina) {
			if (masina.getPret() > 60000 && (masina.getListaDeOptiuni().size() > 3)) {
				masiniPremium.add(masina);
				System.out.print(masina.getBrand() + " ");
			}

		}
		for (Masina masina : garajMasina) {
			if (masina.getPret() < 40000) {
				System.out.println("Masinile cu pretul mai mic de 40000 de euro sunt: " + masina.getBrand());
			}
		}

		for (motocicleta moto : garajMoto) {
			if (moto.getPutere() > 50) {
				System.out.println("Motocicetele cu puterea mai mare de 50cp sunt: " + moto.getBrand());
			}
		}
		double media, media1;
		double suma = 0, suma1 = 0;
		double mediaFinala;
		for (Masina masina : garajMasina) {
			suma += masina.getPret();
		}
		media = suma / garajMasina.size();

		for (motocicleta moto : garajMoto) {
			suma += moto.getPret();
		}
		media1 = suma / garajMoto.size();
		mediaFinala = (media + media1) / 2;
		System.out.println("Media garajului este: " + mediaFinala);

	}

}
