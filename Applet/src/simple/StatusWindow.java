package simple;

//Using the Status Window.
import java.awt.*;
import java.applet.*;
/*
<applet code="StatusWindow" width=300 height=50>
</applet>
*/
public class StatusWindow extends Applet{
	
	int i=0;
	
public void init() {
	
setBackground(Color.cyan);

}

// Display msg in applet window.

public void paint(Graphics g) {
	
i=i+1;

g.drawString(""+i, 30, 40);
g.drawString("This is in the applet window.", 10, 20);
showStatus("This is shown in the status window.");

}
}
