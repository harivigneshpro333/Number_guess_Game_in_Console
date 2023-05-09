package Project_1;
import java.lang.*;
import java.util.Scanner;
public class Guess_Num_Game {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int attempt= 1;
		
		int comp=(int)(Math.random()*100);
		
	System.out.println("Guessing  Number Game Started!!! \n Are U Ready..."
			+ "\n Guessing Limit Are 1 To 100: "
			+ "\n U Have Only 5 Chance To Play So Don't Forget it!"
			+ "\n Enjoy Your MOMENT... ");
		while(attempt<=5)
	 {
		System.out.println("\nEnter Your "+attempt+" Guess: ");
		int guess=in.nextInt();
		
		if(comp==guess)
		{
			System.out.println("🤞😎😊  🤞😎😊 !wow! You 'WON'The Game Now!!! 🤞😎😊  🤞😎😊");
			System.out.println("(☞ﾟヮﾟ)☞    😊😍😉😎    ☜(ﾟヮﾟ☜)");
		break;
		}
		else if(comp>guess)
		{
			System.out.println("Your Guess "+guess+" Is Too Low...\n Try Again!!!");
		}
		else
		{
			System.out.println("Your Guess "+guess+ " Is Too High...\n Try Again!!!");
		}
	attempt++;
	}
		if(attempt==6){
		System.out.println(" \nMy True Guess is*** "+comp+" ***");
		System.out.println("\n\t\t    😒😢✌!SORRY!😒😢✌! "
				+ "\n\t\t !!😒😢✌ YOU LOST 😒😢✌!!"
				+ "\n\t\t!!!😒😢✌  GAME OVER  ✌😒😢!!!"
				+ "\n\t...😊😍😉😎✌BETTER LUCK NEXT TIME MY DEAR😊😍😉😎✌..."
	+ "\n ^_^MAKE MORE HAPPIEST MEMEORIES TO JOY YOUR FUTURE🤦‍♀️\n\t\t***😜 BE SMILE 😉***");		
	
		}
  }

}
