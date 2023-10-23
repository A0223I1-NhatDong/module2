package _01_introduction_java.exercise;

import java.util.ArrayList;

public class dsSinhVien {
    private ArrayList<SinhVien> danhSach;

    public dsSinhVien() {
       this.danhSach = new ArrayList<SinhVien>();

    }

    public dsSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    // Thêm Sinh viên vào ds
    public void themSinhVien (SinhVien sv) {
        this.danhSach.add(sv);
    }
    // In danh sách sinh viên
    public void inDanhSachSinhVien () {
        for(SinhVien sinhVien: danhSach) {
            System.out.println(sinhVien);
        }
    }
    // Kiểm tra ds có rỗng hay không
    public boolean kiemTraDanhSachRong () {
        return this.danhSach.isEmpty();
    }
    // Lấy ra số lượng sv trong ds
    public int laySoLuongSinhVien () {
        return this.danhSach.size();
    }
    // Làm rỗng ds
    public void lamRongDanhSach () {
        this.danhSach.removeAll(danhSach);
    }
}
