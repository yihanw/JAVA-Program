/*Jane Wang
 *Dec.27.2014
 *Recursion_Jane
 *This program will ask user to enter a base number and an index number,
 *then calculate and display the value of it.
 */
// The "Recursion_Jane" class.
import java.awt.*;
import hsa.Console;

public class Recursion_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	// Place your program here.  'c' is the output console
	double x; //the base number
	int n; //the index
	c.println ("please enter the base number");
	x = c.readDouble (); //read in base number
	c.println ("please enter the index number");
	n = c.readInt (); //read in index number
	while (n < 0)
	{
	    c.println ("index number shoule be positive");
	    n = c.readInt ();
	}
	c.println(calculateTerm(x,n));
    } // main method


    public static double calculateTerm (double x, int n)
    {
  
	if (n == 0)
	{
	    if (x != 0)
	    {
		return 1;//return 1 if the exponent is 0
	    }
	    else
	    {
		return Double.NaN;//retrun NaN if both the exponent and the base are 0
	    }
	}
	if (n == 1) //assign the terminating value
	{
	    return x;
	}
	else
	{
	    if (n % 2 == 0) //if the index is even
	    {
		return Math.pow ((calculateTerm (x, n / 2)), 2);
	    }
	    else //if the index is odd
	    {
		return calculateTerm (x, n - 1) * x;
	    }
	}
    }
} // Recursion_Jane class


