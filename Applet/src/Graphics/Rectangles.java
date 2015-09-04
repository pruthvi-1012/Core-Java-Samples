package Graphics;

import java.applet.Applet;
import java.awt.Graphics;

public class Rectangles extends Applet{

	public void paint(Graphics g)
	
	{
		g.drawRect(10,10,60,60);
		g.fillRect(54,67,89,56);
		g.drawRoundRect(190,10,60,50,15,15);
		
	}
	
}
