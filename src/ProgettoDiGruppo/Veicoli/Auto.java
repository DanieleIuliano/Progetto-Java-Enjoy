package ProgettoDiGruppo.Veicoli;


import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

public class Auto extends Veicolo{

    String targa;
    TipoPatente patente = TipoPatente.B;
    int percentualeCarburante;

    public Auto(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, affittato);
    }

    public Auto(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato, String targa, TipoPatente patente, int percentualeCarburante) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, affittato);
        this.targa = targa;
        this.patente = patente;
        this.percentualeCarburante = percentualeCarburante;
    }
}
