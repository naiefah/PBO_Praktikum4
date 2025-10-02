public class Persegi extends Bentuk {
    private double sisi;

    public Persegi(String warna, double sisi) {
        super("Persegi", warna);
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}
