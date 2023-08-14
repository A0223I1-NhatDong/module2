package _06_kethua_in_java.CirleandCylinder;

public class Circle {
private double radius;
private String color;
private static final double Pi = 3.14;
public Circle (double radius, String color) {
    this.radius= radius;
    this.color=color;
}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea (){
    return radius*radius*Pi;
    }
    public double getPerimeter () {
    return (Math.pow(getArea(),2))*Pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Perimeter ='" + getPerimeter() + '\'' +
                "Area = '" + getArea() +'\''+
                '}';
    }
}
