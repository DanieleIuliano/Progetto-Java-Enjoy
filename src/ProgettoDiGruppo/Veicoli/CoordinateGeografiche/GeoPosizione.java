package ProgettoDiGruppo.Veicoli.CoordinateGeografiche;

// serve a tener traccia della posizione del veicolo
public class GeoPosizione {

    /**
     * Metodo che calcola la distanza date due longitudini e due latitudini in Km
     * @param latitudinePartenza .
     * @param longitudinePartenza .
     * @param latitudineFinale .
     * @param longitudineFinale .
     * @return
     */
    public double distance(double latitudinePartenza, double longitudinePartenza, double latitudineFinale, double longitudineFinale) {
        double d2r = Math.PI / 180;

        double dlong = (longitudineFinale - longitudinePartenza) * d2r;
        double dlat = (latitudinePartenza - latitudineFinale) * d2r;
        double a = Math.pow(Math.sin(dlat / 2.0), 2) + Math.cos(latitudineFinale * d2r)
                * Math.cos(latitudinePartenza * d2r) * Math.pow(Math.sin(dlong / 2.0), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = 6367 * c;
        return distance;

    }
}
