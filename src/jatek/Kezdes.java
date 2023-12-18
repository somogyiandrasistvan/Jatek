package jatek;

public class Kezdes extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Ez a kezdés! Jobbra vagy balra?";
    }

    @Override
    public String egyikBtnFelirat() {
        return "jobbra";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobbra();
    }
    
    

}
