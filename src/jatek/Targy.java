package jatek;

import java.util.UUID;

public class Targy {

    private String nev, leiras;
    UUID id;

    public Targy(String nev, String leiras) {
        this.leiras = leiras;
        this.nev = nev;
        id = UUID.randomUUID();
    }

}
