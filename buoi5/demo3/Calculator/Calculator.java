package buoi5.demo3.Calculator;

public class Calculator {
    protected int soA;
    protected int soB; 

    public Calculator(){
        
    }
    

    public Calculator(int newSoA, int newSoB){
        this.soA = newSoA;
        this.soB = newSoB;
    }

    public int tong(){
        return soA + soB;
    }

    public int hieu(){
        return  soA - soB;
    }

    
}
