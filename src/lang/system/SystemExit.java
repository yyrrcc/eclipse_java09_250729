package lang.system;

public class SystemExit {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if (i == 30) {
//				break;
				System.exit(i);
			}
		}
		System.out.println("for문 종료");
	}

	// System.exit(i);는 break;와 다르게 그 자리에서 즉시 프로그램을 종료한다.
	// 따라서 하단에 문자열 "for문 종료"이 나오지 않는다.
}
