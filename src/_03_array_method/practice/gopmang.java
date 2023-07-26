package _03_array_method.practice;

import java.util.Arrays;
import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
       int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng A :");
        n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < a.length; i++) {
            System.out.print("A : " +i + " = ");
            a[i] = sc.nextInt();
        }
        int m = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng B :");
        m = sc1.nextInt();
        int [] b = new int[m];
        for (int i = 0; i <b.length ; i++) {
            System.out.print("B" + i + " = ");
            b[i] = sc1.nextInt();

        }
        int  c [] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            
        }

        for (int i = a.length; i <c.length ; i++) {
            c[i] = b[i-a.length];
        }

        System.out.println("Mảng có trong C là : " + Arrays.toString(c));
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }
    }
}
