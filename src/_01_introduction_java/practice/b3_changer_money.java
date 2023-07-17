package _01_introduction_java.practice;

import java.util.Scanner;

public class b3_changer_money {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập USD : ");
        usd = sc.nextDouble();
        double changer = usd*23000;
        System.out.println("Giá trị quy đổi VND là : " + changer);
    }
}
