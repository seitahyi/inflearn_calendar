package package_calendar;


public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static boolean isLeapYear(int year){
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public static int getMaxDaysOfMonth(int year, int month, int weekday){
		
		if(isLeapYear(year)){
			return LEAP_MAX_DAYS[month - 1];			
		} else {
			return MAX_DAYS[month - 1];
		}
		
	}
	
	public static void printCalendar(int year, int month, int weekday){
		
		System.out.printf("  <<%4d %3d>> \n", year , month);
		System.out.println("SU MO TH WE TH FR SA");
		System.out.println("--------------------");
		
		for(int a = 0; a < weekday; a++){
			System.out.print("   ");
		}
		
		int maxDay = getMaxDaysOfMonth(year, month, weekday);
		
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;
		
		for(int b = 1; b <= count; b++){
			System.out.printf("%3d", b);
		}
		
		System.out.println();
		
		count++;
		for(int c = count; c <= maxDay; c++){
			
			System.out.printf("%3d", c);
			
			if(c % 7 == delim)
				System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
	}

}
