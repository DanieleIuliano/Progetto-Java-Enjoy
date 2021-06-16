package ProgettoDiGruppo;

import CalcoloCodiceFiscale.CodiceFiscale;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
	// write your code he

        CodiceFiscale codiceFiscale = new CodiceFiscale("Iuliano", "Daniele", 1996, 12, 19,"M", "Marcianise");
        System.out.println(codiceFiscale.getCodiceFiscale());


   }

}
