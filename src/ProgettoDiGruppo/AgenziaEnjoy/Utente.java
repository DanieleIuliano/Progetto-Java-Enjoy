package ProgettoDiGruppo.AgenziaEnjoy;

import CalcoloCodiceFiscale.CodiceFiscale;
import ProgettoDiGruppo.Veicoli.TipoPatente;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class Utente {

    private String nome;
    private String cognome;
    private int annoDiNascita;
    private int meseDiNascita;
    private int giornoDiNascita;
    private String sesso;
    private String comuneDiNascita;
    private String codiceFiscale;
    private String password;
    private  ArrayList<TipoPatente> patentiPresenti;

    public Utente(String nome, String cognome, int annoDiNascita, int meseDiNascita, int giornoDiNascita, String sesso, String comuneDiNascita, String password, ArrayList<TipoPatente> patentiPresenti) {

        this.nome = nome;
        this.cognome = cognome;
        this.annoDiNascita = annoDiNascita;
        this.meseDiNascita = meseDiNascita;
        this.giornoDiNascita = giornoDiNascita;
        this.sesso = sesso;
        this.comuneDiNascita = comuneDiNascita;
        this.password = password;
        this.patentiPresenti = patentiPresenti;
        codiceFiscale = setCodiceFiscale();


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAnnoDiNascita() {
        return annoDiNascita;
    }

    public void setAnnoDiNascita(int annoDiNascita) {
        this.annoDiNascita = annoDiNascita;
    }

    public int getMeseDiNascita() {
        return meseDiNascita;
    }

    public void setMeseDiNascita(int meseDiNascita) {
        this.meseDiNascita = meseDiNascita;
    }

    public int getGiornoDiNascita() {
        return giornoDiNascita;
    }

    public void setGiornoDiNascita(int giornoDiNascita) {
        this.giornoDiNascita = giornoDiNascita;
    }

    public String getComuneDiNascita() {
        return comuneDiNascita;
    }

    public void setComuneDiNascita(String comuneDiNascita) {
        this.comuneDiNascita = comuneDiNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    private String setCodiceFiscale() {

        CodiceFiscale codiceFiscale = new CodiceFiscale(cognome, nome, annoDiNascita, meseDiNascita, giornoDiNascita, sesso, comuneDiNascita);
        return codiceFiscale.getCodiceFiscale();

    }

    public String getPassword() {

        return password;

    }

    public void setPassword(String password) {

        this.password = password;

    }
}


