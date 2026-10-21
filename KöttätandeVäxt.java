// Arv: KöttätandeVäxt ärver egenskaper från Växt.
public class KöttätandeVäxt extends Växt {

    public KöttätandeVäxt(String namn, double höjd) {
        super(namn, höjd);
    }

    public String getVätsketyp() {
        return "proteindryck";
    }

    // En köttätande växt behöver 0,1 liter
    // plus 0,2 liter per meter.
    public double beräknaVätska() {
        return 0.1 + (0.2 * getHöjd());
    }
}


