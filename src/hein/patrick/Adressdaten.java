package hein.patrick;

public class Adressdaten {
    private String absender;
    private String zielAdresse;

    public Adressdaten(String absender, String zielAdresse) {
        this.absender = absender;
        this.zielAdresse = zielAdresse;
    }

    public String getAbsender() {
        return absender;
    }

    public String getZielAdresse() {
        return zielAdresse;
    }

    @Override
    public String toString() {
        return "Adressdaten{" +
                "absender='" + absender + '\'' +
                ", zielAdresse='" + zielAdresse + '\'' +
                '}';
    }
}
