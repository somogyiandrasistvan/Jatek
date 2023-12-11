package jatek;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles;
    private static final Random rnd = new Random();
    private Targy t;

    public Karakter() {
        eletero = rnd.nextInt(1, 7) + rnd.nextInt(1, 7) + 12;
        ugyesseg = rnd.nextInt(1, 7) + 6;
        szerencse = rnd.nextInt(1, 7) + 6;
        felszereles = new ArrayList<>();
    }

    public void felvesz(Targy targy) {
        felvesz(targy, 1);
    }

    public void felvesz(Targy targy, int db) {
        for (int i = 0; i < db; i++) {
            felszereles.add(targy);
        }
    }

    public void hasznal(String nev) {
        hasznal(nev, 1);

    }

    public void hasznal(String nev, int db) {
        hasznal(nev, db, false);
    }

    public ArrayList<String> hasznal(String nev, int db, boolean levon) {
        int i = 0;
        int dbI = 0;
        ArrayList<String> tmp = new ArrayList<>();

        while (i < felszereles.size()) {
            if (felszereles.get(i).getNev().equals(nev) && dbI < db) {
                felszereles.remove(i);
                tmp.add(nev);
                dbI++;
            }
            i++;
        }
        return tmp;
    }

    @Override
    public String toString() {
        return "Karakter{" + "felszereles=" + felszereles + '}';
    }

}
