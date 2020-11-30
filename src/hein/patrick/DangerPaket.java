package hein.patrick;

public class DangerPaket extends Paket {
    public String gefahrenKategorie = "";

    public DangerPaket(String gefahrenKategorie, double sizeInCm, double weightInKg, Adressdaten adressdaten) {
        super(sizeInCm, weightInKg, true, adressdaten);
        this.gefahrenKategorie = gefahrenKategorie;
    }

    @Override
    public String toString() {
        return "!!!!!!!" + super.toString();
    }

    public void abc() {
        System.out.println("ABC!");
    }
}
