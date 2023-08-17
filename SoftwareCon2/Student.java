package SoftwareCon2;

public class Student {
    private int age;
    private String name;
    private double gpa;

    public Student() {
    }

    public Student(int age, String name, double gpa) {
        this.age = age;
        this.name = name;
        this.gpa = gpa;
    }

    public void printInfo() {
        System.out.println(name + " " + gpa + " " + age);
    }
}
