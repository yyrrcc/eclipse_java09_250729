package lang.string;

import java.io.UnsupportedEncodingException;

public class Encoding {
	public static void main(String[] args) {
		String str = "안녕하세요!";

		byte[] bytes1 = str.getBytes(); // 문자열을 인코딩으로 바이트 배열로 반환
		System.out.println(bytes1); // 배열 객체의 참조값
		System.out.println(bytes1.length);
		String str2 = new String(bytes1);
		System.out.println(str2);

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(bytes3.length);
		} catch (UnsupportedEncodingException e) { // 시스템이 해당 인코딩을 지원하지 않으면 예외 발생
			e.printStackTrace();
		}

	}
}
