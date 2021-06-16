package ProgettoDiGruppo.Veicoli.CoordinateGeografiche;

// serve a tener traccia della posizione del veicolo
public class GeoPosizione {
    private double latitudePartenza ;
    private double longitudePartenza;

    public GeoPosizione(double latitudePartenza, double longitudePartenza) {
        this.latitudePartenza = latitudePartenza;
        this.latitudePartenza = longitudePartenza;
    }

    /**
     * Metodo che calcola la distanza date due longitudini e due latitudini in Km
     * @param latitudePartenza .
     * @param longitudePartenza .
     * @param latitudeFinale .
     * @param longitudeFinale .
     * @return
     */
    public double distance(double latitudePartenza, double longitudePartenza, double latitudeFinale, double longitudeFinale) {
        double d2r = Math.PI / 180;

        double dlong = (longitudeFinale - longitudePartenza) * d2r;
        double dlat = (latitudePartenza - latitudeFinale) * d2r;
        double a = Math.pow(Math.sin(dlat / 2.0), 2) + Math.cos(latitudeFinale * d2r)
                * Math.cos(latitudePartenza * d2r) * Math.pow(Math.sin(dlong / 2.0), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = 6367 * c;
        return distance;

    }

    public double getLatitudePartenza() {
        return latitudePartenza;
    }

    public void setLatitudePartenza(double latitudePartenza) {
        this.latitudePartenza = latitudePartenza;
    }

    public double getLongitudePartenza() {
        return longitudePartenza;
    }

    public void setLongitudePartenza(double longitudePartenza) {
        this.longitudePartenza = longitudePartenza;
    }
}
