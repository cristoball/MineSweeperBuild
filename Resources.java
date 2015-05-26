/**
 * 
 */


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.Hashtable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * @author Christoball
 *
 */
public class Resources 
{
	public static final String RESOURCE_DIR = ".";
	public static final String IMG_TYPE = ".png";
	
	public static final String GAME_TITLE = " Mine Sweeper";
	public static final String WINNING_MESSAGE = "Congratulations! You won the game! PLEASE ENTER YOUR NAME.\n\nYour winning time (seconds) is ";
	public static final String YourName = "Your Name";
	
	public static final ImageIcon iconHappyFace = new ImageIcon("HappyFace.png");
	
	//public final ImageIcon iconHappyFace2 = new ImageIcon(getClass().getResource("HappyFace.png"));
	
	public static final ImageIcon iconHappyPressedFace = new ImageIcon("HappyPressedFace.png");
	public static final ImageIcon iconUncertainFace = new ImageIcon("UncertainFace.png");
	public static final ImageIcon iconYuckFace = new ImageIcon("YuckFace.png");
	public static final ImageIcon iconCoolFace = new ImageIcon("CoolFace.png");
	
	public static final ImageIcon iconUntouched = new ImageIcon("untouched.png");
	public static final ImageIcon icon0Mines = new ImageIcon("0Mines.png");
	public static final ImageIcon icon1Mines = new ImageIcon("1Mines.png");
	public static final ImageIcon icon2Mines = new ImageIcon("2Mines.png");
	public static final ImageIcon icon3Mines = new ImageIcon("3Mines.png");
	public static final ImageIcon icon4Mines = new ImageIcon("4Mines.png");
	public static final ImageIcon icon5Mines = new ImageIcon("5Mines.png");
	public static final ImageIcon icon6Mines = new ImageIcon("6Mines.png");
	public static final ImageIcon icon7Mines = new ImageIcon("7Mines.png");
	public static final ImageIcon icon8Mines = new ImageIcon("8Mines.png");

	public static final ImageIcon iconRedMine = new ImageIcon("RedMine.png");
	public static final ImageIcon iconBlackMine = new ImageIcon("BlackMine.png");
	public static final ImageIcon iconDisarmed = new ImageIcon("DisarmedMine.png");
	public static final ImageIcon iconPossibleMine = new ImageIcon("PossibleMine.png");
	
	public static final ImageIcon icon0 = new ImageIcon("0.png");
	public static final ImageIcon icon1 = new ImageIcon("1.png");
	public static final ImageIcon icon2 = new ImageIcon("2.png");
	public static final ImageIcon icon3 = new ImageIcon("3.png");
	public static final ImageIcon icon4 = new ImageIcon("4.png");
	public static final ImageIcon icon5 = new ImageIcon("5.png");
	public static final ImageIcon icon6 = new ImageIcon("6.png");
	public static final ImageIcon icon7 = new ImageIcon("7.png");
	public static final ImageIcon icon8 = new ImageIcon("8.png");
	public static final ImageIcon icon9 = new ImageIcon("9.png");
	
	public static final String sfileBestTimes = "BestTimes.ser";
	
	public static Hashtable <ImageIcon, Integer> htMineImagesToNums = new Hashtable();
	public static Hashtable <Integer, ImageIcon> htNumsToMineImages = new Hashtable();
	public static Hashtable <String, ImageIcon> htDigits = new Hashtable();
	
	static 
	{
		
		
		htMineImagesToNums.put(icon0Mines, 0 );
		htMineImagesToNums.put(icon1Mines, 1 );
		htMineImagesToNums.put(icon2Mines, 2 );
		htMineImagesToNums.put(icon3Mines, 3 );
		htMineImagesToNums.put(icon4Mines, 4 );
		htMineImagesToNums.put(icon5Mines, 5 );
		htMineImagesToNums.put(icon6Mines, 6 );
		htMineImagesToNums.put(icon7Mines, 7 );
		htMineImagesToNums.put(icon8Mines, 8 );
		
		htNumsToMineImages.put(0, icon0Mines);
		htNumsToMineImages.put(1, icon1Mines);
		htNumsToMineImages.put(2, icon2Mines);
		htNumsToMineImages.put(3, icon3Mines);
		htNumsToMineImages.put(4, icon4Mines);
		htNumsToMineImages.put(5, icon5Mines);
		htNumsToMineImages.put(6, icon6Mines);
		htNumsToMineImages.put(7, icon7Mines);
		htNumsToMineImages.put(8, icon8Mines);
	}
	
	public Resources()
	{
//		URL url = getClass().getResource("HappyFace.png");
//		String sUrl = url.toExternalForm();
//		
//		File file = new File("/res/HappyFace.png");
//		String sPath = file.getAbsolutePath();
//		
//		System.out.println(iconHappyFace2.getDescription());
		
	}
	
	/** Returns an ImageIcon, or null if the path was invalid. */
	protected ImageIcon createImageIcon(String path, String description) 
	{
	    java.net.URL imgURL = getClass().getResource(path);
	    if (imgURL != null) {
	        return new ImageIcon(imgURL, description);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}	
}
