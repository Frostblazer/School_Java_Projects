//Program Name BMI Calculator
//Calculate BMI

import java.util.Scanner;
import java.text.DecimalFormat;

public class BMI_Calculator
{
	public static void main (String[] args)
	{
		Scanner reader = new Scanner (System.in);

		String name;
		int weight;
		double height, BMI;

		System.out.println("Welcome to the BMI Calculator!");

		System.out.println("----------------------------------");

		System.out.println("Hello and welcome to the BMI Calculator!");
		System.out.print("What is your name? ");
		name = reader.nextLine();

		System.out.println("Hello " + name + "!");
		System.out.println();
		System.out.print(name + ", to calculate BMI please enter your weight in pounds: ");
		weight = reader.nextInt();

		System.out.print("Next " + name + " enter your height in inches: ");
		height = reader.nextDouble();

		//To calculate someones BMI you multiply the weight by 703. Next divide the product of the
		//weight and 703 by height squared.

		final double weightRate = 703 * weight;
		final double heightRate = height * height;

		BMI= weightRate / heightRate;
		double rounded = Math.round(BMI * 100)/100.0;

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(name + ", your BMI is " + rounded);

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Thank you for using the BMI Calculator!");

		System.out.println();
		System.out.println();
		System.out.println();


	}
}
