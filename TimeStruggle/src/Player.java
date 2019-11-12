import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player
{
	private static JLabel image_Player;
	private int credits;
	
	public Player()
	{
		
	}
	
	public void initialize() //Initialization
	{
		ImageIcon image_Player = new ImageIcon(getClass().getResource("pics/Player2.jpg"));
		this.image_Player = new JLabel(image_Player);
		
		setCredits(0);
	}
	
	public static JLabel getImage_Player()
	{
		return image_Player;
	}
	
	public int getCredits()
	{
		return credits;
	}
	
	public void setCredits(int credits)
	{
		this.credits = credits;
	}
}
