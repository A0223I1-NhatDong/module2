package _07_Interface.practice;

public abstract class Animal {
    private String makeSound;

    public String getMakeSound() {
        return makeSound;
    }

    public void setMakeSound(String makeSound) {
        this.makeSound = makeSound;
    }

    public Animal(String makeSound) {
        this.makeSound = makeSound;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "makeSound='" + makeSound + '\'' +
                '}';
    }
    public abstract String makeSound ();

    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals [0] = new Tiger();
        animals [1] = new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
        }
    }
}


