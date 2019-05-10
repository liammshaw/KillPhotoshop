
import java.util.*;

public class KillPhotoshopRunner
	{
		public static Picture p;
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
			System.out.println("Please choose a picture");
			System.out.println("1) a beautiful arch");
			System.out.println("2) a nice beach");
			System.out.println("3) blobfish");
			System.out.println("4) moped");
			System.out.println("5) butterfly");
			System.out.println("6) caterpillar");
			System.out.println("7) China");
			System.out.println("8) gorge");
			System.out.println("9) koala");
			System.out.println("11) Pat");
			int userAnswer = userInt.nextInt();
			switch(userAnswer) {
				case 1: p = new Picture("arch.jpg");
				break;
				
				case 2: p = new Picture("beach.jpg");
				break;
				
				case 3: p = new Picture("blobfish.jpg");
				break;
				
				case 4: p = new Picture("motorcycle.jpg");
				break;
				
				case 5: p = new Picture("butterfly.jpg");
				break;
				
				case 6: p = new Picture("caterpillar.jpg");
				break;
				
				case 7: p = new Picture("china.jpg");
				break;
				
				case 8: p = new Picture("gorge.jpg");
				break;
				
				case 9: p = new Picture("koala.jpg");
				break;
				
				case 10: p = new Picture("beach.jpg");
				break;
				
				case 11: p = new Picture("bat.jpg");
				break;
			}
			p.explore();
		}

	}
