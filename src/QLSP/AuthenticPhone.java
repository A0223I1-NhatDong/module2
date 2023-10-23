package QLSP;

public class AuthenticPhone extends Phone {

    private int granteeByYear;
    private int quantity;

    public AuthenticPhone(int id, String name, Double price, String manufacturer, int granteeByYear, int quantity) {
        super(id, name, price, manufacturer,quantity);
        this.granteeByYear = granteeByYear;
        this.quantity = quantity;
    }

//    public AuthenticPhone(int id, String name, Double price, String manufacture, int granteeByYear, int quantity, int limit) {
//        super();
//    }

    public AuthenticPhone(int id, String name, Double price, String manufacture, int granteeByYear, String quantity) {
    }


    public int getGranteeByYear() {
        return granteeByYear;
    }

    public void setGranteeByYear(int granteeByYear) {
        this.granteeByYear = granteeByYear;
    }

    public int quantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "AuthenticPhone{" +
                super.toString() +
                ",granteeByYear=" + granteeByYear +
                ", quantity='" + quantity + '\'' +
                '}';
    }

    @Override
    public String toPhone() {
        return String.format("Authentic,%s,%s,%s,%s,%s,%s", getId(), getName(), getPrice(), getManufacturer(), granteeByYear, quantity);
    }

}

