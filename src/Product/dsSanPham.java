package Product;

import java.util.ArrayList;

public class dsSanPham {
    private ArrayList <Product> danhSach;

    public dsSanPham() {
        this.danhSach = new ArrayList<Product>();
    }

    public dsSanPham(ArrayList<Product> danhSach) {
        this.danhSach = danhSach;
    }
    // 1 Thêm sản phẩm
    public void addSanPham(Product product) {
        this.danhSach.add(product);
    }
    // 2 In danh sách
    public void inDanhSach () {
        for (Product product : this.danhSach ) {
            System.out.println(product);
        };
    }
    // 3 Tìm kiếm
public void  timKiem(String tenSanPham) {
        for (Product product : this.danhSach) {
            if (product.getTenSanPham().indexOf(tenSanPham)>=0) {
                System.out.println(product);
            }
        }
}


//4 Xoá
    public void xoa (int id) {
        for (int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == id){
                this.danhSach.remove(i);
            }
        }
    }

}