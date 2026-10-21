// Arv: Palm ärver egenskaper från Växt.
public class Palm extends Växt {

    public Palm(String namn, double höjd) {
        super(namn, höjd);
    }

    public String getVätsketyp() {
        return "kranvatten";
    }

    // En palm behöver 0,5 liter per meter.
    public double beräknaVätska() {
        return 0.5 * getHöjd();
    }
}



