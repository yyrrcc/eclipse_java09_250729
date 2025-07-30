package langEx;

public class Ex4 {
// "i like chopin" 문자열에서 첫글자만 대문자로 변경하여 출력하는 프로그램을 작성하시오. ex) I Like Chopin

	public static void main(String[] args) {
		String str = "i like chopin";

		// 1. 공백 기준으로 글자 쪼갠 후 앞글자만 대문자로 변경한 후 다시 합치기(문자열 끝부분에 공백 생김)
		String[] strSplit = str.split(" ");
		for (String string : strSplit) {
			char a = string.charAt(0); // 쪼개진 글자들 중 앞글자 가져오기
			String b = String.valueOf(a); // String으로 클래스 변경
			String c = b.toUpperCase(); // 앞글자를 대문자로 변경
			string = string.replaceAll(b, c); // 소문자 앞글자를 대문자 앞글자로 변경
			System.out.print(string + " ");
		}
		System.out.println(); // 줄바꿈용

		// 2. 이전 문자가 공백이면 대문자로 전환 (추천)
		String result = ""; // 결과 문자열을 담을 빈 문자열 초기화

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// 첫 글자거나 (i == 0), 이전 문자가 공백이면 대문자로 변환
			if (i == 0 || str.charAt(i - 1) == ' ') {
				// 대문자로 변환 후 더함
				result += Character.toUpperCase(ch);
			} else {
				// 아니면 그대로 더함
				result += ch;
			}
		}
		System.out.println(result);

		// 3. 문자열 대체 (하드 코딩)
		str = str.replace("i ", "I ");
		str = str.replace(" l", " L");
		str = str.replace(" c", " C");
		System.out.println(str);

		// 4. 인덱스 찾아서 변경 -> 따로 합치지 못했음
//		char firstL = str.charAt(0);
//		char SecondL = str.charAt(2);
//		char ThirdL = str.charAt(7);
//
//		String fiL = String.valueOf(firstL);
//		String SeL = String.valueOf(SecondL);
//		String ThL = String.valueOf(ThirdL);
//
//		System.out.println(fiL.toUpperCase());
//		System.out.println(SeL.toUpperCase());
//		System.out.println(ThL.toUpperCase());

	}

}
