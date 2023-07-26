package _03_array_method.practice;

import java.util.Scanner;

public class solanxuathienkitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhập chuỗi : ");
        String str = sc.nextLine();
        System.out.print("Nhập ký tự bạn muôn đếm :");
        char a = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==a) {
                count++;
            }

        }
        System.out.println("Ký tự vừa nhập có số đếm là : " + count);
    }
}
