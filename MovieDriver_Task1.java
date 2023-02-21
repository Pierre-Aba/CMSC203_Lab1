/*Class: CMSC203 CRN 30376
 Program: Lab 1
 Instructor: Grigoriy Grinberg
 Summary of Description: Creating a driver for a Movie Class
 Due Date: 2/20/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source. Pierre Aba */
import java.util.Scanner;
public class MovieDriver_Task1 {
	public static void main(String[] args)
	{
		Movie m1 = new Movie();
		System.out.println("Enter the title of a movie:");
		var sc = new Scanner(System.in);
		String movieName = sc.nextLine();
    	m1.setTitle(movieName);
		System.out.println("Enter the movies rating:");
		String movieRating = sc.nextLine();
		m1.setRating(movieRating);
		System.out.println("Enter the number of tickets sold at harlem theaters:");
		
		int ticketsSold = sc.nextInt();
		m1.setSoldTickets(ticketsSold);
		
		System.out.println(m1);
		
	}

}
