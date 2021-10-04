package p16_9_2021_zadatak1;

public abstract class Objekat {

//	Zadatak 1.
//	
//	Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi:
//	adresa (ulica i broj)
//	povrsina objekta
//	zona (1, 2 ili 3)
//	konstuktore, gettere i settere
//	metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//	zona 1, koeficijent je 1.4
//	zona 2, koeficijent je 1.1
//	zona 3, koeficijent je 1.05
//	abstraktnu metodu koja racuna i vraca porez objekta
//	abstraktnu metodu stampaj 
	
	protected String adresa;
	protected double povrsina;
	protected int zona;
	
	public Objekat() {
		
	}
	
	public Objekat(String adresa, double povrsina, int zona) {
		super();
		this.adresa = adresa;
		this.povrsina = povrsina;
		this.zona = zona;
	}
	
//	METODE
	
	public double koeficijent() {
		if (zona == 1) {
			return 1.4;
		} else if (zona == 2) {
			return 1.1;
		} else {
			return 1.05;
		}
	}
	
	public abstract double porez();
	
	public abstract void stampa();
	
//	GETTERS & SETTERS
	
	public String getAdresa() {
		return adresa;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public int getZona() {
		return zona;
	}
	
	
	
	
	
	
	
	
	
}
