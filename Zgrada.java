package p16_9_2021_zadatak1;

public class Zgrada extends Objekat {


//	Zadatak1.
//	
//	Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//	broj stanova
//	konstuktore, gettere i setter
//	porez racuna po formuli koeficijent * povrsina * broj stanova
//	prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
	
	private int brojStanova;
	
	public Zgrada(String adresa, double povrsina, int zona, int stanovi) {
		super(adresa, povrsina, zona);
		this.brojStanova = stanovi;
	}

//	KONSTRUKTORI
	
	@Override
	public double porez() {
		double porez = this.koeficijent() * this.povrsina * this.brojStanova;
		return porez;
	}
	
	@Override
	public void stampa() {
		System.out.println("Adresa: " + this.adresa);
		System.out.println("Povrsina: " + this.povrsina);
		System.out.println("Zona: " + this.zona);
		System.out.println("Broj stanova: " + this.brojStanova);
		System.out.println("Porez: " + this.porez());
		System.out.println();
	}

//	GETTERS & SETTERS
	
	public int getBrojStanova() {
		return brojStanova;
	}

	public void setBrojStanova(int brojStanova) {
		this.brojStanova = brojStanova;
	}
	
	
	
	
	
	
	
}
