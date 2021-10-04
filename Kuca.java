package p16_9_2021_zadatak1;

public class Kuca extends Objekat {


//	Zadatak 1.
//	
//	Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu, 
//	konstuktore, gettere i setter
//	porez racuna po formuli: koeficijent * povrsina.
//	prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
	
	private int brojClanova;
	
	public Kuca(String adresa, double povrsina, int zona, int clanovi) {
		super(adresa, povrsina, zona);
		this.brojClanova = clanovi;
	}

//	METODE
	
	@Override
	public double porez() {
		double porez = this.koeficijent() * this.povrsina;
		return porez;
	}
	
	@Override
	public void stampa() {
		System.out.println("Adresa: " + this.adresa);
		System.out.println("Povrsina: " + this.povrsina);
		System.out.println("Zona: " + this.zona);
		System.out.println("Broj clanova: " + this.brojClanova);
		System.out.println("Porez: " + this.porez());
		System.out.println();
	}
	
//	GETTERS & SETTERS
	
	public int getBrojClanova() {
		return brojClanova;
	}

	public void setBrojClanova(int brojClanova) {
		this.brojClanova = brojClanova;
	}
	
	
	
	
	
	
	
}
