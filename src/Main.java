public class Main {
    public static void main(String[] args) {

        int i;
        Client c;

        c = new Client();

        c.name = "Janusz";
        c.surname = "Kowalski";
        c.age = 50;
        c.weight = 90.7;

        Client c2 = new Client();
        c2.name = "Mzteusz";
        c2.surname = "Bereda";
        c2.age = 29;
        c2.weight = 90.0;

        System.out.println(c2.name);
        System.out.println(c2.surname);
        System.out.println(c2.age);
        System.out.println(c2.weight);


        int a = 5;

        System.out.println(a);

        System.out.println(c);

        Client c3;
        c3 = new Client();

        Client c4;
        c4 = c3;
        c3.name = "Mateusz";

        System.out.println(c3.name);
        System.out.println(c4.name);


    }
}
