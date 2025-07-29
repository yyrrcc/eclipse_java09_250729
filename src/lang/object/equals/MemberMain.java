package lang.object.equals;

public class MemberMain {

	public static void main(String[] args) {
		Member member1 = new Member("tiger");
		Member member2 = new Member("tiger");
		Member member3 = new Member("monkey");

		if (member1.equals(member2)) {
			System.out.println("두 멤버의 아이디는 동일합니다.");
		} else {
			System.out.println("두 멤버의 아이디를 동일하지 않습니다.");
		}

		if (member1.equals(member3)) {
			System.out.println("두 멤버의 아이디는 동일합니다.");
		} else {
			System.out.println("두 멤버의 아이디를 동일하지 않습니다.");
		}

		System.out.println("");

		System.out.println("1. 객체 ");
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);

		System.out.println("2. toString()");
		System.out.println(member1.toString());
		System.out.println(member2.toString());
		System.out.println(member3.toString());

		System.out.println("3. hashCode()");
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
	}

}
