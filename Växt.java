// Basklass för alla växter.
// Implementerar interfacet VätskeBehov.
public abstract class Växt implements VätskeBehov {

    private String namn;
    private double höjd;

    public Växt(String namn, double höjd) {
        this.namn = namn;
        this.höjd = höjd;
    }

    public String getNamn() {
        return namn;
    }

    public double getHöjd() {
        return höjd;
    }

    // Underklasserna beräknar vätska på olika sätt.
    public abstract double beräknaVätska();

    public abstract String getVätsketyp();
}

