package lesson3.lecture.orderofexec;

public class Main {
    public static void main(String[] args) {
        ClassE ce = new SubClass();
    }

    static void Greet(SubClass c) {
        System.out.println(c.toString());
    }
}
