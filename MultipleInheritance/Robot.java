public class Robot implements Elektronik, Mesin {
    private String nama;
    private int dayaMesin;

    public Robot(String nama, int dayaMesin) {
        this.nama = nama;
        this.dayaMesin = dayaMesin;
    }

    public String getNama() {
        return nama;
    }

    public int getDayaMesin() {
        return dayaMesin;
    }

    @Override
    public void hidupkan() {
        System.out.println(nama + " dihidupkan.");
    }

    @Override
    public void matikan() {
        System.out.println(nama + " dimatikan.");
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin dengan daya " + dayaMesin + " watt dinyalakan.");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mesin dengan daya " + dayaMesin + " watt dimatikan.");
    }
}
