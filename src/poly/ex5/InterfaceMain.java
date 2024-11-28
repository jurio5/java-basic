package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); // 인터페이스도 abstract 클래스와 동일히 구현 불가능
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        animal.sound();
    }
}
