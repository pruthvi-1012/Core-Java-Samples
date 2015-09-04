package simple;

/* A simple banner applet.
This applet creates a thread that scrolls
the message contained in msg right to left
across the applet's window.
*/
import java.awt.*;
import java.applet.*;

/*
<applet code="Banner" width=300 height=50>
</applet>

*/

public class Banner extends Applet implements Runnable {
	
	String msg = " A Simple Moving Banner.";//Simple Moving Banner.A
	Thread t = null;
	int state;
	boolean stopFlag;
	
// Set colors and initialize thread.
	
public void init() {
	
	setBackground(Color.cyan);
	setForeground(Color.red);
}

// Start thread

public void start() {
	
	t = new Thread(this);
	stopFlag = false;
	t.start();
	
}

// Entry point for the thread that runs the banner.

public void run() {
	
	char ch;
	
// Display banner
	
for( ; ; ) {
	
try {
		repaint();
		Thread.sleep(200);
		ch = msg.charAt(0);
		msg = msg.substring(1, msg.length());
		msg += ch;// Simple Moving Banner.A
		
			if(stopFlag)
					break;
			
		} catch(InterruptedException e) {}
	
	}
}

// Pause the banner.

public void stop() {
	
	stopFlag = true;
	t = null;
	
	}

// Display the banner.

	public void paint(Graphics g) {
		
	g.drawString(msg, 50, 30);
	
		}
	}

