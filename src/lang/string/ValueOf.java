package lang.string;

public class ValueOf {

	public static void main(String[] args) {
		// 다양한 타입을 문자열로 변환
		String str1 = String.valueOf(123);
		String str2 = String.valueOf(4.56);
		String str3 = String.valueOf(true);

		// 문자열로 변환했기에 String 메서드 사용 가능
		System.out.println(str1 + str2);
		System.out.println(str2.replace(".", "소수점"));
		System.out.println(str3.toUpperCase());
	}

}
