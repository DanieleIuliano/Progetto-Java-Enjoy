package ProgettoDiGruppo.Veicoli;

import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

public class Scooter extends Veicolo{
    String targa;
    TipoPatente patente = TipoPatente.A;
    int percentualeCarburante;

    public Scooter(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato, String targa, TipoPatente patente, int percentualeCarburante) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, affittato);
        this.targa = targa;
        if(ckeckPatente(patente)){
            this.patente = this.patente;
        }else System.out.println("non puoi inserire questa patente");

        this.percentualeCarburante = this.percentualeCarburante;
    }

    public boolean ckeckPatente (TipoPatente patente){
        if(patente.equals(TipoPatente.A))return true;
        else return false;
    }
    @Override
    public String toString() {
        return "Scooter{" +
                "targa='" + targa + '\'' +
                ", patente=" + patente +
                ", percentualeCarburante=" + percentualeCarburante +
                '}';
    }
}
