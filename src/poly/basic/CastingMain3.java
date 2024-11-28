package poly.basic;


// 업 캐스팅 vs 다운 캐스팅
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업 캐스팅은 생략이 가능
        Parent parent2 = child; // 업 캐스팅 생략 (생략 권장이 아니라 그냥 사용 안 하는게 관례)

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
