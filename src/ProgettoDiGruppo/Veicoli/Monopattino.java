package ProgettoDiGruppo.Veicoli;

import ProgettoDiGruppo.Veicoli.CoordinateGeografiche.GeoPosizione;

public class Monopattino extends Veicolo{
    int percentualeElettricita;


    public Monopattino(String uniqueId, String marca, double tariffaMinuti, double consumo, GeoPosizione posGeografica, boolean affittato) {
        super(uniqueId, marca, tariffaMinuti, consumo, posGeografica, affittato);
        setTipoCarburante(TipoCarburante.elettrico);
    }

    @Override
    public String toString() {
        return "Monopattino{" +
                "marca='"+getMarca()+"tarrifaMinuti='"+ getTariffaMinuti()+"TipoCarburante'"+getTipoCarburante()+
                '}';
    }

    @Override
    public boolean checkPatente() {
        return true;
    }
}
