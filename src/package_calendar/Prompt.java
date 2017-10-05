package package_calendar;

import java.util.Scanner;


public class Prompt {
	
	private final static String PROMPT="cal> ";
	
	public void runPrompt(){
		
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar(); // class 스스로를 불러옴.
		
		int month = -1;
		int year = -1;
		
		while(true){
			
			System.out.println("년도를 입력하세요");
			System.out.println("YEAR> ");
			year = scan.nextInt();
			
			System.out.println("달을 입력하세요");
			System.out.println("MONTH> ");
			month = scan.nextInt();
			
			if(month == -1){
				break;
			}
			
			if(month > 12){
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
