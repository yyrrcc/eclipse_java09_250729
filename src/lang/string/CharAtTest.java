package lang.string;

public class CharAtTest {

	public static void main(String[] args) {
		String jumin = "990101-2134567";

		if (jumin.charAt(7) == '1') { // ""는 문자열로 인식하기 때문에 ''를 이용해야 한다
			System.out.println("boy");
		} else {
			System.out.println("girl");
		}

		char gender = jumin.charAt(7);
		switch (gender) {
		case '1':
		case '3':
			System.out.println("boy!");
			break;
		case '2':
		case '4':
			System.out.println("girl!");
			break;
		default:
			System.out.println("성별을 알 수 없습니다.");
			break;
		}
	}

}
