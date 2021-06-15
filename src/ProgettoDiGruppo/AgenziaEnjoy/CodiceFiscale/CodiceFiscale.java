package ProgettoDiGruppo.AgenziaEnjoy.CodiceFiscale;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CodiceFiscale {
    public String codiceFiscale(String surname, String name, String birthDate, String townOfBirth, String gender) throws IOException, URISyntaxException {
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

        String[] validFiscalCodes = FiscalCodeValidator.calcoloCodiceFiscale(configuration, surname,
                name, birthDate, townOfBirth, gender);

        String codiceFiscale = "";
        for (int i = 0; i < validFiscalCodes.length; i++) {
            codiceFiscale = codiceFiscale+validFiscalCodes[i];
        }
        return codiceFiscale;
    }


    private static String readLocalFile(String filePath) throws IOException, URISyntaxException {
        return new String(Files.readAllBytes(Path.of("C:\\Users\\Coldfierz\\Desktop\\Classroom java Developer Webtreeschool\\Repositori-esercizi-Github\\Progetto Java Enjoy\\src\\ProgettoDiGruppo\\AgenziaEnjoy\\CodiceFiscale\\Libraries\\codice-istat-comuni.csv")));
    }
}
