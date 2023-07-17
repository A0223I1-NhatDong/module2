package _02_loop_in_java.practice;

import java.util.Scanner;

public class b2_vehinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập chiều dài ");
        int cd = Integer.parseInt(sc.nextLine());
        System.out.print("Mời bạn nhập chiều rộng");
        int cr = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cd; i++) {
            for (int j = 0; j < cr; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Nhập chiều cao của tam giác: ");
        int chieucao1 = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= chieucao1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.print("Nhập chiều cao của tam giác ");
        int chieucao2 = Integer.parseInt(sc.nextLine());
        for (int i = chieucao2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


