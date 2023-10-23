package _07_Interface.Resizeable;

public class Square  implements  Resizeable{
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Square(double a) {
        this.a = a;
    }

    public Square() {
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    public double getArea () {
        return  a*a;
    }

    @Override
    public void resize(double percent) {

    }
}
