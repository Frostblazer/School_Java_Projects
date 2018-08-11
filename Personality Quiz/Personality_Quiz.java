//-----------------------------------------------------------------------
//Purpose:	Give user a personality quiz for introversion/extroversion.
//			Score each question and interpret final score for user.
//-----------------------------------------------------------------------

import java.util.Scanner;

public class Personality_Quiz
{
	public static void main (String[] args)
	{
		//These constants are the questions and answers for the quiz
		final String Question1 = "I enjoy being the center of attention.";
		final String Question2 = "Being around other people makes me feel energized.";
		final String Question3 = "When given the choice to work on a task, I would prefer to";
		final String Question4 = "I enjoy solitude.";
		final String Question5 = "During parties or social gatherings, I tend to";
		final String Question6 = "When I'm dealing with a personal problem, I prefer to";
		final String Question7 = "When talking to other people, I typically";
		final String Question8 = "People describe me as thoughtful, reserved, and soft-spoken.";
		final String Question9 = "I enjoy meeting new people.";
		final String Question10 = "Other people might say that I'm difficult to get to know.";

		final String Opt1a = "Rarely";
		final String Opt2a = "Not at all";
		final String Opt3a = "Work alone";
		final String Opt4a = "Often";
		final String Opt5a = "Keep to myself";
		final String Opt6a = "Solve it on my own";
		final String Opt7a = "Plan and think carefully about what I will say";
		final String Opt8a = "Very much, I'm pretty quiet";
		final String Opt9a = "No, I'm more comfortable with close friends I already know";
		final String Opt10a = "Yes, I am fairly reserved";

		final String Opt1b = "Sometimes";
		final String Opt2b = "Somewhat";
		final String Opt3b = "Be part of a very small group";
		final String Opt4b = "Sometimes ";
		final String Opt5b = "Talk to a few people I already know";
		final String Opt6b = "Discuss it only with a close friend";
		final String Opt7b = "Speak freely but monitor what I'm saying";
		final String Opt8b = "Sometimes ";
		final String Opt9b = "Sometimes, depending on my mood";
		final String Opt10b = "Maybe, but I open up once I get acquainted with someone";

		final String Opt1c = "Usually";
		final String Opt2c = "Very much";
		final String Opt3c = "Work with many people";
		final String Opt4c = "Rarely";
		final String Opt5c = "Mingle, meet new people, and talk to everyone I can";
		final String Opt6c = "Talk openly about it with others and enlist their help";
		final String Opt7c = "Speak spontaneously without really thinking first";
		final String Opt8c = "Not really, I'm pretty talkative";
		final String Opt9c = "Yes, I love to make new friends";
		final String Opt10c = "Not at all, I'm very open and easy to know";

		char response, letter;
		int score = 0;
		String pType, pStrength;

		System.out.println("----------------");
		System.out.println("PERSONALITY QUIZ");
		System.out.println("----------------\n");

		System.out.println ("I will ask you a few questions below.");
		System.out.println ("Please enter the LETTER of your response for each one.");
		System.out.println();

		response = GetUserAnswer(Question1, Opt1a, Opt1b, Opt1c);
		score += ResponseValue(response);

		while (response != 'A' && response != 'a' && response != 'B' && response != 'b' && response != 'C' && response != 'c')
		{
		System.out.println();
		System.out.println("Please enter answer A, B, or C for the question.");
		response = GetUserAnswer(Question1, Opt1a, Opt1b, Opt1c);
		score += ResponseValue(response);
		}

		response = GetUserAnswer(Question2, Opt2a, Opt2b, Opt2c);
		score += ResponseValue(response);

		while (response != 'A' && response != 'a' && response != 'B' && response != 'b' && response != 'C' && response != 'c')
		{
		System.out.println();
		System.out.println("Please enter answer A, B, or C for the question.");
		response = GetUserAnswer(Question2, Opt2a, Opt2b, Opt2c);
		score += ResponseValue(response);
		}

		response = GetUserAnswer(Question3, Opt3a, Opt3b, Opt3c);
		score += ResponseValue(response);

		while (response != 'A' && response != 'a' && response != 'B' && response != 'b' && response != 'C' && response != 'c')
		{
		System.out.println();
		System.out.println("Please enter answer A, B, or C for the question.");
		response = GetUserAnswer(Question3, Opt3a, Opt3b, Opt3c);
		score += ResponseValue(response);
		}

		response = GetUserAnswer(Question4, Opt4a, Opt4b, Opt4c);
		score += ResponseValue(response);

		while (response != 'A' && response != 'a' && response != 'B' && response != 'b' && response != 'C' && response != 'c')
		{
		System.out.println();
		System.out.println("Please enter answer A, B, or C for the question.");
		response = GetUserAnswer(Question4, Opt4a, Opt4b, Opt4c);
		score += ResponseValue(response);
		}

		response = GetUserAnswer(Question5, Opt5a, Opt5b, Opt5c);
		score += ResponseValue(response);

		while (response != 'A' && response != 'a' && response != 'B' && response != 'b' && response != 'C' && response != 'c')
		{
		System.out.println();
		System.out.println("Please enter answer A, B, or C for the question.");
		response = GetUserAnswer(Question5, Opt5a, Opt5b, Opt5c);
		score += ResponseValue(response);
		}

		response = GetUserAnswer(Question6, Opt6a, Opt6b, Opt6c);
		score += ResponseValue(response);

		while (response != 'A' && response != 'a' && response != 'B' && response != 'b' && response != 'C' && response != 'c')
		{
		System.out.println();
		System.out.println("Please enter answer A, B, or C for the question.");
		response = GetUserAnswer(Question6, Opt6a, Opt6b, Opt6c);
		score += ResponseValue(response);
		}

		response = GetUserAnswer(Question7, Opt7a, Opt7b, Opt7c);
		score += ResponseValue(response);

		while (response != 'A' && response != 'a' && response != 'B' && response != 'b' && response != 'C' && response != 'c')
		{
		System.out.println();
		System.out.println("Please enter answer A, B, or C for the question.");
		response = GetUserAnswer(Question7, Opt7a, Opt7b, Opt7c);
		score += ResponseValue(response);
		}


		response = GetUserAnswer(Question8, Opt8a, Opt8b, Opt8c);
		score += ResponseValue(response);

		while (response != 'A' && response != 'a' && response != 'B' && response != 'b' && response != 'C' && response != 'c')
		{
		System.out.println();
		System.out.println("Please enter answer A, B, or C for the question.");
		response = GetUserAnswer(Question8, Opt8a, Opt8b, Opt8c);
		score += ResponseValue(response);
		}

		response = GetUserAnswer(Question9, Opt9a, Opt9b, Opt9c);
		score += ResponseValue(response);

		while (response != 'A' && response != 'a' && response != 'B' && response != 'b' && response != 'C' && response != 'c')
		{
		System.out.println();
		System.out.println("Please enter answer A, B, or C for the question.");
		response = GetUserAnswer(Question9, Opt9a, Opt9b, Opt9c);
		score += ResponseValue(response);
		}

		response = GetUserAnswer(Question10, Opt10a, Opt10b, Opt10c);
		score += ResponseValue(response);

		while (response != 'A' && response != 'a' && response != 'B' && response != 'b' && response != 'C' && response != 'c')
		{
		System.out.println();
		System.out.println("Please enter answer A, B, or C for the question.");
		response = GetUserAnswer(Question10, Opt10a, Opt10b, Opt10c);
		score += ResponseValue(response);
		}

		System.out.println("\n\nThis completes the quiz.  Thank you for your responses.");
		System.out.println("\n=========================================================\n");

		pStrength = Quantify(score);
		pType = Interpret(score);

		System.out.print("According to the quiz, your type is: ");
		System.out.println(pStrength + " " + pType + ".");
		System.out.println();
		System.out.println("Thanks for taking the quiz!");
		System.out.println();
	}

/*******************Static Methods*********************/

	//===========================================================
	//Method: 	GetUserAnswer
	//Purpose:	Present a question and get user's answer
	//Parameters: The question and all 3 answers (strings)
	//Returns:	The user's selection (character)
	//===========================================================

	public static char GetUserAnswer(String question, String optA, String optB, String optC)
	{
		Scanner keyboard = new Scanner (System.in);
		String response;
		char opt;

		System.out.println("\n" + question);
		System.out.println("\tA. " + optA);
		System.out.println("\tB. " + optB);
		System.out.println("\tC. " + optC);
		System.out.print("\nSelect One ==> ");

		response = keyboard.next();

		//Strip off spaces and extra characters
		opt = response.trim().charAt(0);

		return opt;
	}

	//===========================================================
	//Method: 	ResponseValue
	//Purpose:	Convert quiz response to numeric value in quiz
	//Parameter: The response to a quiz question (char)
	//Returns:	The numeric value for the answer (int)
	//			A is worth -1
	//			B is worth 0
	//			C is worth 1
	//===========================================================
	public static int ResponseValue(char letter)
	{
		int number = 0;

		//TODO: Use a switch statement to SET number to the correct value

		switch (letter)
			{
				case 'A':
				number = -1;
				case 'a':
				number = -1;
				break;
				case 'B':
				number = 0;
				case 'b':
				number = 0;
				break;
				default:
				number = 1;
			}
		return number;
	}

	//===========================================================
	//Method: 	Interpret
	//Purpose:	Interpret total quiz score as introvert or extravert
	//Parameter: Total quiz score (int)
	//Returns:	The word for the user's type (String)
	//			positive scores are interpreted as extrovert
	//			all other scores are interpreted as introvert
	//===========================================================
	public static String Interpret(int quizScore)
	{
		String type = "";

		//TODO: Set type to correct word, using the conditional operator

		type = (quizScore > 0 ? "extrovert" : "introvert");

		return type;
	}

	//===========================================================
	//Method: 	Quantify
	//Purpose:	Interpret total quiz score as moderate or strong
	//Parameter: Total quiz score (int)
	//Returns:	The word for strength of user's type (String)
	//			absolute value of 2 or less: moderate
	//			all others: strong
	//===========================================================
	public static String Quantify(int quizScore)
	{
		String strength = "";

		//BONUS OPTION (NOT REQUIRED)
		//TODO: Set strength to correct word, using the conditional operator

		return strength;
	}

}