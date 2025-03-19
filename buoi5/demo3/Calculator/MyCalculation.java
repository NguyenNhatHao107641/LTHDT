package buoi5.demo3.Calculator;

public class MyCalculation extends Calculator {
    public MyCalculation(int newSoA, int newSoB){
        super(newSoA,newSoB);
    }
    
    public int tich(){
        return soA*soB;
    }

    public int thuong(){
        return soA/soB;
    }

    public double luyThua(){
        double newSoA = soA;
        double newSoB = soB;
        return Math.pow(newSoA, newSoB);
    }
}
