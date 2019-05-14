
import java.util.*;

public class KillPhotoshopRunner
	{
		static int num = 0;
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

			System.out.println("10) dog");

			int userAnswer = userInt.nextInt();
			switch(userAnswer) {
				case 1: p = new Picture("arch.jpg");
				break;
				
				case 2: p = new Picture("beach.jpg");
				break;
				
				case 3: p = new Picture("blobfish.jpg");
				break;
				
				case 4: p = new Picture("redMotorcycle.jpg");
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
				
				case 10: p = new Picture("dog.jpg");
				break;
				
				case 11: p = new Picture("bat.jpg");
				break;
			}
			
			System.out.println("Choose a tool");
			System.out.println("1) Zero Blue");
			System.out.println("2) Mirror Vertical");
			System.out.println("3) Mirror Horizontal");
			System.out.println("4) Mirror Right to Left");
			System.out.println("5) Mirror Bottom To Top");
			System.out.println("6) Mirror Diagonaly");
			System.out.println("7) Grayscale");
			System.out.println("8) Negate");
			System.out.println("9) Keep Only Blue");
			System.out.println("10) Collage");
			System.out.println("11) Edge Detection");
			System.out.println("12) Collage");
			
			userAnswer = userInt.nextInt();
			
			switch(userAnswer) {
			case 1: PictureTester.testZeroBlue();
			break;
			
			case 2: PictureTester.testMirrorVertical();
			break;
			
			case 3: PictureTester.testmirrorHorizontal();
			break;
			
			case 4: PictureTester.testmirrorRightToLeft();
			break;
			
			case 5: PictureTester.testmirrorHorizontalBotToTop();
			break;
			
			case 6: PictureTester.testmirrorDiagonaly();
			break;
			
			case 7: PictureTester.testgrayScale();
			break;
			
			case 8: PictureTester.testnegate();
			break;
			
			case 9: PictureTester.testkeepOnlyBlue();
			break;
			
			case 10: PictureTester.testkeepOnlyBlue();
			break;
			
			case 11: 
				System.out.println("Intensity?");
				System.out.println("1-100, 1 being the most intense");
				num = userInt.nextInt();
				PictureTester.testEdgeDetection();
			break;
			case 12:
				PictureTester.testCollage();
		}
		}

	}
