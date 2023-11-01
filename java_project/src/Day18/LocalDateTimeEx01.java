package Day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx01 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today); // date 객체에서는 추출 불가
		System.out.println(today.getYear());
		String curr = today.toString();
		System.out.println(curr); // String 객체는 추출 가능
		
		System.out.println(curr.substring(0, curr.indexOf("T")));
		System.out.println(curr.substring(curr.indexOf("T")+1,curr.indexOf(".")));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8, 30); // 날짜생성
		System.out.println(sDate.format(dtf));

	}

}
