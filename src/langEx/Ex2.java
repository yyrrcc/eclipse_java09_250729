package langEx;

public class Ex2 {
// korea@korea.com 이메일 주소에서 아이디와 도메인을 분리하여 출력
	public static void main(String[] args) {
		String str = "korea@korea.com";
		// 1. split으로 나누는 방법?

		// 2. 한글자씩 빼오다가 @이 보이면 나누기?
//		String id = null;
//		String domain = null;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == '@') {
//				continue;
//			} else {
//				id = id + str.charAt(i);
//			}
//		}

		// 3. 단순하게 구간 추출하기
		String id = str.substring(0, 5);
		String domain = str.substring(6, 15);
		System.out.println(id);
		System.out.println(domain);

	}

}
