package ProgettoDiGruppo.Veicoli;

import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

public class Furgoni extends Veicolo  {
    String targa;
    TipoPatente patente = TipoPatente.C;
    int percentualeCarburante=100;

    public Furgoni(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato, String targa, TipoPatente patente, int percentualeCarburante) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, affittato);
        this.targa = targa;
        this.patente = patente;
        this.percentualeCarburante = percentualeCarburante;
        super.setTipoCarburante(TipoCarburante.carburante);
    }


    @Override
    public boolean checkPatente() {
        if(patente.equals(TipoPatente.C)){
            return true;
        }else
        return false;
    }
}
