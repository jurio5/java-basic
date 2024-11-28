package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A Count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B Count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C Count = " + Data3.count);

        // 인스턴스를 통한 접근
        // 클래스 변수를 인스턴스 변수로 접근하는 방법을 지양하는 이유는 일단, 제 3자가 봤을 때 의도가 분명치 않기 때문
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); 

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
