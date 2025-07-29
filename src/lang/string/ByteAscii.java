package lang.string;

public class ByteAscii {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111 }; // Hello의 아스키코드 값 배열

		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String("Hello");
		System.out.println(str2);
	}

}
