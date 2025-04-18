package buoi6.demo1;

public class Vuong extends ChuNhat {

    public Vuong(double newCanh){
        super(newCanh, newCanh);
    }

    public double getChuVi(){
        return rong * 4;
    }

    public double getDienTich(){
        return rong * rong;
    }

    
}