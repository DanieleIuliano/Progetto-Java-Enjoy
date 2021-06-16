package ProgettoDiGruppo.AgenziaEnjoy;

import ProgettoDiGruppo.Veicoli.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// classe che gestisce il database
public class Agenzia {

    private Utente utente;
    private Database databaseAgenzia = new Database();
    Scanner scanner = new Scanner(System.in);

    public void registrazione() {

        String nomeUtente;
        String cognomeUtente;
        int annoDiNascita;
        int meseDiNascita;
        int giornoDiNascita;
        String sesso;
        String comuneDiNascita;
        ArrayList<TipoPatente> patentiPresenti = new ArrayList<>();
        String password;
        String patenti;

        System.out.println("Procediamo con la registrazione!");
        while (true) {

            System.out.print("Il tuo nome: ");
            nomeUtente = scanner.next();

            if (nomeUtente.length() > 2) {

                break;

            }

            System.out.println("ATTENZIONE NOME TROPPO CORTO! ");
        }

        while (true) {

            System.out.print("Il tuo cognome: ");
            cognomeUtente = scanner.next();

            if (cognomeUtente.length() > 2) {

                break;

            }

            System.out.println("ATTENZIONE COGNOME TROPPO CORTO! ");

        }
        while (true) {

            System.out.print("Anno di nascita: ");
            annoDiNascita = scanner.nextInt();

            if (annoDiNascita >= 1950 && annoDiNascita < 2005) {

                break;

            }

            System.out.println("ANNO NON VALIDO");
            return;
        }

        while (true) {

            System.out.print("Numero mese di nascita: ");
            meseDiNascita = scanner.nextInt();

            if (meseDiNascita <= 12 && meseDiNascita > 0) {

                break;

            }

            System.out.println("Mese non valido");

        }

        while (true) {

            System.out.print("Giorno di nascita: ");
            giornoDiNascita = scanner.nextInt();

            if (meseDiNascita == 2) {

                if (giornoDiNascita <= 28 && giornoDiNascita > 0)

                    break;

                else {

                    System.out.println("Giorno non valido");

                }

            }

            if (meseDiNascita == 1 || meseDiNascita == 3 || meseDiNascita == 5 || meseDiNascita == 7 || meseDiNascita == 8 || meseDiNascita == 10 || meseDiNascita == 12) {

                if (giornoDiNascita <= 31 && giornoDiNascita > 0)

                    break;

                else {

                    System.out.println("Giorno non valido");

                }

            } else {

                if (giornoDiNascita <= 30 && giornoDiNascita > 0)

                    break;

                else

                    System.out.println("Giorno non valido");

            }

        }

        while (true) {

            System.out.print("Sesso di nascita: ");
            sesso = scanner.next();

            if (sesso.equalsIgnoreCase("Maschio")) {

                sesso = "M";
                break;

            }

            if (sesso.equalsIgnoreCase("Femmina")) {

                sesso = "F";
                break;

            } else

                System.out.println("Scelta non valida, scegliere maschio o femmina");

        }

        while (true) {

            System.out.print("Comune di nascita: ");
            comuneDiNascita = scanner.next();

            if (comuneDiNascita.length() < 2) {

                System.out.println("Comune non valido");
                continue;

            }

            break;

        }

        while (true) {

            System.out.print("Patenti possedute 'A', 'B', 'C', 'Fine' : ");
            patenti = scanner.next();

            if (patenti.equalsIgnoreCase("A")) {

                patentiPresenti.add(TipoPatente.A);
                continue;
            }

            if (patenti.equalsIgnoreCase("B")) {

                patentiPresenti.add(TipoPatente.B);
                continue;

            }

            if (patenti.equalsIgnoreCase("C")) {

                patentiPresenti.add(TipoPatente.B);
                continue;

            }

            if (patenti.equalsIgnoreCase("FINE")) {

                break;

            } else {

                System.out.println("FORMATO PATENTE NON VALIDA, SCEGLI UNA DELLE OPZIONI");
                continue;

            }


        }

        while (true) {

            System.out.print("Password: ");
            password = scanner.next();

            if (password.length() < 8) {

                System.out.println("Password troppo corta");
                continue;

            }

            break;

        }

        Utente utente = new Utente(nomeUtente, cognomeUtente, annoDiNascita, meseDiNascita, giornoDiNascita, sesso, comuneDiNascita, password, patentiPresenti);
        databaseAgenzia.addUtenteDellAgenzia(utente);
        utente = null;

    }

    public Utente accesso() {

        String codiceFiscale;
        String password;

        while (true) {

            System.out.print("Codice fiscale: ");
            codiceFiscale = scanner.next();

            if (codiceFiscale.length() != 16) {

                System.out.println("FORMATO CODICE FISCALE ERRATO");
                continue;

            }

            break;

        }

        while (true) {

            System.out.print("Password: ");
            password = scanner.next();

            if (password.length() < 8) {

                System.out.println("FORMATO PASSWORD ERRATO");
                continue;

            }

            break;

        }

        for (Utente utente : databaseAgenzia.getUtentiDellAgenzia()) {

            if (utente.getCodiceFiscale().equalsIgnoreCase(codiceFiscale) && utente.getPassword().equals(password))

                return utente;

        }

        return null;

    }

    private ArrayList<String> veicoliPrenotabili(Utente utente) {

        ArrayList<String> veicoli = new ArrayList<>();

        System.out.println("Puoi affittare: ");
        veicoli.add("Bicicletta");
        veicoli.add("Monopattino");
        System.out.println("|Bicicletta|\n|Monopattino|");

        if (utente.getPatentiPresenti().contains(TipoPatente.A)) {

            System.out.println("|Scooter|");
            veicoli.add("Scooter");

        }

        if (utente.getPatentiPresenti().contains(TipoPatente.B)) {

            System.out.println("|Auto|");
            veicoli.add("Auto");

        }
        if (utente.getPatentiPresenti().contains(TipoPatente.C)) {

            System.out.println("|Furgoni|");
            System.out.println("|Exit|");
            veicoli.add("Furgoni");

        }

        return veicoli;

    }

    public void prenotaVeicolo(Utente utente) {


        ArrayList<String> veicoliAccessibili = veicoliPrenotabili(utente);
        String scelta;
        System.out.print("Veicolo da prenotare: ");
        scelta = scanner.next();
        Veicolo veicolo;

        switch (scelta.toLowerCase(Locale.ROOT)){

            case "auto":

                if(utente.getPatentiPresenti().contains(TipoPatente.B))

                    stampaAuto();

                else

                    System.out.println("Veicolo non prenotabile");


                break;

            case "furgoni":


                if(utente.getPatentiPresenti().contains(TipoPatente.C))

                    stampaFurgoni();

                else

                    System.out.println("Veicolo non prenotabile");



                break;


            case "monopattino":

                stampaMonopattini();
                break;

            case "scooter":

                if(utente.getPatentiPresenti().contains(TipoPatente.A))

                    stampaScooter();

                else

                    System.out.println("Veicolo non prenotabile");



                break;

            case "bicicletta":

                stampaBiciclette();

            case "Exit":

                return;

            default:

                System.out.println("Scelta non valida");
                prenotaVeicolo(utente);
        }


    }

    public void stampaAuto(){

        for(Auto auto : databaseAgenzia.getAutomobili()){

            if(!auto.isAffittato()){

                System.out.println(auto);

            }

        }

    }
    public void stampaFurgoni(){

        for(Furgoni furgoni : databaseAgenzia.getFurgoni()){

            if(!furgoni.isAffittato()){

                System.out.println(furgoni);

            }

        }

    }

    public void stampaMonopattini(){

        for(Monopattino monopattino : databaseAgenzia.getMonopattini()){

            if(!monopattino.isAffittato()){

                System.out.println(monopattino);

            }

        }

    }
    public void stampaScooter(){

        for(Scooter scooter : databaseAgenzia.getScooters()){

            if(!scooter.isAffittato()){

                System.out.println(scooter);

            }

        }

    }

    public void stampaBiciclette(){

        for (Bicicletta bicicletta : databaseAgenzia.getBiciclette()){

            if(!bicicletta.isAffittato())

                System.out.println(bicicletta);

        }

    }


    public void prenotaAuto(){

        String targa;
        System.out.print("Targa veicolo: ");
        targa = scanner.next();

        for(Auto auto : databaseAgenzia.getAutomobili()){

            if(auto.getTarga().equalsIgnoreCase(targa)){

                auto.setAffittato(true);
                System.out.println("Veicolo prenotato!");
                break;

            }

        }


    }

    public void prenotaBicicletta(){

        String targa;
        System.out.print("ID veicolo: ");
        targa = scanner.next();

        for(Bicicletta bicicletta : databaseAgenzia.getBiciclette()){

            if(bicicletta.getUniqueId().equalsIgnoreCase(targa)){

                bicicletta.setAffittato(true);
                System.out.println("Veicolo prenotato!");
                break;

            }

        }


    }

    public void prenotaMonopattino(){

        String targa;
        System.out.print("ID veicolo: ");
        targa = scanner.next();

        for(Monopattino monopattino : databaseAgenzia.getMonopattini()){

            if(monopattino.getUniqueId().equalsIgnoreCase(targa)){

                monopattino.setAffittato(true);
                System.out.println("Veicolo prenotato!");
                break;

            }

        }

    }


    public void prenotaScooter(){

        String targa;
        System.out.print("Targa veicolo: ");
        targa = scanner.next();

        for(Scooter scooter : databaseAgenzia.getScooters()){

            if(scooter.getTarga().equalsIgnoreCase(targa)){

                scooter.setAffittato(true);
                System.out.println("Veicolo prenotato!");
                break;

            }

        }

    }


}
