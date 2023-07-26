package _03_array_method.practice;

import java.util.Arrays;
import java.util.Scanner;

public class mininjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng ");
        int kichthuoc = Integer.parseInt(sc.nextLine());
        int [] arr = new int[kichthuoc];
        int index = 0 ;
        do {
            System.out.println("Nhập phần tử thứ  : " + index);
            int giatri = Integer.parseInt(sc.nextLine());
            arr[index] = giatri;
            index ++;
        }while (index < kichthuoc);
        System.out.println("Mảng : ");
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr [i];
            }
            
        }
        System.out.println("Giá trị nhỏ nhất là : " + min);

    }
}
