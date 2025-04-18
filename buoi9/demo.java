package buoi9;

public class demo {
    // Định nghĩa interface Bay  
interface Bay {  
    void bay(); // Phương thức trừu tượng  
}  

// Lớp trừu tượng DongVat  
abstract class DongVat {  
    protected String ten;  

    public DongVat(String ten) {  
        this.ten = ten;  
    }  

    // Phương thức trừu tượng  
    abstract void keu();  

    // Phương thức cụ thể  
    public void thongTin() {  
        System.out.println("Tên động vật: " + ten);  
    }  
}  

// Lớp Chim kế thừa từ DongVat và thực hiện interface Bay  
class Chim extends DongVat implements Bay {  
    public Chim(String ten) {  
        super(ten);  
    }  

    // Cài đặt phương thức trừu tượng  
    @Override  
    void keu() {  
        System.out.println(ten + " đang kêu: " + "Cúc cu!");  
    }  

    // Cài đặt phương thức từ interface Bay  
    @Override  
    public void bay() {  
        System.out.println(ten + " đang bay trên trời.");  
    }  
}  

// Lớp Ruou kế thừa từ DongVat  
class Ruou extends DongVat {  
    public Ruou(String ten) {  
        super(ten);  
    }  

    // Cài đặt phương thức trừu tượng  
    @Override  
    void keu() {  
        System.out.println(ten + " đang kêu: " + "Ru rú!");  
    }  
}  

// Lớp Main để chạy chương trình  
public class Main {  
    public static void main(String[] args) {  
        Chim chim = new Chim("Chim sẻ");  
        chim.thongTin(); // Thông tin về động vật  
        chim.keu();      // Gọi tiếng kêu  
        chim.bay();      // Động vật bay  

        Ruou ruou = new Ruou("Rùa");  
        ruou.thongTin(); // Thông tin về động vật  
        ruou.keu();      // Gọi tiếng kêu  
        // ruou.bay();   // Không thể gọi bay() vì Rùa không thực hiện interface Bay  
    }  
}  
}
