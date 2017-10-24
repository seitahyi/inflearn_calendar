package Examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Example_Calculator_1 {
	
	/**
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in); // system.in 사용자가 입력한 값
		int i = sc.nextInt();
		System.out.println(i * 1000);
		sc.close();
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){ // hasnext scanner 반복 조건 method
			System.out.println(sc.nextInt()*100);
		}
		sc.close();
		
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
	**/
	
	/////////////////////////////////////
	
	int left, right;
	
	public void setOprands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
		System.out.println(this.left + this.right);
	}
	
	public void avg(){
		System.out.println((this.left + this.right) / 2);
	}
}

class Substraction extends Example_Calculator_1{
	public void function_substract(){
		System.out.println(this.left - this.right);
	}
}