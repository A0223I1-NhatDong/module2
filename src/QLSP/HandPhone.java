
package QLSP;
public class HandPhone extends Phone{
    private String country;
    private String status;

    public HandPhone(int id, String name, Double price, String manufacture, String country, String status, int quantity) {
        super(id, name, price, manufacture,quantity);
        this.country = country;
        this.status = status;
    }

//    public HandPhone(int id, String name, Double price, String manufacture, String country, String status, int quantity) {
//    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandPhone{" +
                "country='" + country + '\'' +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }

    @Override
    public String toPhone() {
        return null;
    }
}
