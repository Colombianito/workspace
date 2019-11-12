import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Fellow_Student
{
	private JLabel image_Fellow_Stud;
	private double speed;
	private Point location;
	
	
	public Fellow_Student()
	{
		
	}
	
	public void initialize() //Initialization for Level 1
	{
		ImageIcon image_Fellow_Stud = new ImageIcon(getClass().getResource("Fellow_Stud.jpg"));
		this.image_Fellow_Stud = new JLabel(image_Fellow_Stud);
		
		setSpeed(10);
		setLocation(new Point(2,3));
	}
	
	public JLabel getImage_Fellow_Stud()
	{
		return image_Fellow_Stud;
	}

	public void setImage_Fellow_Stud(JLabel image_Fellow_Stud)
	{
		this.image_Fellow_Stud = image_Fellow_Stud;
	}

	public double getSpeed()
	{
		return speed;
	}

	public void setSpeed(double speed)
	{
		this.speed = speed;
	}

	public Point getLocation()
	{
		return location;
	}

	public void setLocation(Point location)
	{
		this.location = location;
	}

	public void setImage_Level(String jpg)
	{
		ImageIcon image_Fellow_Stud = new ImageIcon(getClass().getResource(jpg));
		this.image_Fellow_Stud.setIcon(image_Fellow_Stud);
	}
}
