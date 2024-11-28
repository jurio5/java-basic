package poly.ex3;

public class AbstractMain {

    public static void main(String[] args) {
//        AbstractAnimal animal = new AbstractAnimal(); // 추상 클래스 객체는 생성 불가
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }
}
