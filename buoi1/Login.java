package buoi1;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "hello";
        String userInput, passInput;
        System.out.print("Nhap username");
        userInput = sc.nextLine();
        System.out.print("Nhap pass");
        passInput = sc.nextLine();
        if(userInput.equalsIgnoreCase(user) && passInput.length() >= 6){
            System.out.print("Dang nhap thanh cong");
        }else{
            System.out.print("Dang nhap that bai");
        }
    }
}
