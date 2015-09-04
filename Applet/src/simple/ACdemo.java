package simple;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import java.net.*;
/*
<applet code="ACDemo" width=300 height=50>
</applet>
*/
public class ACdemo extends Applet implements ActionListener{
	
	Button play,stop;
	AudioClip audioClip;
	public void init(){
		play=new Button("play");
		add(play);
		
		play.addActionListener(this);
		stop=new Button("Stop");
		add(stop);
		
		audioClip=getAudioClip(getCodeBase(),"amplifier.mp3");
		
		System.out.println(getCodeBase());
		
	}
public void actionPerfomed(ActionEvent ae) {
/*AppletContext ac = getAppletContext();
URL url = getCodeBase(); // get url of this applet

try {
ac.showDocument(new URL(url+"Test.html"));
} catch(MalformedURLException e) {
showStatus("URL not found");
}*/
	Button source=(Button)ae.getSource();
	
	if(source.getLabel()=="play"){
		audioClip.play();
	}
	else if(source.getLabel()=="stop"){
		audioClip.stop();
	}
	
	URL url;
	try {
		url = new URL("file:F:/8th sem/WorkSpace/FileUploading/WebContent/images/Hdck.mp3");
		AppletContext ac= getAppletContext();
		
		ac.getAudioClip(url).play();
	
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
}
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
