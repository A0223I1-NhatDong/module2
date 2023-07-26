package _03_array_method.practice;

import java.util.Scanner;

public class b1_xoapt {
    public static void main(String[] args) {
        int daySo[] = {1, 2, 3, 4, 5, 6, 8, 7, 9};
        Scanner sc = new Scanner(System.in);
        int soCanXoa = sc.nextInt();
        int viTriCanXoa = timViTriPhanTu(daySo, soCanXoa);
        if (viTriCanXoa == -1) {
            System.out.println("Phần tử không có trong mảng ");
        } else {
            daySo = xoaMotPhanTu(daySo, viTriCanXoa);
        }
        for (int i = 0; i < daySo.length; i++) {
            System.out.println(daySo[i] + "\t");

        }
    }

    static int timViTriPhanTu(int[] daySo, int phanTu) {
        int viTri = -1;
        for (int i = 0; i < daySo.length; i++) {
            if (daySo[i] == phanTu) {
                viTri = i;
            }

        }
        return viTri;
    }

    static int[] xoaMotPhanTu(int[] daySo, int viTri) {
        int[] daySoMoi = new int[daySo.length -1];
        for (int i = 0; i < viTri; i++) {
            daySoMoi[i] = daySo[i];
        }
        for (int i = viTri + 1; i < daySo.length; i++) {
            daySoMoi[i - 1] = daySo[i];
        }
        return daySoMoi;
    }
}
