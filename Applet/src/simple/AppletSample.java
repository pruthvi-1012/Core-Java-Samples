package simple;

/* A simple applet that sets the foreground and
background colors and outputs a string. */
import java.awt.*;
import java.applet.*;

public class AppletSample extends Applet{
	
	String msg,a;
	int i=0;
	
// set the foreground and background colors.
	
public void init() {
	
	setBackground(Color.white);
	setForeground(Color.black);
	msg = "Inside init( ) --";
	
}

// Initialize the string to be displayed.

public void start() {
	
	msg += " Inside start( ) --";

}

// Display msg in applet window.

public void paint(Graphics g) {
	
	i=i+1;
	
	a=""+i;
	
	msg += " Inside paint( ).";
	
	g.drawString(msg, 10, 30);
	
	g.drawString(a,10,60);
	
	}
}
