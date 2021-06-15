package ProgettoDiGruppo.Veicoli.CoordinateGeografiche;

// serve a tener traccia della posizione del veicolo
public class GeoPosizione {
    double[] PosIniziale ;
    double[] PosFinale;

    /**
     * Metodo che calcola la distanza date due longitudini e due latitudini in Km
     * @param latitude1 .
     * @param longitude1 .
     * @param latitude2 .
     * @param longitude2 .
     * @return
     */
    public double distance(double latitude1, double longitude1, double latitude2, double longitude2) {
        double d2r = Math.PI / 180;

        double dlong = (longitude2 - longitude1) * d2r;
        double dlat = (latitude1 - latitude2) * d2r;
        double a = Math.pow(Math.sin(dlat / 2.0), 2) + Math.cos(latitude2 * d2r)
                * Math.cos(latitude1 * d2r) * Math.pow(Math.sin(dlong / 2.0), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = 6367 * c;
        return distance;

    }
}
