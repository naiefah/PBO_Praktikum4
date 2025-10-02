public class SmartLingkaran extends Lingkaran implements Elektronik, Mesin {
    private String namaPerangkat;
    private int dayaMesin;

    public SmartLingkaran(String warna, double jariJari, String namaPerangkat, int dayaMesin) {
        super(warna, jariJari);
        this.namaPerangkat = namaPerangkat;
        this.dayaMesin = dayaMesin;
    }

    // Getter
    public String getNamaPerangkat() {
        return namaPerangkat;
    }

    public int getDayaMesin() {
        return dayaMesin;
    }

    // Implementasi Elektronik
    public void hidupkan() {
        System.out.println(namaPerangkat + " dihidupkan.");
    }

    public void matikan() {
        System.out.println(namaPerangkat + " dimatikan.");
    }

    // Implementasi Mesin
    public void nyalakanMesin() {
        System.out.println("Mesin dengan daya " + dayaMesin + " watt dinyalakan.");
    }

    public void matikanMesin() {
        System.out.println("Mesin dengan daya " + dayaMesin + " watt dimatikan.");
    }
}
