package _03_array_method.practice;

import java.util.Scanner;

public class tinhtongcotmatran {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bậc của ma trận : ");
        n = Integer.parseInt(sc.nextLine());
        int arr[][] = new int[n][n];
        System.out.println("Nhập các phần tử ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Arr[" + i + "][" + j + "] = ");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }

        }
        System.out.println("Ma trận vừa nhập là :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println("\n");

        }

        int res = 0;
        System.out.print("Nhập cột để tính tổng : ");
       int cot = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i== cot){
                    res += arr[i][i];
                }

            }
        }
        System.out.println(res);
    }

}
