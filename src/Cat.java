public class Cat {
    String name;
    int age;
    String race;
    double weight;

    int miau() {
        System.out.println("Miau !!");
        return 5;
    }

    void miau(int argument) {
        System.out.println("Miau miau !!");
    }

    void miau(String argument) {
        System.out.println("Miau miau !!");
    }

    int power(int base) {
        System.out.println(base * base);
        return base * base;
    }

    int calculate(int a, int b) {
        return a+b;
    }

    int calculate(double a, double b) {
        return (int) (a+b);
    }

    int calculate(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
