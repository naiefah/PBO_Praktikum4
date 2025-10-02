public class Lingkaran extends Bentuk {
    protected double jariJari;

    public Lingkaran(String warna, double jariJari) {
        super("Lingkaran", warna);
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return 3.14 * jariJari * jariJari;
    }
}
