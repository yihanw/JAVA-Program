/*Jane Wang
  Feb.05.2014
  Sqrt_Jane
  This program will ask user for a number, and print out the squareroot of it*/
//The "Sqrt_Jane" class.
import java.awt.*;
import hsa.Console;

public class Sqrt_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.println ("enter a number");
	double number = c.readDouble ();
	if (number < 0)
	{
	    NaN (number);
	}
	else if (number == 0)
	{
	    c.println ("square root is 0");
	}
	else if
	    (number > 0)
	{
	    display (number);
	}
    }


    // Place your program here.  'c' is the output console

    public static double mySqrt (double number)
    {
	double testNumber = 0, squareRoot;
	squareRoot = number / 2;
	do
	{
	    testNumber = squareRoot;
	    squareRoot = (testNumber + (number / testNumber)) / 2;
	}
	while ((testNumber - squareRoot) != 0);
	return squareRoot;
    }


    public static void display (double number)
    {
	c.println ("square root is " + mySqrt (number));
    }

    public static void NaN (double number)
    {
	c.println ("invalid number");
    }
} // Sqrt_Jane class

