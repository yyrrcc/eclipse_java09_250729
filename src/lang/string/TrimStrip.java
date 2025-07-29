package lang.string;

import java.util.Scanner;

public class TrimStrip {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요: ");
		String str = scanner.nextLine();
		System.out.println(str);
		System.out.println(str.length());

		str = str.trim(); // 문자열 앞뒤 공백 제거
		System.out.println(str);
		System.out.println(str.length());

		String a = " 안 녕 ";
		System.out.println(a);
		System.out.println(a.length());
		a = a.strip();
		System.out.println(a);
		System.out.println(a.length());

	}

}
