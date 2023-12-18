package jatek;

public class Balra extends Helyszin {

    @Override
    public String leiras() {
        return "Ez balra van! Keletra vagy Nyugatra?";
    }

    @Override
    public String egyikBtnFelirat() {
        return "keletre";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
