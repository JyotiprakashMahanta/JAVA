import java .awt.*;
import java.applet.*;
//<applet code="plan.class " width=500 height=500 ></Applet>
public class plan extends Applet implements Runnable
{
	Thread  th;int w;
	public void init()
	{
		w=0;
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		for(w=30;w<400;w++)
		{
			try
			{
				th.sleep(500);
			}
			catch(Exception a)
			{
				System.out.println(a.toString());
			}
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.drawOval(25,65,110,112);
		g.drawLine(350,175,100,70);
		g.drawLine(100,175,350,70);
		g.drawRect(350,65,20,112);
		g.drawRect(75,40,10,25);
		g.drawRect(40,40,35,8);
		g.drawRect(85,40,35,8);
	}
}
