package edu.basics;

public class BasicsJavaClass {
	public static void main(String[] args) {
		
		int firstNumb = 35;
		int secondNumb = 3;
		int divisionResultInteger;
		
		double thirdNumb = 35.3;
		double fourthNumb = 3;
		double divisionResultDouble;		
		double divisionResultDoubleSecond;
		
		//Modulo, Modulus, Remainder Operator by using long data type
		long moduloResultLong;
		long divisionResultLong;
		
		//Below are wrapper classes so be careful
		//Double, Long
		//Otherwise implicit (automatically) cast not fulfill	
		
		// ANSI escape code constants for text colors
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String BLUE = "\u001B[34m";
        String YELLOW = "\u001B[33m";
        String BLACK = "\u001B[30m";
        String MAGENTA = "\u001B[35m";
        
        // ANSI escape code constants for background colors
        String CYAN = "\u001B[46m";
        String WHITE = "\u001B[47m";
        
		divisionResultInteger = firstNumb / secondNumb;
		// Print colored text to the console
		System.out.println(GREEN + "----------------Integer Data Type----------------" + RESET);
		System.out.println("-->Division result in integer: \nAnswer: " +divisionResultInteger+ "\n");
		
		System.out.println(RED + "----------------Double Data Type-----------------" + RESET);
		divisionResultDoubleSecond = thirdNumb / fourthNumb;
		System.out.println("-->Division result second instance variable: \nAnswer: " +divisionResultDoubleSecond);
		
		//Implicit type casting has been done automatically by JVM. 
		divisionResultDouble = divisionResultInteger;
		System.out.println("\n-->Implicit type casting has been done automatically by JVM.");
		System.out.println("-->Division result in double assign as integer: \nAnswer: " +divisionResultDouble);		
		divisionResultDouble = firstNumb / secondNumb;
		System.out.println("-->Division result in double by instance variable of integer: \nAnswer: " +divisionResultDouble+"\n");
		
		//Explicit type casting has been done by programmer.
		moduloResultLong  = (long) (thirdNumb % fourthNumb);
		System.out.println(BLUE + CYAN + "-----------------Long Data Type------------------" + RESET);
		System.out.println("-->Explicit type casting has been done by programmer.");
		System.out.println("-->Modulus result in long by instance variable of double: \nAnswer: " +moduloResultLong);
		divisionResultLong = (long) thirdNumb / (long) fourthNumb;
		System.out.println("-->Division result in long by instance variable of double: \nAnswer: " +divisionResultLong);
		System.out.println("Note: You will see decimal part is truncated after explicit type casting as data lost.\n");
		
		//Type conversion from integer to String
		System.out.println(YELLOW + "-------Type conversion from int to String--------" + RESET);
		// create integer type variable
	    int num = 10;
	    System.out.println("The integer value is: " + num);

	    // converts integer to string type
	    String data_0 = String.valueOf(num);
	    System.out.println("The string value is: " + data_0 + "\n");
	    
	    System.out.println(BLACK + WHITE + "-----Type conversion from String to integer------" + RESET);
	    //convert string variable to integer
	    int num_1 = Integer.parseInt(data_0);
	    System.out.println("The integer value is: " + num_1 + "\n");
	   
		System.out.println(MAGENTA + "-------Type conversion from String to float------" + RESET);
		// create string type variable
		// create string type variable
	    String data_1 = "10.5";
	    System.out.println("The string value is: " + data_1);

	    // convert string variable to float
	    float num_2 = Float.parseFloat(data_1);
	    System.out.println("The integer value is: " + num_2);
	    
	    //Taking user input from keyboard
	    //System.out.println(MAGENTA + "-------Taking user input from keyboard------" + RESET);
	    //JVM tries to run 2 part above this and below this if i would put scanner here
	    
//		Scanner sc = new Scanner(System.in);
//		System.out.println("\nEnter your age");
//		int age = sc.nextInt();
//
//		System.out.println("Age: " + age);
		 
	   
	    
	}
}
