//SCROLLBAR COLOR CHANGED
import java.awt.*;
import java .awt.event.*;
class col extends Frame implements  AdjustmentListener
{
	Scrollbar  sb1=new Scrollbar(Scrollbar.HORIZONTAL);
	Scrollbar  sb2=new Scrollbar(Scrollbar.HORIZONTAL);
	Scrollbar  sb3=new Scrollbar(Scrollbar.HORIZONTAL);
	col()
	{
		setLayout(null);
		add(sb1);add(sb2);add(sb3);
		sb1.setMinimum(0);sb2.setMinimum(0);sb3.setMinimum(0);
		sb1.setMaximum(255);sb2.setMaximum(255);sb3.setMaximum(255);	
		sb1.setBounds(50,100,200,30);
		sb2.setBounds(50,140,200,30);
		sb3.setBounds(50,180,200,30);
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);
		setBounds(0,0,400,400);
		setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent a)
	{
		setc();
	}
	private void setc()
	{
		int r=sb1.getValue();
		int g=sb2.getValue();
		int b=sb3.getValue();
		Color c=new Color(r,g,b);
		setBackground(c);
		invalidate();
	}
}
class Dis 
{
	public static void main(String args[])
	{
		col cc=new col();
	}
}