package hein.patrick;

public class Main {
    public static void main(String[] args) {
        Paket paket1 = new Paket(25.3, 1, false,
                "Abc-Straße 1", "Xyz-Straße 2");
        Paket paket2 = new Paket(2334, 314, true,
                new Adressdaten("X-Straße 0", "Z-Straße 5"));
        Paket paket3 = new DangerPaket("abc", 5, 0.4,
                new Adressdaten("Ruppiner Chaussee 12", "Strasse des 21. Juni 4"));

        System.out.println(paket3);

    }
}
