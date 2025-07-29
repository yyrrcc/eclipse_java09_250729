package lang.string;

public class Replace {

	public static void main(String[] args) {
		String str = "자바 공부를 하고 있습니다.";
		String str1 = str.replace("자바", "Java"); // str의 값을 바꾸진 않아서 새로운 변수로 받아야 함
		System.out.println(str1);
	}

}
