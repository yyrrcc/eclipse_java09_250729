package langEx;

public class Ex2 {
// korea@korea.com 이메일 주소에서 아이디와 도메인을 분리하여 출력
	public static void main(String[] args) {
		String str = "korea@korea.com";
		// 1. split으로 나누는 방법
		String[] strSplit = str.split("@");
		for (String string : strSplit) {
			System.out.println(string);
		}

		// 2. 단순하게 구간 추출하기 (하드 코딩)
		String id = str.substring(0, 5);
		String domain = str.substring(6, 15);
		System.out.println(id);
		System.out.println(domain);

	}

}
