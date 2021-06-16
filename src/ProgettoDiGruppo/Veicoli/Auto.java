package ProgettoDiGruppo.Veicoli;


import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

public class Auto extends Veicolo{

    private String targa;
    private TipoPatente patente = TipoPatente.B;

    int percentualeCarburante;

    public Auto(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, String targa) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, false);
        super.setTipoCarburante(TipoCarburante.carburante);
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "Targa = '" + targa + "marca='"+getMarca()+"tarrifa al Minuto='"+ getTariffaMinuti()+"TipoCarburante'"+getTipoCarburante()+
                '}';
    }

    public Auto(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, String targa, TipoPatente patente, int percentualeCarburante) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, false);
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
