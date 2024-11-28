package oop1;

public class ValueDataMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자 = " + valueData.value);
    }

    public static void add(ValueData valuedata) {
        valuedata.value++;
        System.out.println("숫자 증가 value = " + valuedata.value);
    }
}
