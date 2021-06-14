package ProgettoDiGruppo.Veicoli;


public class Auto extends Veicolo implements VeicoloAmotore{
    String targa;
    TipoPatente patente = TipoPatente.B;
    int percentualeCarburante;

    @Override
    public void consumo() {

    }
}
