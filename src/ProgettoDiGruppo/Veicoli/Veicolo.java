package ProgettoDiGruppo.Veicoli;

import java.util.UUID;

//classe astratta che gestisce uniqueId
public abstract class Veicolo {
    final String uniqueId;
    String marca;
    int tariffaMinuti;

    public Veicolo() {
        this.uniqueId = UUID.randomUUID().toString();
    }

}
