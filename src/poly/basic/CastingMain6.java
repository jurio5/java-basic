package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("== parent1 ==");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("== parent2 ==");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스터인 경우 childMethod() 실행
        if (parent instanceof Child child) { // 자바 16부터 사용 가능 , Pattern Mathching for instanceof , 객체 선언과 동시에 체크 가능
            System.out.println("Child 인스턴스 맞음");
//            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
