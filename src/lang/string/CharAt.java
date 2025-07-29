package lang.string;

public class CharAt {
	public static void main(String[] args) {
		String str1 = "Korea";
		System.out.println(str1.charAt(4)); // 인덱스 값에 들어 있는 문자 하나 출력

		String str2 = "Canada";
		int count = 0;
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == 'a') {
				System.out.println("문자열 내 소문자 a가 포함되어 있습니다.");
				count++;
			}
		}
		System.out.println("소문자 a의 개수: " + count);
	}

}
