/*Jane Wang
 *Dec.17.2014
 *Fibonacci_Jane
 *This program will ask the user to enter a positive integer,
 *and then use the Fibonnacci sequence to calculate the value of that partically term.
*/
// The "Fibonacci_Jane" class.
import java.awt.*;
import hsa.Console;

public class Fibonacci_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int n;//the term 
	c.println ("Please enter a positive interger parameter");
	n = c.readInt ();//read in the n term
	c.println ("the value is "+calculateTerm (n));//recall the calue from the method

	// Place your program here.  'c' is the output console
    } // main method


    public static int calculateTerm (int n)
    {
	if (n < 1)//invalid parameter
	{
	    c.println ("invalid value");
	    return 0;
	}

	else
	    if (n == 1)
		return 1;//return the value for the first term
	    else if (n == 2)
		return 1;//return the value for the second term
	    else
	    {
		return calculateTerm (n - 2) + calculateTerm (n - 1);//return the nth term
	    }
    }
} // Fibonacci_Jane class


