package _01_introduction_java.practice;

import java.util.Scanner;

public class Changer_number_word {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println("Nhập số cần đổi :");
        switch (num){
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Tue");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Night");
            default -> System.out.println("Can't read this ");
        }

    }
}
