package langEx;

public class Ex1 {
// "abcabcabc"에서 "ab"가 몇 번 나오는지
	public static void main(String[] args) {
		String str = "abcabcabc";

		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("ab")) {
				count++;
			}
		}
		System.out.println("다음 문자열에서 'ab'는 " + count + "번 나옵니다.");
	}

}
