package jatek;

public class Kezdes extends Helyszin { 

    @Override
    public String leiras() {
        return "Ez a kezdés!";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Nem tudjuk, hova a kezdésoldalról???"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
