package package_calendar;

import java.util.Scanner;


public class Prompt {
	
	public int parseDay(String week){
		
		if(week.equals("SU")){
			return 0;
		} else if(week.equals("MO")){
			return 1;
		} else if(week.equals("TU")){
			return 3;
		} else if(week.equals("WD")){
			return 4;
		} else if(week.equals("TH")){
			return 5;
		} else if(week.equals("FR")){
			return 6;
		} else if(week.equals("SA")){
			return 7;
		} else {
			return 0;
		}
		
	}
		
	public void runPrompt(){
		
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar(); // class 스스로를 불러옴.
		
		int month	= 1;
		int year	= 2017;
		//int weekday	= 0;
		
		while(true){
			
			System.out.println("년도를 입력하세요");
			System.out.println("YEAR> ");
			year = scan.nextInt();
			
			if(year == -1){
				break;
			}
			
			System.out.println("달을 입력하세요");
			System.out.println("MONTH> ");
			month = scan.nextInt();
			
			
			
			if(month > 12 || month < 1){
				System.out.println("잘못된 입력");
				continue;
			}
			
			cal.printCalendar(year, month);
			
		}
		
		//cal.printSampleCalendar();
		
		scan.close();
	}

	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		
		p.runPrompt();
		
	}

}
