package lang.math;

import java.util.Scanner;

public class MathMain {

	public static void main(String[] args) {
		// Math 클래스의 메서드는 모두 static. 객체 만들 필요 없음.

		System.out.println(Math.abs(-5.7)); // 절대값

		System.out.println(Math.ceil(1.1)); // 소수점 올림
		System.out.println(Math.floor(1.9)); // 소수점 버림
		System.out.println(Math.round(2.5173)); // 반올림

		System.out.println(Math.max(10, 50)); // 둘 중 큰 수
		System.out.println(Math.min(0.1, 0.8)); // 둘 중 작은 수

		double pi = Math.PI;

		Math.random(); // 0과 1 사이 중 랜덤
		System.out.println((int) (Math.random() * 10) + 1); // 1부터 10 사이의 랜덤 정수 출력

		System.out.println(Math.rint(5.5)); // 가까운 짝수로 반올림하고 실수 double로 반환

		// 숫자를 입력 받아서 작은 수를 출력하는 것
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(Math.min(a, b));
		scanner.close();

	}

}
