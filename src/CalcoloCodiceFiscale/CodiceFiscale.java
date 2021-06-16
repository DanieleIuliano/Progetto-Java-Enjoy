package CalcoloCodiceFiscale;

import java.io.File;
import java.util.Scanner;

public class CodiceFiscale {

    private String primi15Caratteri;
    private String codiceFiscale;

    public CodiceFiscale(String cognome, String nome, int anno, int mese, int giorno, String sesso, String comune) {

        this.primi15Caratteri = SetCognome(cognome) + SetNome(nome) + SetAnno(anno) + SetMese(mese) + SetGiornoSesso(giorno, sesso) + SetCodiceCatastale(comune);
        this.codiceFiscale = primi15Caratteri + SetCarattereControllo(primi15Caratteri);

    }

    public String getCodiceFiscale() {

        return codiceFiscale;

    }

    public String SetCognome(String cognome) {

        int numeroConsonanti = 0;
        String risultato = "";
        char[] elencoConsonanti = cognome.toCharArray();
        char[] elencoVocali;
        String consonanti = "";
        String vocali = "";

        if(cognome.length() < 3) {

            cognome = cognome.toUpperCase();
            return cognome + 'X';

        }

        for(int i = 0; i < cognome.length(); i++) {

            if(elencoConsonanti[i] != ' ' && elencoConsonanti[i] != '-'){

                if(elencoConsonanti[i] != 65 && elencoConsonanti[i] != 69 && elencoConsonanti[i] != 73 && elencoConsonanti[i] != 79 && elencoConsonanti[i] != 85 && elencoConsonanti[i] != 97 && elencoConsonanti[i] != 101 & elencoConsonanti[i] != 105 && elencoConsonanti[i] != 111 && elencoConsonanti[i] != 117 ) {
                    numeroConsonanti++;
                    consonanti = consonanti + elencoConsonanti[i];
                }

                else {

                    vocali = vocali + elencoConsonanti[i];

                }
            }
        }

        elencoConsonanti = consonanti.toCharArray();
        elencoVocali = vocali.toCharArray();
        if(numeroConsonanti >= 3) {

            risultato = risultato + elencoConsonanti[0] + elencoConsonanti[1] + elencoConsonanti[2];
        }
        else {

            int i  = 0;
            risultato = consonanti;
            while (risultato.length() < 3) {

                risultato = risultato + elencoVocali[i];
                i++;
            }

        }
        risultato = risultato.toUpperCase();
        return risultato;
    }

    public String SetNome(String nome) {

        int numeroConsonanti = 0;
        String risultato = "";
        char[] elencoConsonanti = nome.toCharArray();
        char[] elencoVocali;
        String consonanti = "";
        String vocali = "";

        if(nome.length() < 3) {

            nome.toUpperCase();
            return nome + 'X';

        }

        for(int i = 0; i < nome.length(); i++) {

            if(elencoConsonanti[i] != ' ' && elencoConsonanti[i] != '-'){

                if(elencoConsonanti[i] != 65 && elencoConsonanti[i] != 69 && elencoConsonanti[i] != 73 && elencoConsonanti[i] != 79 && elencoConsonanti[i] != 85 && elencoConsonanti[i] != 97 && elencoConsonanti[i] != 101 & elencoConsonanti[i] != 105 && elencoConsonanti[i] != 111 && elencoConsonanti[i] != 117 ) {
                    numeroConsonanti++;
                    consonanti = consonanti + elencoConsonanti[i];
                }

                else {

                    vocali = vocali + elencoConsonanti[i];

                }
            }
        }

        elencoConsonanti = consonanti.toCharArray();
        elencoVocali = vocali.toCharArray();
        if(numeroConsonanti >= 4) {

            risultato = risultato + elencoConsonanti[0] + elencoConsonanti[2] + elencoConsonanti[3];
        }
        else {

            if(numeroConsonanti == 3) {

                risultato = risultato + elencoConsonanti[0] + elencoConsonanti[1] + elencoConsonanti[2];
            }
            if(numeroConsonanti < 3) {

                int i  = 0;
                risultato = consonanti;
                while (risultato.length() < 3) {

                    risultato = risultato + elencoVocali[i];
                    i++;
                }
            }
        }


        risultato = risultato.toUpperCase();
        return risultato;
    }

    public String SetAnno(int anno) {

        String risultato = "";

        if(anno >= 2000) {

            risultato += anno - 2000;
            if(Integer.parseInt(risultato) < 10) {

                risultato = "0" + risultato;
            }
        }
        else{

            risultato += anno - 1900;

            if(Integer.parseInt(risultato) < 10) {

                risultato = "0" + risultato;
            }

        }
        return risultato;
    }

    public char SetMese(int mese) {

        String risultato;
        char letteraMese;
        if(mese < 6) {

            return( (char) (mese + 64));
        }
        else {

            if (mese == 6)
                return 'H';

            else {

                if (mese < 9)
                    return ((char) (mese + 69));

                if (mese == 9 )
                    return 'P';

                else
                    return ((char) (mese + 72 ));

            }

        }
    }

    public String SetGiornoSesso(int giorno, String sesso) {

        String risultato = "";

        if(sesso.equals("M")) {

            if(giorno < 10)  // trasformo stringa in intero

                risultato = "0" + giorno;

            else
                risultato += giorno;
        }
        else
            risultato +=  giorno + 40;

        return risultato;
    }

    public String SetCodiceCatastale(String comune) {

        Scanner codiciCatastali = null;
        try {
            codiciCatastali = new Scanner(new File("src/CalcoloCodiceFiscale/CodiciCatastali.text"));
        }
        catch(Exception e) {
            System.out.println("File non trovato");
        }
        while(codiciCatastali.hasNext()) {

            String a = (String) codiciCatastali.next();

            if(a.contains(comune)) {

                if(a.length() == (comune.length() + 4)) {

                    a = a.replaceAll(comune, "");
                    return a;

                }
            }

        }

        return null;

    }

    public char SetCarattereControllo(String cf) {

        char[] lettereCf = cf.toCharArray();
        int caratteriPari = 0;
        int caratteriDispari = 0;
        int resto;
        char carattereControllo;

        for(int i = 0; i < cf.length(); i++) {

            if(((i + 1) % 2) == 0) {

                if(lettereCf[i] > 47 && lettereCf[i] < 58)

                    caratteriPari += (lettereCf[i] - '0');

                else

                    caratteriPari += (lettereCf[i] - 'A');

            }
            else {

                if(lettereCf[i] > 47 && lettereCf[i] < 58) {


                    if(lettereCf[i] == '0')

                        caratteriDispari += 1;

                    else if (lettereCf[i] == '1')

                        caratteriDispari += 0;

                    else if (lettereCf[i] > '1' && lettereCf[i] < '5') {


                        caratteriDispari += ((lettereCf[i] -  '0')+ (lettereCf[i] - '0') + 1);

                    }

                    else

                        caratteriDispari += ((lettereCf[i] -  '0')+ (lettereCf[i] - '0') + 3);


                }

                else {

                    if(lettereCf[i] == 'A')

                        caratteriDispari += 1;

                    else if(lettereCf[i] == 'B')

                        caratteriDispari += 0;

                    else if(lettereCf[i] > 'B' && lettereCf[i] < 'F')

                        caratteriDispari += ((lettereCf[i] -  'A')+ (lettereCf[i] - 'A') + 1);

                    else if(lettereCf[i] > 'E' && lettereCf[i] < 'K')

                        caratteriDispari += ((lettereCf[i] -  'A')+ (lettereCf[i] - 'A') + 3);

                    else if(lettereCf[i] == 'K')

                        caratteriDispari += 2;

                    else if(lettereCf[i] == 'L')

                        caratteriDispari += 4;

                    else if(lettereCf[i] == 'M')

                        caratteriDispari += 18;

                    else if(lettereCf[i] == 'N')

                        caratteriDispari += 20;

                    else if(lettereCf[i] == 'O')

                        caratteriDispari += 11;

                    else if(lettereCf[i] == 'P')

                        caratteriDispari += 3;

                    else if(lettereCf[i] == 'Q')

                        caratteriDispari += 6;

                    else if(lettereCf[i] == 'R')

                        caratteriDispari += 8;

                    else if(lettereCf[i] == 'S')

                        caratteriDispari += 12;

                    else if(lettereCf[i] == 'T')

                        caratteriDispari += 14;

                    else if(lettereCf[i] == 'U')

                        caratteriDispari += 16;

                    else if(lettereCf[i] == 'V')

                        caratteriDispari += 10;

                    else if(lettereCf[i] == 'W')

                        caratteriDispari += 22;

                    else if(lettereCf[i] == 'X')

                        caratteriDispari += 25;

                    else if(lettereCf[i] == 'Y')

                        caratteriDispari += 24;

                    else if(lettereCf[i] == 'Z')

                        caratteriDispari += 23;

                }

            }
        }

        resto = ((caratteriDispari + caratteriPari) % 26);

        carattereControllo = (char) ('A' + resto);

        return carattereControllo;

    }

}


