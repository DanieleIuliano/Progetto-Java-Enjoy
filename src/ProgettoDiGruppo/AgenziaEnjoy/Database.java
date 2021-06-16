package ProgettoDiGruppo.AgenziaEnjoy;

import java.util.ArrayList;

// gestisce gli utenti e i veicoli
public class Database {

    private ArrayList<Utente> utentiDellAgenzia = new ArrayList<>();

    public ArrayList<Utente> getUtentiDellAgenzia() {

        return utentiDellAgenzia;

    }

    public void setUtentiDellAgenzia(ArrayList<Utente> utentiDellAgenzia) {

        this.utentiDellAgenzia = utentiDellAgenzia;

    }

    public void addUtenteDellAgenzia(Utente utente){

        utentiDellAgenzia.add(utente);

    }

}
