package lang.string;

public class IndexOf {

	public static void main(String[] args) {
		String str = "자바 공부를 하고 있습니다.";
		int index = str.indexOf("부");
		System.out.println(index);

		if (str.indexOf("자바") != -1) {
			System.out.println("문자열에 '자바'가 포함되어 있습니다.");
		} else {
			System.out.println("문자열에 '자바'가 포함되어 있지 않습니다.");
		}
	}

}
