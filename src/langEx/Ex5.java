package langEx;

public class Ex5 {
// 다음 문자열에서 알파벳의 개수를 출력하는 프로그램을 작성하시오. (hint : 아스키 코드값 활용)
// "Hello123, Java456"
// 아스키 코드 : 대문자a65 대문자z90 소문자a097 소문자z122

	public static void main(String[] args) {
		String str = "Hello123, Java456";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
