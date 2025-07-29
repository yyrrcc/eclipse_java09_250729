package lang.class1;

public class Main {
	public static void main(String[] args) {
		// Car라는 이름의 클래스의 클래스 객체를 가져오는 코드
		Class class1 = Car.class;
		System.out.println(class1.getName()); // 패키지 + 클래스 이름
		System.out.println(class1.getSimpleName()); // 클래스 이름
	}
}
