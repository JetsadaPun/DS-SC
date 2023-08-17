package SoftwareCon.car;

public class Main {
    public static void main(String[] Args) {
        demo1();
    }

    public static void demo1() {
        SedanAbs s = new SedanAbs();
        System.out.println(s.cashRate());
        VehicleAbs v = new SedanAbs();
        System.out.println(v.epassRate());
        VehicleAbs b = new BusAbs();
        System.out.println(b.cashRate());
        System.out.println(b.epassRate());
    }
}
