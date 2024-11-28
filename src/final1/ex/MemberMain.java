package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("my_id","park");
        member.print();

        member.changeData("Young");
        member.print();
    }
}
