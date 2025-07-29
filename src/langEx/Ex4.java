package langEx;

public class Ex4 {
// "i like chopin" 문자열에서 첫글자만 대문자로 변경하여 출력하는 프로그램을 작성하시오.
// ex) I Like Chopin
// 공백 다음의 문자를 대문자로..

	public static void main(String[] args) {
		String str = "i like chopin";
		char firstL = str.charAt(0);
		char SecondL = str.charAt(2);
		char ThirdL = str.charAt(7);

		String fiL = String.valueOf(firstL);
		String SeL = String.valueOf(SecondL);
		String ThL = String.valueOf(ThirdL);

		System.out.println(fiL.toUpperCase());
		System.out.println(SeL.toUpperCase());
		System.out.println(ThL.toUpperCase());

		System.out.println();
	}

}
