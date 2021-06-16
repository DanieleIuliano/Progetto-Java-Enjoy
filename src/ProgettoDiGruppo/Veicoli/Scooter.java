package ProgettoDiGruppo.Veicoli;

import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

public class Scooter extends Veicolo{
    String targa;
    TipoPatente patente = TipoPatente.A;
    int percentualeCarburante;

    public Scooter(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato, String targa, TipoPatente patente, int percentualeCarburante) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, affittato);
        this.targa = targa;

        this.percentualeCarburante = this.percentualeCarburante;
    }


    @Override
    public boolean checkPatente() {
        if(patente.equals(TipoPatente.A) || patente.equals(TipoPatente.C)){
            return true;
        }
        return false;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
}
