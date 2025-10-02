public class HierarchicalInheritance {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran("Merah", 7);
        l.menggambar();
        System.out.println("Luas lingkaran = " + l.hitungLuas());

        Persegi p = new Persegi("Biru", 5);
        p.menggambar();
        System.out.println("Luas persegi = " + p.hitungLuas());
    }
}
