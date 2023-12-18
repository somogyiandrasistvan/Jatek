
package jatek;

public class Jobbra extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Ez jobbra van! Északra vagy Délre?";
    }

    @Override
    public String egyikBtnFelirat() {
        return "délre";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("délre nincs osztály"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String masikBtnFelirata() {
        return "északra";
    }

    @Override
    public Helyszin masikIrany() {
        throw new UnsupportedOperationException("északra nincs osztály"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
