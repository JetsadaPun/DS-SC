package SoftwareCon2_2;

class Test {
    public static void main(String[] args) {
        Boss obj1 = new Boss();
        Slave obj2 = new Slave();
        System.out.println(obj1.Shout());
        System.out.println(obj2.Shout());
        obj1 = obj2;
        System.out.println(obj1.Shout());
    }
}