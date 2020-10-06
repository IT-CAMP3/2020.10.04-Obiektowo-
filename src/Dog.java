public class Dog {
    String name;
    int age;
    String race;

    Dog(String name1, int age1, String race1) {
        name = name1;
        age = age1;
        race = race1;
    }

    void bark() {
        System.out.println("Hau hau !!");
    }

    void barkNTimes(int hauCount) {
        for(int i = 1; i <= hauCount; i++) {
            System.out.println("Hau !!");
        }
    }

    int addNumbers(int number1, int number2) {
        return number1 + number2;
    }
}