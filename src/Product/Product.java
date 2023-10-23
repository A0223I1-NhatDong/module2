package Product;

public class Product {
    private String tenSanPham;

    public Product(String tenSanPham) {

    }

//

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = (int) gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String nhaSanXuat;
    private int gia;

    public Product(String tenSanPham, String nhaSanXuat, float gia, int id) {
        this.tenSanPham = tenSanPham;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = (int) gia;
        this.id = id;
    }

    private int id;

    @Override
    public String toString() {
        return "Product{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                ", gia=" + gia +
                ", id=" + id +
                '}';
    }
}