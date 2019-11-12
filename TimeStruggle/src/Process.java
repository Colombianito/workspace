import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Process implements KeyListener
{
	public static void main(String[] args)
	{
		Process p1 = new Process();
		
		GUI gui = new GUI();
		Player player = new Player();
//		Level level = new Level();
//		Fellow_Student fellow_Students = new Fellow_Student();
		
		p1.initializeGame(gui, player/*, level, fellow_Students*/);
		
		gui.add(player.getImage_Player());
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(600, 400);
		gui.setTitle("Time Struggle");
		gui.addKeyListener(p1);
	}
	
	public void initializeGame(GUI gui, Player player/*, Level level, Fellow_Student fellow_Students*/)
	{
		player.initialize();
//		level.initialize();
//		fellow_Students.initialize();
	}
	
	public void paint(Graphics g)
	{
		ImageObserver observer;
		
		ImageIcon image = new ImageIcon(getClass().getResource("pics/Player2.jpg"));
		javafx.scene.image.Image image2 = new javafx.scene.image.Image("sd");
		g.drawImage(image2, 40, 50, observer);
	}

	@Override
	public void keyPressed(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
}
