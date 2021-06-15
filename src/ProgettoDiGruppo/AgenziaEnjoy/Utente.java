package ProgettoDiGruppo.AgenziaEnjoy;

import ProgettoDiGruppo.AgenziaEnjoy.CodiceFiscale.CodiceFiscale;

import java.io.IOException;
import java.net.URISyntaxException;

public class Utente {
    public static void main(String[] args) throws IOException, URISyntaxException {
        CodiceFiscale cod1 = new CodiceFiscale();

        String codiceFiscale = cod1.calcolaCodiceFiscale("Chiriani","Ilaria","23/06/1998",
                "Caserta","F");
        System.out.println(codiceFiscale);
    }
}


