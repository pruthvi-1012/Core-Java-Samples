package h.scanner;

import java.util.Scanner;



public class MainClass {

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		System.out.flush();
		String token;
		
		do{
			token=sc.findInLine("\\d");
			System.out.println("Found=="+token);
			
		}while(token!=null);

	}

	
}