
package jatek;

public class Jobbra extends Helyszin {

    @Override
    public String leiras() {
        return "Ez jobbra van! Északra vagy Délra?";
    }

    @Override
    public String egyikBtnFelirat() {
        return "délre";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
