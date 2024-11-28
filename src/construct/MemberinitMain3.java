package construct;


public class MemberinitMain3 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        MemberInit member2 = new MemberInit();

        member1.memberStatus("user1",15,90);
        member2.memberStatus("user2",16,80);

        MemberInit[] members = {member1,member2};

        // 출력
        for (MemberInit member : members) {
            System.out.println(member);
        }
        
    }
}
