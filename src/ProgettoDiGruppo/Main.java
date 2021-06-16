package ProgettoDiGruppo;
import CalcoloCodiceFiscale.CodiceFiscale;

public class Main {

    public static void main(String[] args){


        CodiceFiscale codiceFiscale = new CodiceFiscale("Iuliano", "Daniele", 1996, 12, 19,"M", "Marcianise");
        System.out.println(codiceFiscale.getCodiceFiscale());

   }

}
