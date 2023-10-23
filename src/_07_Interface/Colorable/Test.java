package _07_Interface.Colorable;

public  class Test {
    public static void main(String[] args) {
        Geometry geometry [] = new Geometry[2];
        geometry[0] = new Rectangle();
        geometry[1] = new Square();
        for (Geometry geo : geometry) {
            if (geo instanceof Square) {
                ((Square)geo).howToColor();
            }
        }
    }

}
