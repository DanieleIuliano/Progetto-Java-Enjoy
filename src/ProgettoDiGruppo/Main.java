package ProgettoDiGruppo;

import ProgettoDiGruppo.AgenziaEnjoy.CodiceFiscale.CodiceFiscale;
import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        GeoPosizione pos1 = new GeoPosizione();
        float distanza = (float) pos1.distance(41.02659079447958, 14.29268426742995, 41.026631263905486, 14.297126005533878);
        System.out.println(distanza);

        CodiceFiscale cod1 = new CodiceFiscale();

        String codiceFiscale = cod1.calcolaCodiceFiscale("Chiriani","Ilaria","23/06/1998",
                "Caserta","F");
        System.out.println(codiceFiscale);
    }
}
