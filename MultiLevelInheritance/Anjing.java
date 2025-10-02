public class Anjing extends Mamalia {
    private String ras;

    public Anjing(String nama, int jumlahKaki, String ras) {
        super(nama, jumlahKaki);
        this.ras = ras;
    }

    public void menggonggong() {
        System.out.println("Anjing ras " + ras + " menggonggong!");
    }
}
