package ProgettoDiGruppo;
import CalcoloCodiceFiscale.CodiceFiscale;

public class Main {

    public static void main(String[] args){


        CodiceFiscale codiceFiscale = new CodiceFiscale("Pellecchia", "Raffaele", 2001, 01, 27,"M", "Napoli");
        System.out.println(codiceFiscale.getCodiceFiscale());

   }

}
