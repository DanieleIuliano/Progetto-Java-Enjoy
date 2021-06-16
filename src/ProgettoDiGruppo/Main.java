package ProgettoDiGruppo;

import CalcoloCodiceFiscale.CodiceFiscale;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
	// write your code he

        CodiceFiscale codiceFiscale = new CodiceFiscale("Pellecchia", "Raffaele", 2001, 01, 27,"M", "Napoli");
        System.out.println(codiceFiscale.getCodiceFiscale());


   }

}
