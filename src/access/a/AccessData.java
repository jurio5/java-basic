package access.a;

public class AccessData {
    
    public int publicaField;
    int defaultField;
    private  int privateField;
    
    public void publicMethod() {
        System.out.println("퍼블릭 호출 " + publicaField);
    }
    
    void defaultMethod() {
        System.out.println("디폴트 호출 " + defaultField);
    }
    
    private void privateMethod() {
        System.out.println("프라이빗 호출 " + privateField);
    }
    
    public void innerAccess() {
        System.out.println("내부 호출");
        publicaField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();;
    }
    
}
