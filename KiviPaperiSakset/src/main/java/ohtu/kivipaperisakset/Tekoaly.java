package ohtu.kivipaperisakset;

public class Tekoaly implements Pelaaja {

    int siirto;

    public Tekoaly() {
        siirto = 0;
    }

	@Override
    public String annaSiirto() {
        siirto++;
        siirto = siirto % 3;

        if (siirto == 0) {
            return "k";
        } else if (siirto == 1) {
            return "p";
        } else {
            return "s";
        }
    }

	@Override
    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }

	@Override
	public String getNimi() {
		return "botin";
	}

	@Override
	public boolean isIhminen() {
		return false;
	}
}
