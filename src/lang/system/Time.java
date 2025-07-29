package lang.system;

public class Time {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		long time2 = System.nanoTime();
		System.out.println(time2 - time1);

		long time3 = System.currentTimeMillis();
		long time4 = System.currentTimeMillis();
		System.out.println(time4 - time3);
	}

}
