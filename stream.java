import java .io.*;
import java .awt.*;
class  Stream2 extends Frame
{
	int r,c;
	TextField t[][]=new TextField[10 ][6];
	//t[][]=new TextField("");
	Stream2 ()
	{
	setLayout(null);
	for(r=1;r<=10;r++)
	{	
		
		for(c=1;c<=6;c++)
		{
				
			t[r-1][c-1]=new TextField("");
			add(t[r-1] [c-1]);
			t[r-1][c-1].setBounds(60*c,40*r,60,40);
		}
	}
	setVisible(true);
	}
}
class Dis
{
	public static void main(String args[])
	{
		Stream2 s=new Stream2();
	}
}