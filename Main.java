
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // Skapa de fyra växterna med namn och höjd
        Palm laura = new Palm("Laura", 5.0);
        Kaktus igge = new Kaktus("Igge", 0.2);
        KöttätandeVäxt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Palm olof = new Palm("Olof", 1.0);

        // Samla alla växter i en lista
        ArrayList<Växt> växter = new ArrayList<>();
        växter.add(laura);
        växter.add(igge);
        växter.add(meatloaf);
        växter.add(olof);

        // Fråga användaren vilken växt den vill vattna
        String söktNamn = JOptionPane.showInputDialog(
                "Vilken växt ska få vätska?"
        );

        // Kontrollera om användaren tryckte på Avbryt eller lämnade tomt
        if (söktNamn == null || söktNamn.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Du måste ange ett växtnamn!");
            return;

        }
        boolean hittad = false;

        for (Växt växt : växter) {
            if (växt.getNamn().equalsIgnoreCase(söktNamn)) {

                hittad = true;

                System.out.println("Hittade växten: " + växt.getNamn());

                // Polymorfism: rätt beräkning används beroende på växttyp.
                double mängd = växt.beräknaVätska();

                String enhet;

                if (växt.getVätsketyp().equals("mineralvatten")) {
                    mängd = mängd * 100;
                    enhet = "cl";
                } else {
                    enhet = "liter";
                }

                String meddelande = "Vätskemängd: " + mängd + " " + enhet
                        + "\nVätsketyp: " + växt.getVätsketyp();

                JOptionPane.showMessageDialog(null, meddelande);

            }
        }

        // Visa felmeddelande om växten inte hittades
        if (!hittad) {
            JOptionPane.showMessageDialog(null, "Växten hittades inte!");
        }
    }
}

