package edu.basics;

import java.util.Scanner;

public class SimpleScannerJavaClass {
	
// 	ANSI escape code constants for text colors
	private static final String MAGENTA = "\u001B[35m";
	

	public static void main(String[] args) {
		
		//ANSI escape code constants for text colors
		String RESET = "\u001B[0m";
	    String RED = "\u001B[31m";
	    String GREEN = "\u001B[32m";
	    String BLUE = "\u001B[34m";
	    String YELLOW = "\u001B[33m";
	    String BLACK = "\u001B[30m";

	    
	    // ANSI escape code constants for background colors
	    String CYAN = "\u001B[46m";
	    String WHITE = "\u001B[47m";
		//Taking user input from keyboard
	    System.out.println(MAGENTA + "-------Taking user input from keyboard------" + RESET);
	    
		Scanner sc = new Scanner(System.in);
		System.out.println(BLUE + CYAN + "Enter your age: " + RESET);
		int age = sc.nextInt();
		System.out.println(GREEN + "Your age is: \n" + age + RESET);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println(RED + "\nEnter Your Name: " + RESET);
		String name = sc1.nextLine();
		System.out.println(GREEN + "Your Name is: \n" + name + RESET);
		
		System.out.println(BLUE + CYAN + "\nEnter Money in an account: " + RESET);
		float money = sc.nextFloat();
		System.out.println(GREEN + "Your money in an account: \n" + money);
		
		System.out.println(BLACK + WHITE + "\nEnter Your City: " + RESET);
		String city = sc1.nextLine();
		System.out.println(GREEN + "Your City is: \n" + city + RESET);
		
		System.out.println(YELLOW + "\nEnter Your City Pin: " + RESET);
		int city_pin = sc1.nextInt();
		System.out.println(GREEN + "Your City Pin is: \n" + city_pin + RESET);
	}
}
