package package_calendar;


import java.util.Scanner;


public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30};
	
	public int getMaxDaysOfMonth(int month){
		return MAX_DAYS[month - 1];
	}
	
	public static void printSampleCalendar(){
		
		System.out.println("일 월 화 수 목 금 토 일");
		System.out.println("--------------");
		System.out.println("1 2 3 4 5 6 7 ");
		System.out.println("8 9 10 11 12 13 ");
		System.out.println("14 15 16 17 18 19");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar(); // class 스스로를 불러옴.
		
		System.out.println("반복횟수를 입력하세요.");
		int repeat = scan.nextInt();
		
		for(int i = 0; i < repeat; i++){
			
			System.out.println("달을 입력하세요");
			int month = scan.nextInt();
			int[] maxDays = {31, 28, 31, 30, 31, 30};
			System.out.printf("%d 월은 %d일 깢 있음\n", month, cal.getMaxDaysOfMonth(month));
			
		}
		
		//cal.printSampleCalendar();
		
		scan.close();
	}

}
