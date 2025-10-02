public class Bentuk {
    protected String namaBentuk;
    protected String warna;

    public Bentuk(String namaBentuk, String warna) {
        this.namaBentuk = namaBentuk;
        this.warna = warna;
    }

    public void menggambar() {
        System.out.println("Menggambar bentuk " + namaBentuk + " berwarna " + warna);
    }
}
