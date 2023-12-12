package jatek;

public class Jatek {

    public static void main(String[] args) {
        Karakter karakter = new Karakter();

        karakter.felvesz(new Targy("d", "d leírás"), 2);
        karakter.felvesz(new Targy("a", "Leírás"), 2);
        karakter.felvesz(new Targy("d", "d leírás"), 2);
        karakter.felvesz(new Targy("b", "b leírás"));
        karakter.felvesz(new Targy("c", "c leírás"), 1);
        karakter.felvesz(new Targy("d", "d leírás"), 2);
        karakter.felvesz(new Targy("a", "Leírás"));
        karakter.felvesz(new Targy("d", "d leírás"), 2);
        karakter.felvesz(new Targy("a", "Leírás"));
        karakter.felvesz(new Targy("d", "d leírás"), 2);
        karakter.felvesz(new Targy("c", "c leírás"), 3);
        System.out.println(karakter.toString());
        karakter.hasznal("a");
        karakter.hasznal("b", 2);
        karakter.hasznal("c", 5, false);
        karakter.hasznal("d", 5);
        karakter.hasznal("x");

        System.out.println(karakter.toString());

    }

}
