package _03_array_method.practice;

import java.util.Scanner;

public class maxinjava {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng : ");
        m = sc.nextInt();
        System.out.print("Nhập số cột :");
        n = sc.nextInt();
        int A [][] = new int[m][n];
        System.out.print("Nhập các phần tử ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = sc.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]){
                    max=A[i][j];
                }
            }

        }
        System.out.println("Phần tử lớn nhất là : " + max);
    }
}
