package ProgettoDiGruppo.Veicoli;


import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

public class Auto extends Veicolo{

    private String targa;
    private TipoPatente patente = TipoPatente.B;

    int percentualeCarburante;

    public Auto(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, affittato);
        super.setTipoCarburante(TipoCarburante.carburante);
    }



    public Auto(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato, String targa, TipoPatente patente, int percentualeCarburante) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, affittato);
        this.targa = targa;
        this.percentualeCarburante = percentualeCarburante;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public TipoPatente getPatente() {
        return patente;
    }


    public int getPercentualeCarburante() {
        return percentualeCarburante;
    }

    public void setPercentualeCarburante(int percentualeCarburante) {
        this.percentualeCarburante = percentualeCarburante;
    }

    @Override
    public boolean checkPatente(){
        if(patente.equals(TipoPatente.B) || patente.equals(TipoPatente.C))return true;
        else return false;
    }
}
