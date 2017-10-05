package package_calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		System.out.println("일 월 화 수 목 금 토 일");
		System.out.println("--------------");
		System.out.println("1 2 3 4 5 6 7 ");
		System.out.println("8 9 10 11 12 13 ");
		System.out.println("14 15 16 17 18 19");
		
		// 숫자 입력받아 해당 달의 최대 일수 출력
		
		int a, b;
		
		Scanner scan = new Scanner(System.in);
		
		String	s1, s2;
		
		s1	= scan.next();
		s2	= scan.next();
		
		a	= Integer.parseInt(s1);
		b	= Integer.parseInt(s2);
		
		System.out.printf("%d %d", a + b);
		
		scan.close();
	}

}
