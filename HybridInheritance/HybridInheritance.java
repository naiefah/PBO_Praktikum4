public class HybridInheritance {
    public static void main(String[] args) {
        // Objek dari class SmartLingkaran
        SmartLingkaran sl = new SmartLingkaran("Merah", 7, "Smart Drawing Robot", 2000);

        sl.hidupkan();
        sl.nyalakanMesin();
        sl.menggambar();
        System.out.println("Luas lingkaran = " + sl.hitungLuas());
        sl.matikanMesin();
        sl.matikan();

        System.out.println();

        // Objek lain dari hierarki: Persegi biasa
        Persegi p = new Persegi("Biru", 5);
        p.menggambar();
        System.out.println("Luas persegi = " + p.hitungLuas());
    }
}
    