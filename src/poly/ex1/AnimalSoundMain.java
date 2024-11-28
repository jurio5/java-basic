package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

//        Caw[] cawArr = {dog, cat ,caw}; // 다른 타입이라 불가능

        dog.sound();

        soundCaw(caw);

        soundCat(cat);
    }

    private static void soundCaw(Caw caw) {
        caw.sound();
    }

    private static void soundCat(Cat cat) {
        cat.sound();
    }

}
