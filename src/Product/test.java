package Product;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        dsSanPham dssp = new dsSanPham();
        do {
            System.out.println("-------Menu------");            System.out.println("  VUI LÒNG CHỌN CHỨC NĂNG");
            System.out.println(
                    "1 :Thêm sản phẩm\n" +
                            "2 : Danh sách sản phẩm\n" +
                            "3 :Tìm kiếm sản phẩm\n" +
                            "4 :Xoá sản phẩm\n" +
                            "0 :Thoát khỏi chương trình "
            );
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.print("Nhập tên sản phẩm : "); String tenSanPham = sc.nextLine();
                System.out.print("Nhập nhà sản xuất : ");
                String nhaSanXuat = sc.nextLine();
                System.out.print("Nhập giá sản phẩm : ");
                float gia = sc.nextFloat();
                System.out.print("Nhập id sản phẩm : ");
                int id = sc.nextInt();
                Product add = new Product(tenSanPham, nhaSanXuat, gia, id);
                System.out.println(add.getGia());
                dssp.addSanPham(add);
            } else if (luaChon == 2) {
                dssp.inDanhSach();
            } else if (luaChon == 3) {
                System.out.println("Nhập tên sản phẩm : ");
                String tenSanPham = sc.nextLine();
                System.out.println(" Kết quả tìm kiếm ");
                dssp.timKiem(tenSanPham);
            } else if (luaChon == 4) {
                System.out.println("Nhập số ID sản phẩm cần xoá :");
                int id = sc.nextInt();
                dssp.xoa(id);
            }
        } while (luaChon != 0);
    }
}
//Thêm sản phẩm
//Danh sách sản phẩm
//Tìm kiếm sản phẩm
//Xoá sản phẩm
// Thoát khỏi chương trình
