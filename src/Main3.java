public class Main3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Reksio", 6, "Owczrek");
        /*dog1.name = "Reksio";
        dog1.age = 6;
        dog1.race = "Owczarek";*/

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.race);

        Dog dog2 = new Dog("Max", 10, "Sznaucer");

        System.out.println(dog2.name);
        System.out.println(dog2.age);
        System.out.println(dog2.race);

        Square square = new Square();

        System.out.println(square.bok);
        System.out.println(square.obwod);
    }
}
