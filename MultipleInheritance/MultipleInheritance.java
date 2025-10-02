public class MultipleInheritance {
    public static void main(String[] args) {
        Robot r = new Robot("RoboX", 1500);
        System.out.println("Nama Robot: " + r.getNama());
        System.out.println("Daya Mesin: " + r.getDayaMesin() + " watt");

        r.hidupkan();
        r.nyalakanMesin();
        r.matikanMesin();
        r.matikan();
    }
}
