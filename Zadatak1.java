package p16_9_2021_zadatak1;

public class Zadatak1 {

	public static void main(String[] args) {

//		Zadatak 1. 
//			Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi:
//			adresa (ulica i broj)
//			povrsina objekta
//			zona (1, 2 ili 3)
//			konstuktore, gettere i settere
//			metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//			zona 1, koeficijent je 1.4
//			zona 2, koeficijent je 1.1
//			zona 3, koeficijent je 1.05
//			abstraktnu metodu koja racuna i vraca porez objekta
//			abstraktnu metodu stampaj 
//
//				Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu, 
//			konstuktore, gettere i setter
//			porez racuna po formuli: koeficijent * povrsina.
//			prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
//
//				Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//			broj stanova
//			konstuktore, gettere i setter
//			porez racuna po formuli koeficijent * povrsina * broj stanova
//			prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
//				
//				Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//			konstuktore
//			porez racuna po formuli koeficijent * povrsina * 1.3
//			prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
//
//				Kreirati klasu PoreskaUprava koja za atribute ima:
//			ime grada u kom se nalazi
//			niz objekata
//			metodu dodaj objekat
//			metodu koja vraca objekat sa najvecim porezom
//			metodu koja vraca objekat sa najmanjim porezom
//			metodu koja racuna ukupan porez za ceo grad
//			metodu koja stampa sve objekte
//			U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 3 razlicita objekta i istestirati sve metode.

		PoreskaUprava p = new PoreskaUprava("Novi Sad");
		
		Objekat k = new Kuca("Limanski Park 3", 120, 2, 3);
		Objekat z = new Zgrada("Petra Petrovica 13", 700, 1, 12);
		Objekat l = new Lokal("Zike Zikica 21", 150, 3);
		
		p.dodajObjekat(k);
		p.dodajObjekat(z);
		p.dodajObjekat(l);
		
		System.out.println("Najmanji porez ima objekat: ");
		p.najmanjiPorez().stampa();
		System.out.println("Najveci porez ima objekat: ");
		p.najveciPorez().stampa();
		p.stampaObjekta();
		
		
		
		
		
	}

}
