package ProgettoDiGruppo.Veicoli;

import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

import java.util.UUID;

//classe astratta che gestisce uniqueId
public abstract class Veicolo {

    private final String uniqueId;
    private String marca;
    private double tariffaMinuti;
    private double consumo;
    private GeoPosizione posGeografica;
    private boolean affittato;
    private TipoCarburante tipoCarburante;

    public String getUniqueId() {
        return uniqueId;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTariffaMinuti() {
        return tariffaMinuti;
    }

    public void setTariffaMinuti(double tariffaMinuti) {
        this.tariffaMinuti = tariffaMinuti;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public GeoPosizione getPosGeografica() {
        return posGeografica;
    }

    public void setPosGeografica(GeoPosizione posGeografica) {
        this.posGeografica = posGeografica;
    }

    public boolean isAffittato() {
        return affittato;
    }

    public void setAffittato(boolean affittato) {
        this.affittato = affittato;
    }

    public Veicolo(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato) {

        this.uniqueId = uniqueId;
        this.marca = marca;
        this.tariffaMinuti = tariffaMinuti;
        this.consumo = consumo;
        this.posGeografica = posGeografica;
        setAffittato(false);

    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "marca='" + marca + '\'' +
                ", tariffaMinuti=" + tariffaMinuti +
                ", tipoCarburante=" + tipoCarburante +
                '}';
    }

    public TipoCarburante getTipoCarburante() {

        return tipoCarburante;

    }

    public void setTipoCarburante(TipoCarburante tipoCarburante) {

        this.tipoCarburante = tipoCarburante;

    }

    public abstract boolean checkPatente();
}

