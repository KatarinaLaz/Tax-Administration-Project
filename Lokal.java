package p16_9_2021_zadatak1;

public class Lokal extends Objekat {


//	Zadatak 1
//	
//	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//	konstuktore
//	porez racuna po formuli koeficijent * povrsina * 1.3
//	prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
	
	public Lokal(String adresa, double povrsina, int zona) {
		super(adresa, povrsina, zona);
	}
	
//	METODE
	
	@Override
	public double porez() {
		double porez = this.koeficijent() * this.povrsina * 1.3;
		return porez;
	}
	
	@Override
	public void stampa() {
		System.out.println("Adresa: " + this.adresa);
		System.out.println("Povrsina: " + this.povrsina);
		System.out.println("Zona: " + this.zona);
		System.out.println("Porez: " + this.porez());
		System.out.println();
	}
	
	
	
	
}
