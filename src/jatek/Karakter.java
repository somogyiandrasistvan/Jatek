package jatek;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles;
    private Random rnd;

    public Karakter() {
        eletero = rnd.nextInt(1, 7) + rnd.nextInt(1, 7) + 12;
        ugyesseg = rnd.nextInt(1, 7) + 6;
        szerencse = rnd.nextInt(1, 7) + 6;
    }

    public void felvesz(Targy targy) {
        felvesz(targy, 1);
    }

    public void felvesz(Targy targy, int db) {
        for (int i = 0; i < db; i++) {
            felszereles.add(targy);
        }
    }

}
