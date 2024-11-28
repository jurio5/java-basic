package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        Child child = new Child(); // Child 객체에서 이미 구현을 했기에 당연히 사용 가능
        child.methodA();
        child.methodB();
        child.methodCommon();
    }
}
