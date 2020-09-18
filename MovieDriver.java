package movie.java;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char again='y';
		while(again=='y')
		{
		Movie newmovie=new Movie();
		System.out.println("Enter the name of the movie : ");
		String title=input.nextLine();
		newmovie.setTitle(title);
		System.out.println("Enter the rating of the movie : ");
		String rating=input.next();
		newmovie.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie : ");
		int tickets=input.nextInt();
		newmovie.setSoldTickets(tickets);
		System.out.println(newmovie.toString());
		System.out.println("Do you want to enter another ?(y or n)");
		again=input.next().charAt(0);
		input.nextLine();

		}

		System.out.println("Goodbye!");


		   }

		}


	}

}
