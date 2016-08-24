/*Jane Wang
* Dec.27.2014
* PrintPattern_Jane
* This program will ask user to enter an integer n, which indicates the length
* of the longest row, the program then will print out a parttern based on the integer.
*/
// The "PrintPattern_Jane" class.
import java.awt.*;
import hsa.Console;

public class PrintPattern_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	// Place your program here.  'c' is the output console
	int n; //the length of the longest row
	c.println ("please enter the length of the longest row");
	n = c.readInt ();
	printPattern (n); //call the method

    } // main method


    public static void printPattern (int n)
    {
	if (n > 0)
	{
	   for (int i = 0 ; i < n ; i++) //print the pattern for each line
	    {
		c.print ("*");
	    }
	    c.println (); //move on to next line
	    
	    printPattern (n - 1);
	    
	    for (int j = n ; j >=0 ; j--) //print the pattern for each line
	    {
		c.print ("*");
	    }
	    c.println ();
	  
	}
    }
} // PrintPattern_Jane class


