package ref;

public class MethodChange3 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println(dataA.value);
        changeReference(dataA); // 20
        System.out.println(dataA.value);
    }

    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
