package package_calendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLoad {
	
	public static void main(String[] args){
		
		try{
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextInt()){
				System.out.println(sc.nextInt()*100);
			}
			sc.close();
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	}
}