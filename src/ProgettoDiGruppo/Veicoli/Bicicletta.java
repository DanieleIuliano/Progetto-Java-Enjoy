package ProgettoDiGruppo.Veicoli;

import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

public class Bicicletta extends Veicolo{

    public Bicicletta(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, affittato);
        super.setTipoCarburante(TipoCarburante.nessunCarburante);
    }

    @Override
    public String toString() {
        return "Bicicletta{ "+"marca='"+getMarca()+"tarrifaMinuti='"+ getTariffaMinuti()+"TipoCarburante='"+getTipoCarburante()+" }";
    }

    @Override
    public boolean checkPatente() {
      return true;
    }


}
