package buoi1;

import java.util.ArrayList;  
import java.util.Collections;
import java.util.Scanner;

public class ArrayListtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("nhap so luong cau hoi");
        int n = scanner.nextInt();
        ArrayList<String> questions = new ArrayList<>();  

        // Nhập  câu hỏi từ người dùng  
        for (int i = 1; i <= n; i++) {  
            System.out.println("Nhap cau hoi " + i + ":");  
            String question = scanner.nextLine();  
            questions.add(question);  
        }  

        // Xáo trộn danh sách câu hỏi  
        Collections.shuffle(questions);  

        // In ra danh sách câu hỏi đã xáo trộn  
        System.out.println("\nCac cau hoi sau khi xaoh:");  
        for (String question : questions) {  
            System.out.println(question);  
        }  

        // Đóng Scanner  
        scanner.close();  
    }
}
