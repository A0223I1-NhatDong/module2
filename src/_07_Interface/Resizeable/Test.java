package _07_Interface.Resizeable;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double r = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính : ");
        r = Double.parseDouble(scanner.nextLine());
        Circle circle = new Circle(r);

    }


}
