package util.dateCalendar;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		// import java.util.Date;
		Date nowTime = new Date(); // 현재 시간 가져오기
		System.out.println(nowTime);

		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");

		String dateString1 = simpleDateFormat1.format(nowTime);
		System.out.println(dateString1);

		String dateString2 = simpleDateFormat2.format(nowTime);
		System.out.println(dateString2);

		// import java.util.Calendar;
		Calendar calNow = Calendar.getInstance();
		int year = calNow.get(Calendar.YEAR);
		int month = calNow.get(Calendar.MONTH) + 1;
		int day = calNow.get(Calendar.DAY_OF_MONTH);

		int hour = calNow.get(Calendar.HOUR);
		int minute = calNow.get(Calendar.MINUTE);
		int second = calNow.get(Calendar.SECOND);

		int weekday = calNow.get(Calendar.DAY_OF_WEEK);

		System.out.println("날짜: " + year + "년 " + month + "월 " + day + "일");
		System.out.println("시간: " + hour + "시 " + minute + "분 " + second + "초");
		System.out.println("요일: " + weekday);

		System.out.println("-------------------------------");
		// import java.time.LocalDate;
		// import java.time.LocalTime;
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(date);
		System.out.println(time);
	}

}
