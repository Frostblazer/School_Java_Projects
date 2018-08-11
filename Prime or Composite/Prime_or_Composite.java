//---------------------------------------------
//Prime or Composite
//Finds out if the number is prime or composite
//---------------------------------------------

import java.util.Scanner;

public class Prime_or_Composite
	{
	public static void main(String [] args)
		{
		Scanner scan = new Scanner(System.in);

		String confirm = "y";
		int number, i;

		System.out.println("=============");
		System.out.println("Prime or Composite?");
		System.out.println("=============");
		System.out.println();

		while (confirm.equalsIgnoreCase("y"))
			{
				//enter users number they what to test
				System.out.print("Enter a whole number ==>");
				number = scan.nextInt();

			boolean prime = true;
			//finds out if number is prime or composite
			for (i = 2; i < number; i++)
				{
				if(number % i == 0)
				prime = false;
				}
					if (prime == false)
						{
						System.out.println(number + " is a composite number");
						}
						else if (prime == true)
						{
						System.out.println(number + " is a prime number");
						}

			//ask to test a another number
			System.out.println();
			System.out.print("Do test another number ? (Y/N)");
			confirm = scan.next();
			}

		System.out.println("Thank you for using the prime number detector!");
		System.out.println();

		}

	}