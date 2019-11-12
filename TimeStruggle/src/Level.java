import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Level
{
	private JLabel image_Level;
	private Fellow_Student[] arr_Fellow_Students;
	private int level;
	
	public Level()
	{
		
	}
	
	public void initialize() //Initialization for Level 1
	{
		setImageLevel("Fellow_Stud.jpg");
		setFellow_Students(5);
		setLevel(1);
	}
	
	public void setImageLevel(String jpg)
	{
		ImageIcon image_Level = new ImageIcon(getClass().getResource(jpg));
		this.image_Level = new JLabel(image_Level);
	}
	
	public void setLevel(int level)
	{
		this.level = level;
	}
	
	public void setFellow_Students(int amount)
	{
		arr_Fellow_Students = new Fellow_Student[amount];
	}
	
	public void setImage_Level(String jpg)
	{
		ImageIcon image_Level = new ImageIcon(getClass().getResource(jpg));
		this.image_Level.setIcon(image_Level);
	}
}
