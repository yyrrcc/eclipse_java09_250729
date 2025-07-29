package lang.object.tostring;

import java.util.Date;

public class MemberMain {

	public static void main(String[] args) {
		Object object = new Object();
		System.out.println(object.toString());

		Date date = new Date();
		System.out.println(date.toString());

		Member member1 = new Member("tiger");
		Member member2 = new Member();

		System.out.println("1. id");
		System.out.println(member1.id);
		System.out.println(member2.id);

		System.out.println("2. toString()");
		System.out.println(member1.toString());
		// System.out.println(member2.toString()); // NPE, String 매개변수가 없어서
	}

}
