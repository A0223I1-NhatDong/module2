package _05_Accessmodifier.practice.Cirle;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

import static java.lang.reflect.Modifier.isProtected;
public class mainCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle= new Circle();
        System.out.println(circle);
        System.out.println("Radius is : "+ circle.getRadius());
        System.out.println("Area is : "+ circle.getArea());
    }

}


