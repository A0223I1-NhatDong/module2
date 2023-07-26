package _03_array_method.practice;

import java.util.Arrays;
import java.util.Scanner;

public class thempt {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int thempt = sc.nextInt();
        int [] brr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr [i];
        }
        brr [brr.length -1 ] = thempt;
        arr = brr;
        System.out.println(Arrays.toString(arr));
}
}
