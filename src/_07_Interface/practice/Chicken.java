package _07_Interface.practice;

public class Chicken extends Animal implements Edible{

    @Override
    public String howtoeat() {
        return "Could be fried";
    }

    @Override
    public String makeSound() {
        return "Chicken: cluck - cluck ";
    }
}
