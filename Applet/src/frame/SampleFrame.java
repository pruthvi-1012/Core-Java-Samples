package frame;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="AppletFrame" width=300 height=50>
</applet>
*/

// Create a subclass of Frame.

class SampleFrame extends Frame implements WindowListener,MouseListener{
	
	
	
SampleFrame(String title) {
	
	super(title);
	
	
// create an object to handle window events
//MyWindowAdapter adapter = new MyWindowAdapter(this);
// register it to receive those events
	
	
	addWindowListener(this);
	addMouseListener(this);
	
}

public static void main(String args[]){
	
	SampleFrame sf=new SampleFrame("Sample");
	sf.setSize(500,500);
	sf.setVisible(true);
	
}
		public void paint(Graphics g) {
			g.drawString("This is in frame window", 10, 40);
		}

		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
		
		}

		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			this.setVisible(false);
	
		}

		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			this.setBackground(Color.red);
		}

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
	
		}

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			this.setBackground(Color.white);
		}

		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
}


	/*class MyWindowAdapter extends WindowAdapter {
			SampleFrame sampleFrame;
				public MyWindowAdapter(SampleFrame sampleFrame) {
						this.sampleFrame = sampleFrame;
				}
				
				public void windowClosing(WindowEvent we) {
						sampleFrame.setVisible(false);
				}
}
*/