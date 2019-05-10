/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    //Picture beach = new Picture("beach.jpg");
    KillPhotoshopRunner.p.explore();
    KillPhotoshopRunner.p.zeroBlue();
    KillPhotoshopRunner.p.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    //Picture caterpillar = new Picture("arch.jpg");
    KillPhotoshopRunner.p.explore();
    KillPhotoshopRunner.p.mirrorVertical();
    KillPhotoshopRunner.p.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    //Picture canvas = new Picture("640x480.jpg");
	  KillPhotoshopRunner.p.explore();
	  KillPhotoshopRunner.p.createCollage();
	  KillPhotoshopRunner.p.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    
	KillPhotoshopRunner.p.edgeDetection(KillPhotoshopRunner.num);
    KillPhotoshopRunner.p.explore();
  }
  
  public static void testkeepOnlyBlue()
  {
	  KillPhotoshopRunner.p.explore();
	  KillPhotoshopRunner.p.keepOnlyBlue();
	  KillPhotoshopRunner.p.explore();
  }
  
  public static void testnegate()
  {
	  KillPhotoshopRunner.p.explore();
	  KillPhotoshopRunner.p.negate();
	  KillPhotoshopRunner.p.explore();
  }
  
  public static void testgrayScale()
	  {
		  
		  KillPhotoshopRunner.p.explore();
		  KillPhotoshopRunner.p.grayScale();
		  KillPhotoshopRunner.p.explore();
	  }
  
  public static void testfixUnderwater()
	  {
		  Picture water = new Picture("water.jpg");
		  water.explore();
		  
	  }
  
  public static void testmirrorRightToLeft()
	  {
		  KillPhotoshopRunner.p.explore();
		  KillPhotoshopRunner.p.mirrorRightToLeft();
		  KillPhotoshopRunner.p.explore();
	  }
  
  public static void testmirrorHorizontal()
	  {
		  KillPhotoshopRunner.p.explore();
		  KillPhotoshopRunner.p.mirrorHorizontal();
		  KillPhotoshopRunner.p.explore();
	  }
  
  public static void testmirrorHorizontalBotToTop()
	  {
		  KillPhotoshopRunner.p.explore();
		  KillPhotoshopRunner.p.mirrorHorizontalBotToTop();
		  KillPhotoshopRunner.p.explore();
	  }
  
  public static void testmirrorDiagonaly()
	  {
		  KillPhotoshopRunner.p.explore();
		  KillPhotoshopRunner.p.mirrorDiagonaly();
		  KillPhotoshopRunner.p.explore();
	  }
  
	public static void testsnowman()
		{
		    int mirrorPoint = 195;
		    Pixel leftPixel = null;
		    Pixel rightPixel = null;
		    int count = 0;
		    Picture arch = new Picture("snowman.jpg");
		    Pixel[][] pixels = arch.getPixels2D();
	    
	    // loop through the rows
		    for (int col = 239; col < 293; col++)
		    	{
	      // loop from 13 to just before the mirror point
		    	for (int row = 172; row < mirrorPoint; row++)
		    		{
			        leftPixel = pixels[row][col];      
			        rightPixel = pixels[mirrorPoint - row + mirrorPoint]                       
			                         [col];
			        rightPixel.setColor(leftPixel.getColor());
		    		}
		    	}
		    mirrorPoint = 190;
		    
		    for (int col = 105; col < 169; col++)
		    	{
	      // loop from 13 to just before the mirror point
		    	for (int row = 159; row < mirrorPoint; row++)
		    		{
			        leftPixel = pixels[row][col];      
			        rightPixel = pixels[mirrorPoint - row + mirrorPoint]                       
			                         [col];
			        rightPixel.setColor(leftPixel.getColor());
		    		}
		    	}
		    arch.explore();
		}
	
	public static void testCopy(Picture fromPic, int startRow, int startCol, int endRow, int start )
		{
		    Pixel fromPixel = null;
		    Pixel toPixel = null;
		    Pixel[][] toPixels = fromPic.getPixels2D();
		    Pixel[][] fromPixels = fromPic.getPixels2D();
		    for (int fromRow = 0, toRow = startRow; 
		         fromRow < fromPixels.length &&
		         toRow < toPixels.length; 
		         fromRow++, toRow++)
		    	{
			      for (int fromCol = 0, toCol = startCol; 
			           fromCol < fromPixels[0].length &&
			           toCol < toPixels[0].length;  
			           fromCol++, toCol++)
			    	  {
				        fromPixel = fromPixels[fromRow][fromCol];
				        toPixel = toPixels[toRow][toCol];
				        toPixel.setColor(fromPixel.getColor());
			    	  }
		    	} 
		    //blob.explore();
		}
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	testsnowman();
	testmirrorDiagonaly();
	testmirrorHorizontalBotToTop();
	testmirrorHorizontal();
	testmirrorRightToLeft();
	//testfixUnderwater();
	//testgrayScale();
	//testnegate();
    //testZeroBlue();
    //testkeepOnlyBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    //estMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}

//Picture arch = new Picture("arch.jpg");
//Pixel[][] pixels = arch.getPixels2D();
//for (Pixel[] rowArray : pixels)
//	  {
//		  for (Pixel pixelObj : rowArray)
//			  {
//				  pixelObj.setRed(0);
//				  pixelObj.setGreen(0);
//			  }
//	  }