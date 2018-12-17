package ohtu.kivipaperisakset;

public class Pelitehdas {

	public static Peli luoKaksinPeli() {
		return new Peli(new Tuomari(), new Ihminen("Ensimmäisen"), new Ihminen("Toisen"));
	}

	public static Peli luoPelaajaVastaanTekoaly() {
		return new Peli(new Tuomari(), new Ihminen("Ensimmäisen"), new Tekoaly());
	}

	public static Peli luoPelaajaVastaanParempiTekoaly() {
		return new Peli(new Tuomari(), new Ihminen("Ensimmäisen"), new TekoalyParannettu(20));
	}
}
