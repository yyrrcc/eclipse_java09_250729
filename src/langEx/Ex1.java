package langEx;

public class Ex1 {
// "abcabcabc"에서 "ab"가 몇 번 나오는지
	public static void main(String[] args) {
		String str = "abcabcabc";

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(str.indexOf("ab"));

// i + 2 의 값을 담을 수 없음
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.substring(i, i + 2).equals("ab")) {
//				count++;
//			}
//		}
//		System.out.println("다음 문자열에서 'ab'는 " + count + "번 나옵니다.");
	}

}
