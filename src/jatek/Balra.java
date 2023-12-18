package jatek;

public class Balra extends Helyszin implements MasikIrany {

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
        throw new UnsupportedOperationException("keletre nincs osztály"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String masikBtnFelirata() {
        return "nyugatra";
    }

    @Override
    public Helyszin masikIrany() {
        throw new UnsupportedOperationException("nyugatra nincs osztály"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
