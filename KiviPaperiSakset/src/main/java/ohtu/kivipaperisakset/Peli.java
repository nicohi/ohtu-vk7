package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Peli {
	static Tuomari tuomari;
	static Pelaaja p1;
	static Pelaaja p2;
	static boolean running = true;

	public Peli(Tuomari t, Pelaaja p1, Pelaaja p2) {
		this.tuomari = t;
		this.p1 = p1;
		this.p2 = p2;
	}

	protected static final Scanner scanner = new Scanner(System.in);

	protected static boolean onkoOkSiirto(String siirto) {
		return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
	}

	public static void pelaa() {
		while (running) {
			pelaaVuoro(p1, p2);
		}
		loppu();
	}

	protected static void pelaaVuoro(Pelaaja p1, Pelaaja p2) {
		String ekanSiirto = p1.annaSiirto();
		String tokanSiirto = "";
		if (p2.isIhminen()) {
			System.out.print(p2.getNimi() + " pelaajan siirto: ");
			tokanSiirto = p2.annaSiirto();
		} else {
			tokanSiirto = p2.annaSiirto();
			System.out.println("Tietokone valitsi: " + tokanSiirto);
		}
		running = onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto);
		p2.asetaSiirto(ekanSiirto);
		p1.asetaSiirto(tokanSiirto);
		tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
		System.out.println(tuomari);
		System.out.println();
	}

	protected static void loppu() {
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
	}

}
