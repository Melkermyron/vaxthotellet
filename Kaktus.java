// Arv: Kaktus ärver egenskaper från Växt.
public class Kaktus extends Växt {

    public Kaktus(String namn, double höjd) {
        super(namn, höjd);
    }

    public String getVätsketyp() {
        return "mineralvatten";
    }

    // En kaktus behöver 2 cl per dag, alltså 0,02 liter.
    public double beräknaVätska() {
        return 0.02;
    }
}

