package buoi5.demo;

public class LaoCong extends Nhanvien {
    private double time;

    public LaoCong(){

    }

    public LaoCong(String hoTen, double luong, double time){
        super(hoTen, luong);
        this.time = time;
    }

    public double getTime(){
        return time;
    }

    public void setTime(double newTime){
        time = newTime;
    }

    public double getThuNhap(){
        return time*luong;
    }

}
