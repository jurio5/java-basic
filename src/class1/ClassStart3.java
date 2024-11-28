package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        // 인스턴스와 객체
        // Student2 객체는 Student 클래스의 인스턴스 이다.
        Student student2 = new Student(); // 객체 또는 인스턴스 라고 함 (붕어빵)
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);
    }
}
