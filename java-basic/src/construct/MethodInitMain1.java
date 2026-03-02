package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 20;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 22;
        member2.grade = 80;

        MemberInit[] members = new MemberInit[2];
        members[0] = member1;
        members[1] = member2;

        for (MemberInit s : members){
            System.out.println("이름 = " + s.name);
            System.out.println("나이 = " + s.age);
            System.out.println("점수 = " + s.grade);
        }
    }
}
