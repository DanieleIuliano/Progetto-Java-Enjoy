package ProgettoDiGruppo;

import CalcoloCodiceFiscale.CodiceFiscale;
import ProgettoDiGruppo.AgenziaEnjoy.Agenzia;
import ProgettoDiGruppo.AgenziaEnjoy.Utente;

public class Main {

    public static void main(String[] args) {

        Agenzia agenzia = new Agenzia();
        agenzia.registrazione();
        agenzia.registrazione();
        Utente utente = agenzia.accesso();


    }

}
