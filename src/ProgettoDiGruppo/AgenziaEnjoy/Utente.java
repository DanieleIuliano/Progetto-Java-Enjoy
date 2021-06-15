package ProgettoDiGruppo.AgenziaEnjoy;

import ProgettoDiGruppo.AgenziaEnjoy.CodiceFiscale.FiscalCodeConf;
import ProgettoDiGruppo.AgenziaEnjoy.CodiceFiscale.FiscalCodeValidator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Utente {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String localFile = "codice-istat-comuni.csv";
        int maxComuneNameLength = 25;
        String maleValue = "M";
        int yearStart = 8;
        int yearEnd = 10;
        int monthStart = 3;
        int monthEnd = 5;
        int dayStart = 0;
        int dayEnd = 2;
        String codiciIstatStr = readLocalFile(localFile);

        FiscalCodeConf configuration = FiscalCodeValidator.getFiscalCodeConf(codiciIstatStr,
                maxComuneNameLength, maleValue, yearStart, yearEnd, monthStart, monthEnd, dayStart, dayEnd);

        String surname = "IULIANO";
        String name = "DANIELE";
        String birthDate = "19/12/1996";
        String townOfBirth = "MARCIANISE";
        String gender = "M";

        String[] validFiscalCodes = FiscalCodeValidator.calcoloCodiceFiscale(configuration, surname,
                name, birthDate, townOfBirth, gender);

        for (int i = 0; i < validFiscalCodes.length; i++) {
            System.out.println(validFiscalCodes[i]);
        }
    }

    private static String readLocalFile(String filePath) throws IOException, URISyntaxException {
        return new String(Files.readAllBytes(Path.of("C:\\Users\\Coldfierz\\Desktop\\Classroom java Developer Webtreeschool\\Repositori-esercizi-Github\\Progetto Java Enjoy\\src\\ProgettoDiGruppo\\AgenziaEnjoy\\CodiceFiscale\\Libraries\\codice-istat-comuni.csv")));
    }

}


