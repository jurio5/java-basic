package poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        animalSound(dog);
        animalMove(dog);

        animalSound(cat);
        animalMove(cat);

        animalSound(caw);
        animalMove(caw);
    }

    private static void animalMove(AbstractAnimal animal) {
        animal.move();
    }

    private static void animalSound(AbstractAnimal animal) {
        animal.sound();
    }
}
