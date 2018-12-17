package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Ihminen implements Pelaaja {
	Scanner s;
	String nimi;
	
	public Ihminen(String nimi) {
		s = new Scanner(System.in);
		this.nimi = nimi;
	}

	@Override
	public String annaSiirto() {
		return s.nextLine();
	}

	@Override
	public void asetaSiirto(String s) {
		//do nothing
		return;
	}

	@Override
	public String getNimi() {
		return nimi;
	}

	@Override
	public boolean isIhminen() {
		return true;
	}

}
