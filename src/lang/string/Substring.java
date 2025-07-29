package lang.string;

public class Substring {

	public static void main(String[] args) {
		String jumin = "900909-2134567";
		String addr = "서울특별시 종로구 숭인동 111번지 306호 2층";

		System.out.println(addr.substring(6, 12));
		System.out.println(addr.substring(14)); // EndIndex없으면 시작부터 끝까지
	}

}
