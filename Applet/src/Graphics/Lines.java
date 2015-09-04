package Graphics;

import java.applet.Applet;
import java.awt.Graphics;

public class Lines extends Applet{
	
	
	public void paint(Graphics g){
		
		g.drawLine(0,0,10,10);
		g.drawLine(20,20,50,50);
		g.drawRect(20,30,40 ,50);
		
	}

}
