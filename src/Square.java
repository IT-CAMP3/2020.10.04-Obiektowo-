public class Square {
    int bok;
    int obwod;
    int pole;
    double przekatna;

    Square(int bok) {
        this.bok = bok;
        this.obwod = bok*4;
        this.pole = bok*bok;
        this.przekatna = Math.sqrt(2)*bok;
    }

    Square() {
        System.out.println("Zrobiłęm pusty kwadrat !!");
    }
}
