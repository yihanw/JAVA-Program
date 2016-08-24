/*Jane Wang
 *Dec.17.2014
 *Fibonacci_Jane
 *This program asks the user to enter a positive integer as a term for FIbonnacci sequence, and calculates and displays the result.
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
	int n; //the term enter by user
	c.println ("Please enter a positive interger parameter");
	n = c.readInt ();
	c.println ("the value is "+calculateTerm (n)); //display the result
    } // main method


    public static int calculateTerm (int n)
    {
	if (n < 1)//invalid parameter
	{
	    c.println ("invalid value");
	    return 0;
	}
	else
	{
	    if (n == 1)
		return 1;//return the value for the first term
	    else if (n == 2)
		return 1;//return the value for the second term
	    else
	    {
		return calculateTerm (n - 2) + calculateTerm (n - 1);//return the nth term
	    }
	}    
    }
} // Fibonacci_Jane class
