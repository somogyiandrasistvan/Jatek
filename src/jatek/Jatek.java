package jatek;

public class Jatek {

    public static void main(String[] args) {
        Karakter k = new Karakter();
        k.felvesz(new Targy("akna", "igen"));
        k.felvesz(new Targy("penz", "jajam"), 3);
        k.felvesz(new Targy("zseton", "ja"));
        System.out.println(k.toString());
        k.hasznal("aknaass");
        k.hasznal("penz", 3);
        System.out.println(k.toString());
        
    }

}
