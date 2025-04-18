package buoi6.demo1;

public class ChuNhat {
    protected double dai, rong;

    public ChuNhat(){
        
    }

    public ChuNhat(double newDai, double newRong){
        this.dai = newDai;
        this.rong = newRong;

    }

    public double getChuVi(){
        return (dai + rong)*2;
    }
    
    public double getDienTich(){
        return dai * rong;
    }

    public void xuat(){
        System.out.println("dai : "+dai+ "rong : "+rong);
        System.out.println("chu vi : " +getChuVi());
        System.out.println("dien tich : "+ getDienTich());
    }
}