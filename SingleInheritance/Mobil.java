public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int jumlahPintu) {
        super(merk);
        this.jumlahPintu = jumlahPintu;
    }

    public void klakson() {
        System.out.println("Mobil " + merk + " dengan " + jumlahPintu + " pintu membunyikan klakson!");
    }
}
