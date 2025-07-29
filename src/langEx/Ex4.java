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

		// 2. 문자열 대체 (하드 코딩)
		str = str.replace("i ", "I ");
		str = str.replace(" l", " L");
		str = str.replace(" c", " C");
		System.out.println(str);

		// 3. 인덱스 찾아서 변경 -> 따로 합치지 못했음
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
