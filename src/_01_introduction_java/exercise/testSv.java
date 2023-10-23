package _01_introduction_java.exercise;

import java.util.Scanner;

public class testSv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dsSinhVien dssv= new dsSinhVien();
        int luaChon = 0;
        do {
            System.out.println("Menu---------");
            System.out.println("Vui lòng chọn chức năng  ");
            System.out.println(
               "1 : Thêm sinh viên vào danh sách\n" +
                       "2 : In danh sách sinh viên ra màn hình \n" +
                       "3 : Kiểm tra danh sách có rỗng hay không \n" +
                       "4 : Lấy ra số lượng sinh viên trong danh sách \n" +
                       "5 : Làm rỗng danh sách sinh viên \n" +
                       "6 : Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên\n" +
                       "7 : Xoá một sinh viên ra khỏi danh sách dựa trên mã sinh viên\n" +
                       "8 : Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím \n" +
                       "9 : Xuất ra danh sách sinh viên có điểm từ cao đến thấp \n" +
                       "0 : Thoát khỏi chương trình "
            );
            luaChon = sc.nextInt();
            sc.nextLine();
               if (luaChon ==1){
                   System.out.print("Nhập mã sinh viên : "); String maSinhVien = sc.nextLine();
                   System.out.print("Nhập Họ và tên : "); String hoVaTen = sc.nextLine();
                   System.out.print("Nhập năm sinh : "); int namSinh = sc.nextInt();
                   System.out.print("Nhập điểm trung bình : "); float diemTrungBinh = sc.nextFloat();
                   SinhVien sv = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
                   dssv.themSinhVien(sv);
               }else if (luaChon==2){
                   dssv.inDanhSachSinhVien();
               }else if (luaChon==3) {
                   System.out.println("Danh sách rỗng " + dssv.kiemTraDanhSachRong());
               }else if (luaChon==4){
                   System.out.println("Số lượng sinh viên :" + dssv.laySoLuongSinhVien());
               }else if (luaChon==5){
                   System.out.println("Làm rô");
               }else if (luaChon==6){
               }else if (luaChon==7){
               }else if (luaChon==8){
               }else if (luaChon==9){
               }
        }while (luaChon!=0);
    }
}
