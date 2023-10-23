package _07_Interface.Resizeable;

public class Circle implements Resizeable{
    private double r;

    public double getR() {
        return r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }
    public double getArea (){
        return Math.PI*this.r*this.r;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void resize(double percent) {

    }
}
