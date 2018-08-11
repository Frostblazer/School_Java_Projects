//-------------------------------------------------------------------
//Purpose:	Use an array to perform operations with a set of scores
//			-First, the user enters scores
//			-Then repeating menu offers the following operations
//				Display scores
//				Change a score
//				Compute average score
//				Display highest score
//				End program
//-------------------------------------------------------------------

import java.util.Scanner;

public class Number_Cruncher
{
	//Scanner variable is global so that all methods can use it
	public static Scanner inputReader = new Scanner(System.in);

	public static void main (String[] args)
	{
		int count;

		System.out.println("===============");
		System.out.println("Number Cruncher");
		System.out.println("===============\n");

		System.out.print("How many scores in your list? ==>");
		count = inputReader.nextInt();

		//Allocate space for the desired number of scores
		int[] scores = new int[count];

		//Use loop to load all scores
		for (int i = 0; i < count; i++)
		{
			System.out.print("Enter score " + (i+1) + " >");
			scores[i] = inputReader.nextInt();
		}

		boolean finished = false;
		while (!finished)
		{
			int choice = GetMenuOpt();
			switch(choice)
			{
				case 1:
					ShowScores(scores);
					break;
				case 2:
					ChangeScore(scores);
					break;
				case 3:
					ComputeAverage(scores);
					break;
				case 4:
					DisplayHighest(scores);
					break;
				case 5:
					finished = true;
					break;
				default:
					System.out.println("***INVALID SELECTION***");
			}
		}

		System.out.println("\nThanks for using the Number Cruncher.\n");
	}

	//----------Static Methods------------

	//===========================================================
	//Method: 	GetMenuOpt
	//Purpose:	Present menu to user and get user's selection
	//Returns:	User's menu selection (int)
	//Parameters: None
	//Notes:	Uses global scanner object to read user input
	//===========================================================
	public static int GetMenuOpt()
	{
		System.out.println();
		System.out.println("1] Display Scores");
		System.out.println("2] Change a Score");
		System.out.println("3] Compute Average Score");
		System.out.println("4] Display Highest Score");
		System.out.println("5] End Program");
		System.out.print  ("   ==>");

		int opt = inputReader.nextInt();
		System.out.println();

		return opt;

	}

	//===========================================================
	//Method: 	ShowScores
	//Purpose:	Display all scores in the given array
	//Returns:	n/a (void)
	//Parameters: The array to be displayed
	//Notes:	Uses global variable count as the array size
	//===========================================================
	public static void ShowScores(int[] s)
	{
		for (int i = 0; i < s.length; i++)
			System.out.print((i+1) + ") " + s[i] + "\t");

		System.out.println();
	}

	//===========================================================
	//Method: 	ChangeScore
	//Purpose:	Allow user to change a score in the array
	//Returns:	n/a (void)
	//Parameters: The array to be changed
	//Notes:	Uses global variable count as the array size
	//			Uses global scanner object to read user input
	//			Modifies an element in the array
	//===========================================================
	public static void ChangeScore(int[] s)
	{
		int index;
		int numScores = s.length;
		boolean valid;

		//Get and validate index of score user wants to change
		do
		{
			System.out.print("Which score do you want to change? ==>");
			index = inputReader.nextInt();
			valid = (index > 0) && (index <= numScores);
			if (!valid)
			{
				System.out.println("***Index out of range.***");
				System.out.println("Please enter a value between 1 and " + numScores);
			}
		} while (!valid);

		//Have valid index, so change the score
		System.out.println("Current score " + index + ": " + s[index-1]);
		System.out.print("Enter new value for score " + index + " ==>");
		s[index-1] = inputReader.nextInt();
	}

	//===========================================================
	//Method: 	ComputeAverage
	//Purpose:	Computes & displays average of all values in an array
	//Returns:	n/a (void)
	//Parameters: The array with values to be averaged
	//Notes:	Uses global variable count as the array size
	//===========================================================
	public static void ComputeAverage(int[] n)
	{
		int sum = 0;
		int count = n.length;
		for (int i = 0; i < count; i++)
			sum += n[i];

		double average = (double) sum / count;

		System.out.println("Average score: " + average);
	}

	//===========================================================
	//Method:	DisplayHighest
	//Purpose:	Shows the highest score entered
	//Returns:	n/a (void)
	//Parameters:	The array with values to find highest number
	//Notes:	Uses global variable count as the array size
	//===========================================================
	public static void DisplayHighest(int[] s)
	{
		int largest = s[0];

		for(int i = 1; i < s.length; i++)
		{
			if(largest < s[i])
				{
				largest = s[i];
				}
		}
		System.out.println("Largest number is: " + largest);

	}

}