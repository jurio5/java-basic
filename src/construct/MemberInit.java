package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void memberStatus(String name , int age , int grade) {

        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return "이름 : " + name + " 나이 : " + age + " 성적 : " + grade;
    }

}
