/*
 * Class: CMSC203 CRN 30376
 * Instructor: Grigoriy Grinberg
 
 * Due: 2/21/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Pierre Aba
*/
import java.util.Scanner;
public class RandomNumberGuesser {
public static void main(String[] args)
{
	
	int randomNum = RNG.rand();
	System.out.println("This application generates a random integer between 1 and 100 \n  and asks the user to guess repeatedly until they guess correctly.");
	System.out.println("Enter your first guess: ");
	 Scanner sc = new Scanner(System.in);
	 
	int guess = sc.nextInt(), lowestGuess = 1, highestGuess = 100;
	
	RNG.resetCount();
	
	
	
	do
		{
		if(guess == randomNum)
		{
			System.out.println("Congratulations, you guessed correctly.\n Try again? (yes or no)");
			sc.nextLine();
			char redo = sc.nextLine().toLowerCase().charAt(0);
			if(redo == 'y')
				{
				randomNum = RNG.rand();
				RNG.resetCount();
				System.out.println("Enter your first guess: ");
				guess = sc.nextInt(); lowestGuess = 1; highestGuess = 100;
				}
			else {
				break;
			}
		}
		else if(guess > randomNum)
		{
			highestGuess = guess;
			System.out.println("Your guess is too high\nNumber of guesses is: "+(RNG.getCount()+1));
			RNG.inputValidation(guess, lowestGuess, highestGuess);
			guess = sc.nextInt();
						
		}
		else if(guess < randomNum)
		{
			System.out.println("Your guess is too low\nNumber of guesses is: "+(RNG.getCount()+1));
			lowestGuess = guess;
			RNG.inputValidation(guess, lowestGuess, highestGuess);
			guess = sc.nextInt();
		}
		}while (RNG.getCount()<7);
	if(RNG.getCount()==7)
		System.out.println("You have exceeded the maximum number of guesses, 7. Try again.");
	
}
}
