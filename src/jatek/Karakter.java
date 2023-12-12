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
        hasznal(nev, db, true);
    }

    public void hasznal(String nev, int db, boolean levon) {
        int i = felszereles.size() - 1;
        int dbI = 0;
        int szamlalo = 0;

        while (i > -1) {
            if (felszereles.get(i).getNev().equals(nev) && dbI < db) {
                szamlalo++;
                dbI++;
                if (levon) {
                    felszereles.remove(i);
                }
            }
            i--;
        }
        if (szamlalo == 0) {
            System.out.println(nev + " nincs ilyen tárgy");
        } else if (levon && dbI == db || levon && db > szamlalo) {
            System.out.println(dbI + " felhasznalva ebbol: " + nev);
        } else if (levon == false) {
            System.out.println(szamlalo + "/" + db + " nem lett felhasználva ebbol: " + nev);
        }
    }

    @Override
    public String toString() {
        return "Karakter{" + "felszereles=" + felszereles + '}';
    }

}
