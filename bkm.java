//<applet code="j.class" height=600 width=500></applet>
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 class Dra extends Applet
 {
 
    public void paint(Graphics g){
 
    g.setColor(Color.green);

    g.draw3DRect(10,10,50,100,true);
    g.draw3DRect(100,100,50,50,true);
 
    g.setColor(Color.orange);
 
 
    g.fill3DRect(10,150,50,100,true);
    g.fill3DRect(100,200,50,50,true);
 
 }
}