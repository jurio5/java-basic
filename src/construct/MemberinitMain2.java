package construct;

public class MemberinitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = memberStatus("user1",15,90);
        MemberInit member2 = memberStatus("user2",16,80);

        MemberInit[] members = {member1,member2};

        printHeader(members);
    }

    public static MemberInit memberStatus(String name , int age , int grade) {
        MemberInit memberinit = new MemberInit();

        memberinit.name = name;
        memberinit.age = age;
        memberinit.grade = grade;

        return memberinit;
    }

    public static void printHeader(MemberInit[] data) {

        for (MemberInit d : data) {
            System.out.println("이름 : " + d.name + " 나이 : " + d.age + " 성적 : " + d.grade);
        }
    }
}
