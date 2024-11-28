package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name , int age) {
//        System.out.println("aa");  // 생성자 첫 줄에 this를 하지 않았기에 컴파일 오류
        this(name,age,50); // 매개변수가 3개 있는 생성자를 호출
    }

    MemberConstruct(String name , int age , int grade) {
//        System.out.println("이름 : " + name + " 나이 : " + age + " 성적 : " + grade);

        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
