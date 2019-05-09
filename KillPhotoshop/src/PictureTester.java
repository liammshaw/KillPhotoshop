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
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("arch.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
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
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testkeepOnlyBlue()
  {
	  Picture arch = new Picture("arch.jpg");
	  Pixel[][] pixels = arch.getPixels2D();
	  for (Pixel[] rowArray : pixels)
		  {
			  for (Pixel pixelObj : rowArray)
				  {
					  pixelObj.setRed(0);
					  pixelObj.setGreen(0);
				  }
		  }
	  arch.explore();
  }
  
  public static void testnegate()
  {
	  Picture arch = new Picture("arch.jpg");
	  Pixel[][] pixels = arch.getPixels2D();
	  for (Pixel[] rowArray : pixels)
		  {
			  for (Pixel pixelObj : rowArray)
				  {
					  pixelObj.setRed(pixelObj.getRed() - 255);
					  pixelObj.setGreen(pixelObj.getGreen() - 255);
					  pixelObj.setBlue(pixelObj.getBlue() -255);
				  }
		  }
	  arch.explore();
  }
  
  public static void testgrayScale()
	  {
		  Picture arch = new Picture("arch.jpg");
		  Pixel[][] pixels = arch.getPixels2D();
		  for (Pixel[] rowArray : pixels)
			  {
				  for (Pixel pixelObj : rowArray)
					  {
						  pixelObj.setRed((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
						  pixelObj.setGreen((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
						  pixelObj.setBlue((pixelObj.getRed() + pixelObj.getBlue() + pixelObj.getGreen())/3);
					  }
			  }
		  arch.explore();
	  }
  
  public static void testfixUnderwater()
	  {
		  Picture water = new Picture("water.jpg");
		  water.explore();
		  
	  }
  
  public static void testmirrorRightToLeft()
	  {
		  Picture arch = new Picture("arch.jpg");
		  Pixel[][] pixels = arch.getPixels2D();
		    Pixel leftPixel = null;
		    Pixel rightPixel = null;
		    int width = pixels[0].length;
		    for (int row = 0; row < pixels.length; row++)
		    	{
		    	for (int col = width/2; col < pixels[row].length; col++)
		    		{
			        leftPixel = pixels[row][col];
			        rightPixel = pixels[row][width - 1 - col];
			        rightPixel.setColor(leftPixel.getColor());
		    		}
		    	}
		    arch.explore();
	  }
  
  public static void testmirrorHorizontal()
	  {
		  Picture arch = new Picture("arch.jpg");
		  Pixel[][] pixels = arch.getPixels2D();
		    Pixel leftPixel = null;
		    Pixel rightPixel = null;
		    int height = pixels.length;
		    for (int col = 0; col < pixels[0].length; col++)
		    	{
		    	for (int row =0; row < pixels.length; row++)
		    		{
			        leftPixel = pixels[row][col];
			        rightPixel = pixels[height-1-row][col];
			        rightPixel.setColor(leftPixel.getColor());
		    		}
		    	}
		    arch.explore();
	  }
  
  public static void testmirrorHorizontalBotToTop()
	  {
		  Picture arch = new Picture("arch.jpg");
		  Pixel[][] pixels = arch.getPixels2D();
		    Pixel leftPixel = null;
		    Pixel rightPixel = null;
		    int height = pixels.length;
		    for (int col = 0; col < pixels[0].length; col++)
		    	{
		    	for (int row =height/2; row < pixels.length; row++)
		    		{
			        leftPixel = pixels[row][col];
			        rightPixel = pixels[height-1-row][col];
			        rightPixel.setColor(leftPixel.getColor());
		    		}
		    	}
		    arch.explore();
	  }
  
  public static void testmirrorDiagonaly()
	  {
		  Picture arch = new Picture("blobfish.jpg");
		  Pixel[][] pixels = arch.getPixels2D();
		    Pixel leftPixel = null;
		    Pixel rightPixel = null;
		    int height = pixels.length;
		    for (int row = 0; row < pixels.length; row++)
		    	{
		    	for (int col =0 + row; col < pixels[0].length; col++)
		    		{
			        leftPixel = pixels[row][col];
			        rightPixel = pixels[col][row];
			        rightPixel.setColor(leftPixel.getColor());
		    		}
		    	}
		    arch.explore();
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