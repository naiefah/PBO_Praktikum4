public class Kendaraan {
    protected String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void bergerak() {
        System.out.println(merk + " sedang bergerak...");
    }
}
