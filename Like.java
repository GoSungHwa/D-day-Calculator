import java.text.SimpleDateFormat;
import java.util.*;

public class Like {

	public static void main(String[] args) {

		int year, month, day;
		int year2, month2, day2;
		long oneDay = 24 * 60 * 60 * 1000;
		int longYearDays = 366;
		int normalYearDays = 365;

		Scanner input = new Scanner(System.in);
		System.out.printf("디데이 년도:");
		year = input.nextInt();
		System.out.printf("디데이 월:");
		month = input.nextInt();
		System.out.printf("디데이 일:");
		day = input.nextInt();
		System.out.printf("\n");

		Scanner s = new Scanner(System.in);
		System.out.printf("년도:");
		year2 = input.nextInt();
		System.out.printf("월:");
		month2 = input.nextInt();
		System.out.printf("일:");
		day2 = input.nextInt();
		System.out.printf("\n");

		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("yyyy년 M월 d일 E요일");

		Calendar dday = GregorianCalendar.getInstance();
		dday.set(year2, month2 - 1, day2);

		GregorianCalendar cal = new GregorianCalendar();
		cal.set(year, month - 1, day);

		long millis = cal.getTimeInMillis() - dday.getTimeInMillis();
		long days = millis / oneDay;
		int tYear = dday.get(Calendar.YEAR);
		long remainDays = days;
		long remainYears = 0;

		for (int i = tYear; i < year; i++) {
			if (((i % 4) == 0) && ((i % 100) != 0) && ((i % 400) == 0)) {
				if (remainDays > longYearDays) {
					remainDays -= 366;
					remainYears++;
				}
			} else {
				if (remainDays > normalYearDays) {
					remainDays -= 365;
					remainYears++;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(df.format(cal.getTime()) + "까지").append(days + "일");
		if (remainYears > 0) {
			sb.append("(" + remainYears + "년");
			if (remainDays > 0) {
				sb.append(" " + remainDays + "일");
			}
			sb.append(") ");
		}
		sb.append("남았습니다.");
		System.out.println(sb);
	}

}
