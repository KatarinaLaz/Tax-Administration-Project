package p16_9_2021_zadatak1;

import java.util.ArrayList;

public class PoreskaUprava {

//	Zadatak 1
//	
//	Kreirati klasu PoreskaUprava koja za atribute ima:
//	ime grada u kom se nalazi
//	niz objekata
//	metodu dodaj objekat
//	metodu koja vraca objekat sa najvecim porezom
//	metodu koja vraca objekat sa najmanjim porezom
//	metodu koja racuna ukupan porez za ceo grad
//	metodu koja stampa sve objekte
	
	private String grad;
	ArrayList<Objekat> objekti = new ArrayList<Objekat>();
	
	
	
	public PoreskaUprava(String grad) {
		this.grad = grad;
	}

	public void dodajObjekat(Objekat objekat) {
		objekti.add(objekat);
	}
	
	public Objekat najveciPorez() {
		Objekat najveci = objekti.get(0);
		for (int i = 0; i < objekti.size(); i++) {
			if (objekti.get(i).porez() > najveci.porez()) {
				najveci = objekti.get(i);
			}
		}
		return najveci;
	}
	
	public Objekat najmanjiPorez() {
		Objekat najveci = objekti.get(0);
		for (int i = 0; i < objekti.size(); i++) {
			if (objekti.get(i).porez() < najveci.porez()) {
				najveci = objekti.get(i);
			}
		}
		return najveci;
	}
	
	public double ukupanPorezZaGrad() {
		double ukupno = 0;
		for (int i = 0; i < objekti.size(); i++) {
			ukupno = ukupno + objekti.get(i).porez();
		}
		return ukupno;
	}
	
	public void stampaObjekta() {
		System.out.println("Lokacija poreske: " + this.grad);
		for (int i = 0; i < objekti.size(); i++) {
			objekti.get(i).stampa();
		}
	}
	
	
	
	
	
	
}
