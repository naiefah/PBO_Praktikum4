public class Mamalia extends Hewan {
    private int jumlahKaki;

    public Mamalia(String nama, int jumlahKaki) {
        super(nama);
        this.jumlahKaki = jumlahKaki;
    }

    public void berlari() {
        System.out.println(nama + " berlari dengan " + jumlahKaki + " kaki.");
    }
}
