package ProgettoDiGruppo;
import CalcoloCodiceFiscale.CodiceFiscale;
import ProgettoDiGruppo.AgenziaEnjoy.Agenzia;
import ProgettoDiGruppo.AgenziaEnjoy.Utente;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Agenzia agenzia = new Agenzia();
        Scanner scanner = new Scanner(System.in);
        String scelta;
        Utente utente = null;

        System.out.println("Benvenuto nella nostra agenzia di Shared Mobility\nCosa vuoi fare: ");

        while (true){

            if(utente == null) {

                System.out.println("|Registrazione|\n|Accesso|\n|Exit|");
                System.out.print("Scelta: ");
                scelta = scanner.next();

            }

            else {
                System.out.println("Cosa vuoi fare: \n|Prenotazione|\n|Exit|");
                System.out.print("Scelta: ");
                scelta = scanner.next();

            }

            if(scelta.equalsIgnoreCase("Registrazione")){

                agenzia.registrazione();
                continue;

            }

            if(scelta.equalsIgnoreCase("Accesso")){

                utente = agenzia.accesso();

                if(utente == null){

                    System.out.println("Accesso non riuscito, se non sei ancora registrato registrati!");
                    continue;

                }

                else {

                    System.out.println("Accesso effettuato");
                    continue;

                }

            }

            if(scelta.equalsIgnoreCase("Prenotazione")){

                agenzia.prenotaVeicolo(utente);

            }

            if(scelta.equalsIgnoreCase("Exit")){

                System.out.println("ARRIVEDERCI!!");
                break;

            }

            else{

                System.out.println("Scelta non valida!");
                continue;

            }

        }

    }

   }

