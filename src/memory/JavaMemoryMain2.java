package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("Main Start");
        method1(10);
        System.out.println("Main End");
    }

    static void method1(int m1) {
        System.out.println("Method1 Start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("Method1 End");
    }

    static void method2(Data data2) {
        System.out.println("Method2 Start");
        System.out.println("Data.value = " + data2.getValue());
        System.out.println("Method2 End");
    }
}
