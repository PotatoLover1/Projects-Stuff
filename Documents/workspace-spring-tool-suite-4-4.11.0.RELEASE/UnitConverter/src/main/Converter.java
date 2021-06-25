package main;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int x = 5;
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		int userChoice = 0;
		
		// Displays the possible choices the user can pick from
		System.out.println(
				  "1. Cups to Teaspoons\r\n"
				+ "2. Miles to Kilometers\n"
				+ "3. US Gallons to Imperial Gallons\n"
				+ "4. Feet to Meters\n"
				+ "5. Celsius to Farenheit\n"
				+ "6. Farenheit to Celsius\n"
				+ "7. Quit"
				+ "\n"
				);
		
		//This loop will run until the user chooses to exit it via quit
		while (userChoice !=7)
		{
			System.out.println("Please select a option by picking a number: ");
			userChoice = myObj.nextInt(); //Prompts the user which unit conversion they want to do
			switch (userChoice) {
			case 1: {//Case 1 is Cups to Teaspoons
				double value;
				System.out.println("Input the value to convert: ");
				value = myObj.nextDouble();
				double ans = value *48; // The Formula for conversion
				System.out.println(value + " cup(s) is " + ans + " in teaspoon(s)");
				break;
				}	
			case 2: {//Case 2 is Miles to Kilometers
				double value;
				System.out.println("Input the value to convert: ");
				value = myObj.nextDouble();
				double ans = value *1.609;  // The Formula for conversion
				System.out.println(value + " mile(s) is " + ans + " in kilometer(s)");
				break;
				}
			case 3: {
				double value;
				System.out.println("Input the value to convert: ");
				value = myObj.nextDouble();
				double ans = value/1.201; // The Formula for conversion
				System.out.println(value + " US Gallon(s) is " + ans + " in Imperial Gallon(s)");
				break;
				}
			case 4: {
				double value;
				System.out.println("Input the value to convert: ");
				value = myObj.nextDouble();
				double ans = value/3.281; // The Formula for conversion
				System.out.println(value + " Feet(s) is " + ans + " in Meter(s)");
				break;
				}
			case 5: {
				double value;
				System.out.println("Input the value to convert: ");
				value = myObj.nextDouble();
				double ans = (value * (9/5)) + 32; // The Formula for conversion
				System.out.println(value + " Celsius is " + ans + " in Farenheit");
				break;
				}
			case 6: {
				double value;
				System.out.println("Input the value to convert: ");
				value = myObj.nextDouble();
				double ans = (value-32) * (5/9); // The Formula for conversion
				System.out.println(value + " Farenheit is " + ans + " in Celsius");
				break;
				}
			case 7: {//Exits Program
				System.out.println("You have exited the program\n");
				break;
				}
			default: {//Tells the user if they put a number that doesn't exist as a choice
				System.out.println("Invalid number, please try again.");
				}
			}
		}
		
		System.out.println("Thank You for using the program!");
		
	}
	
	//Attempt at separating the method from the cases
	/*
	public static double toTeapoon(double m)
	{
		double factor = 48;
		return (m*factor);
		
	}
	
	public static double toKilometer(double m)
	{
		return (m*1.609);
		
	}
	
	public static double toImGal(double m)
	{
		return (m/1.201);
		
	}
	
	public static double toMeter(double m)
	{
		return (m/3.281);
		
	}
	
	public static double toFarenheit(double m)
	{
		return ((m * (9/5)) + 32 );
		
	}
	
	public static double toCelsius(double m)
	{
		return ((m-32) * (5/9));
		
	}
*/
}

