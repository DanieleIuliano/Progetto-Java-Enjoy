package ProgettoDiGruppo.AgenziaEnjoy;

import ProgettoDiGruppo.Veicoli.*;

import java.util.ArrayList;

// gestisce gli utenti e i veicoli

public class Database {

    private ArrayList<Utente> utentiDellAgenzia = new ArrayList<>();
    private ArrayList<Auto> automobili = new ArrayList<>();
    private ArrayList<Bicicletta> biciclette = new ArrayList<>();
    private ArrayList<Furgoni> furgoni = new ArrayList<>();
    private ArrayList<Scooter> scooters = new ArrayList<>();
    private ArrayList<Monopattino> monopattini = new ArrayList<>();

    public ArrayList<Utente> getUtentiDellAgenzia() {

        return utentiDellAgenzia;

    }

    public void setUtentiDellAgenzia(ArrayList<Utente> utentiDellAgenzia) {

        this.utentiDellAgenzia = utentiDellAgenzia;

    }

    public void addUtenteDellAgenzia(Utente utente){

        utentiDellAgenzia.add(utente);

    }

    public ArrayList<Auto> getAutomobili() {
        return automobili;
    }

    public void setAutomobili(ArrayList<Auto> automobili) {
        this.automobili = automobili;
    }

    public ArrayList<Bicicletta> getBiciclette() {
        return biciclette;
    }

    public void setBiciclette(ArrayList<Bicicletta> biciclette) {
        this.biciclette = biciclette;
    }

    public ArrayList<Furgoni> getFurgoni() {
        return furgoni;
    }

    public void setFurgoni(ArrayList<Furgoni> furgoni) {
        this.furgoni = furgoni;
    }

    public ArrayList<Scooter> getScooters() {
        return scooters;
    }

    public void setScooters(ArrayList<Scooter> scooters) {
        this.scooters = scooters;
    }

    public ArrayList<Monopattino> getMonopattini() {
        return monopattini;
    }

    public void setMonopattini(ArrayList<Monopattino> monopattini) {
        this.monopattini = monopattini;
    }
}
