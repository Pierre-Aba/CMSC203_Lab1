import java.util.Scanner;
public class MovieDriver {
	public static void main(String[] args)
	{
		MovieDriver_Task1 m1 = new MovieDriver_Task1();
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
