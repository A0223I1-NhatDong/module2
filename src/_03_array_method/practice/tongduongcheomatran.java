package _03_array_method.practice;

import java.util.Scanner;

public class tongduongcheomatran {
    public static void main(String[] args) {
        int n;
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào bậc của ma trận :");
        n = sc.nextInt();
        int A [][] = new int[n][n];
        System.out.println("Nhập các phần tử :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập là : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");

            }
            System.out.println("\n");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    sum += A[i][j];
                }

            }

        }
        System.out.println("Tổng các phần tử nằm trên đường chéo là : " + sum);
    }
}