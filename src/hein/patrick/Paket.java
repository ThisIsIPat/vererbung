package hein.patrick;

public class Paket {
    private double sizeInCm;
    private double weightInKg;
    private boolean gefahrenGut;

    private Adressdaten adressdaten;

    public Paket(double sizeInCm, double weightInKg, boolean gefahrenGut, String absender, String zielAdresse) {
        this(sizeInCm, weightInKg, gefahrenGut, new Adressdaten(absender, zielAdresse));
    }

    public Paket(double sizeInCm, double weightInKg, boolean gefahrenGut, Adressdaten adressdaten) {
        this.sizeInCm = sizeInCm;
        this.weightInKg = weightInKg;
        this.gefahrenGut = gefahrenGut;
        this.adressdaten = adressdaten;
    }

    public void setSizeInCm(double sizeInCm) {
        this.sizeInCm = sizeInCm;
    }

    public double getSizeInCm() {
        return sizeInCm;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public boolean isGefahrenGut() {
        return gefahrenGut;
    }

    public Adressdaten getAdressdaten() {
        return adressdaten;
    }

    @Override
    public String toString() {
        return "Paket{" +
                "sizeInCm=" + sizeInCm +
                ", weightInKg=" + weightInKg +
                ", gefahrenGut=" + gefahrenGut +
                ", adressdaten=" + adressdaten +
                '}';
    }
}
