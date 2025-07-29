package langEx;

public class Ex3 {
// "banana" 에서 중복된 문자를 제거하면 "ban" 이 됩니다.
// 중복으로 나오는 문자를 제거하여 "banana"를 "ban"으로 출력

// 이건 몰라서 ai 도움 받았어요

	public static void main(String[] args) {
		String str = "banana";
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		System.out.println(answer);
	}

}
