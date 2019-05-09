
import java.util.*;

public class KillPhotoshopRunner
	{
		//menu in the console
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				System.out.println("Welcome to men-U!");
				System.out.println("Described by Rolling Stone Magazine as '...a program...'");
				menu();
			}
		
		public static void menu()
		{
			Scanner userInt = new Scanner(System.in);
			System.out.println("1) Mirror Horizontally");
			int userAnswer = userInt.nextInt();
			if (userAnswer == 1){
				PictureTester.testmirrorHorizontal();
			}
		}

	}
