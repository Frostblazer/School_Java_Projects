//Determine whether person is over the legal limit

import java.util.Scanner;

import java.text.DecimalFormat;

public class DUI_Calculator
{
	public static void main (String [] args)
	{

	Scanner scan = new Scanner (System.in);

	Double consumed, hours;
	int weight, age, gender;

	System.out.println("DUI Calucalator");
	System.out.println();
	
	System.out.print("How many standard drinks have you consumed? ");
	consumed = scan.nextDouble();
	System.out.println();
	
	System.out.print("What is your weight in pounds? ");
	weight = scan.nextInt();
	System.out.println();
	
	System.out.print("How many hours has it been since your first drink? ");
	hours = scan.nextDouble();
	System.out.println();
	
	System.out.print("What is your age? ");
	age = scan.nextInt();
	System.out.println();
	
	System.out.print("Enter 1 if male or 2 if female. ");
	gender = scan.nextInt();
	System.out.println();

		if (gender == 1)
			{
			double absorbed = (3.701 * consumed)/(weight * .73); //alcohol absorbed for men
			double metabolized = .015 * hours;                   //alcohol metabolized for men
			double BAC = absorbed - metabolized;                 //blood alcohol content
			DecimalFormat dFormatter = new DecimalFormat("0.000");
			String rounded_BAC = dFormatter.format(BAC);
			System.out.println("Your Blood Alcohol Content is " + rounded_BAC);
			
			if (age < 21 && BAC < .02)
			System.out.println("You are under the legal limit for a DUI.");
		
			if (age < 21 && BAC > .02)
			System.out.println("You are over the legal limit for a DUI.");
		
			if (age >= 21 && BAC < .08)
			System.out.println("You are under the legal limit for a DUI.");
		
			if (age >= 21 && BAC > .08)
			System.out.println("You are over the legal limit for a DUI.");
			}

		if (gender == 2)
			{
			double absorbed = (3.701 * consumed)/(weight * .66);   //alcohol absorbed for women
			double metabolized = .015 * hours;                     //alcohol metabolized for women
			double BAC = absorbed - metabolized;                   //blood alcohol content
			DecimalFormat dFormatter = new DecimalFormat("0.000");
			String rounded_BAC = dFormatter.format(BAC);
			System.out.println("Your Blood Alcohol Content is " + rounded_BAC);
		if (age < 21 && BAC < .02)
			System.out.println("You are under the legal limit for a DUI.");
		
		if (age < 21 && BAC > .02)
			System.out.println("You are over the legal limit for a DUI.");
		
		if (age >= 21 && BAC < .08)
			System.out.println("You are under the legal limit for a DUI.");
		
		if (age >= 21 && BAC > .08)
			System.out.println("You are over the legal limit for a DUI.");
			}
	//System.out.println();
	//System.out.println();
	//System.out.println();





	}
}