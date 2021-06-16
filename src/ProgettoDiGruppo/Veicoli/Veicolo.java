package ProgettoDiGruppo.Veicoli;

import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

import java.util.UUID;

//classe astratta che gestisce uniqueId
public abstract class Veicolo {
    final String uniqueId;
    String marca;
    double tariffaMinuti;
    double consumo;
    GeoPosizione posGeografica;
    boolean affittato;
    TipoCarburante tipoCarburante;

    public Veicolo(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato) {
        this.uniqueId = uniqueId;
        this.marca = marca;
        this.tariffaMinuti = tariffaMinuti;
        this.consumo = consumo;
        this.posGeografica = posGeografica;
        this.affittato = affittato;
    }

    public TipoCarburante getTipoCarburante() {
        return tipoCarburante;
    }

    public void setTipoCarburante(TipoCarburante tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }
}
