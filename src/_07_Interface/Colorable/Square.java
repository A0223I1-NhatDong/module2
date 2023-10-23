package _07_Interface.Colorable;

public class Square extends Geometry implements Colorable {
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
