package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue; // 인스턴스 변수 접근 불가
//        instanceMethod(); // 인스턴스 메서드 접근 불가

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void staticCall(DecoData data) { // 파라미터에 참조 변수를 직접적으로 넣어주면 접근 가능
        instanceValue++;
        instanceCall();
    }
    
    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

//        DecoData.staticValue++; // 정적 변수는 모든 곳에서 접근
//        DecoData.staticMethod(); // 정적 메서드는 모든 곳에서 접근
        staticValue++; // 정적 변수는 모든 곳에서 접근
        staticMethod(); // 정적 메서드는 모든 곳에서 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticMethod = " + staticValue);
    }
}
