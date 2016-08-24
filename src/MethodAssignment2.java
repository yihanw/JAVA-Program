/*Jane Wang
  Jan 23, 2014
  MethodAssignment2
  This program keeps asking user for two or three parameters, and displays the maxinum, minimun,and midian value.
*/          

// The "MethodAssignment2" class.
import java.awt.*;
import hsa.Console;

public class MethodAssignment2
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int n;
	c.println ("how many parameters are going to be entered, 2 or 3");
	n = c.readInt ();
	while (n != 2 && n != 3)//focus user to enter 2 or 3
	{
	    c.println ("invalid value, enter again");
	    n = c.readInt ();
	}//while loop ends

	if (n == 2)//if there are two parameters
	{
	    int a, b;
	    do
	    {
		c.println ("please enter two integers -0 0 to terminate");
		a = c.readInt ();
		b = c.readInt ();
		if (isFinished (a, b))
		{
		    c.println ("program terminated");
		}
		else
		{
		    displayValues (a, b);
		}
	    }
	    while (!isFinished (a, b));//do while loop ends
	}
	
	if (n == 3)//if there are three parameters
	{
	    int a, b, d;
	    do
	    {
		c.println ("please enter three integers -0 0 0 to terminate");
		a = c.readInt ();
		b = c.readInt ();
		d = c.readInt ();

		if (isFinished (a, b, d))
		{
		    c.println ("program terminated");
		}
		else
		{
		    displayValues (a, b, d);
		}
	    }
	    while (!isFinished (a, b, d));//do while loop ends
	}
    }

    //two parameters
    public static int min (int a, int b)
    {
	if (a <= b)
	{
	    return a;
	}
	else
	{
	    return b;
	}

    }//min method

    public static int max (int a, int b)
    {
	if (a >= b)
	{
	    return a;
	}
	else
	{
	    return b;
	}

    }//max method

    public static boolean isFinished (int a, int b)
    {
	if (a == 0 && b == 0)
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }//isFinished method

    public static void displayValues (int a, int b)
    {
	c.println ("User input : " + a + " " + b);
	c.println ("Max value: " + max (a, b) + " Min value: " + min (a, b));
    }//dispalyValues method

    //three parameters
    public static int min (int a, int b, int d)
    {
	if (a <= b && a < d)
	{
	    return a;
	}
	else if (b <= a && b < d)
	{
	    return b;
	}
	else
	{
	    return d;
	}

    }//min method

    public static int max (int a, int b, int d)
    {
	if (a >= b && a > d)
	{
	    return a;
	}
	else if (b >= a && b > d)
	{
	    return b;
	}
	else
	{
	    return d;
	}

    }//max method

    public static int mid (int a, int b, int d)
    {

	if (a >= b && a <= d)
	{
	    return a;
	}
	else if (b >= a && b <= d)
	{
	    return b;
	}
       else
	{
	    return d;
	}

    }//mid method

    public static boolean isFinished (int a, int b, int d)
    {
	if (a == 0 && b == 0 && d == 0)
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }//isFinished method

    public static void displayValues (int a, int b, int d)
    {
	c.println ("User input : " + a + " " + b + " " + d);
	c.print ("Max value: " + max (a, b, d) + " Mid value: " + mid (a, b, d));
	c.println (" Min value: " + min (a, b, d));
    }//diaplayValue method
} // MethodAssignment2 class
