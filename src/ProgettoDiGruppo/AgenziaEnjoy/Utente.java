package ProgettoDiGruppo.AgenziaEnjoy;

import ProgettoDiGruppo.AgenziaEnjoy.CodiceFiscale.CodiceFiscale;

import java.io.IOException;
import java.net.URISyntaxException;

public class Utente {
    public static void main(String[] args) throws IOException, URISyntaxException {
        CodiceFiscale cod1 = new CodiceFiscale();
        String codiceFiscale = cod1.codiceFiscale("Iuliano","Daniele","19/12/1996",
                "Marcianise","M");
        System.out.println(codiceFiscale);
    }
}


