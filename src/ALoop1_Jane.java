/*Jane Wang
  Nov.4.2013
  ALoop1_Jane
  This program counts the smallest power of two that is greater or equal to the number*/
// The "ALoop1_Jane" class.
import java.awt.*;
import hsa.Console;

public class ALoop1_Jane
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int x, n = 0;
	double y = 0;
	do
	{
	    c.println ("please enter a positive integer");
	    x = c.readInt ();
	}while (x < 0);

	while (y < x)
	{
	    n++;
	    y = Math.pow (2, n);
	}
	c.println ("n = " + n);
    } // main method
} // ALoop1_Jane class
