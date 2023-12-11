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

    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public UUID getId() {
        return id;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Targy{" + "nev=" + nev + '}';
    }

}
