/*Jane Wang
 *Feb 04, 2015
 *Hailstone_Jane
 *This program asks user for an initial number, divides it by 2 if even, multiplies it by 3 and add 1 if odd, then displays the result.
 */
// The "Hailstone_Jane" class.
import java.awt.*;
import hsa.Console;

public class Hailstone_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int initial; //the initial number entered
	int output[] = new int [100]; //the output 
	c.println ("please enter your initial number");
	initial = c.readInt ();
	output [0] = initial; //assign the initial number to array

	for (int i = 1 ; i < 100 ; i++)
	{
	    if (initial % 2 == 0) //divide by 2 if the number is even
	    {
		initial = initial / 2;
		output [i] = initial; //assign the value to the array
	    }
	    else //multiply by 3 and add 1 if the number is odd
	    {
		initial = 3 * initial + 1;
		output [i] = initial; //assign the value to the array
	    }

	}

	for (int i = 0 ; i < 100 ; i++)
	{
	    if (output [i] == 4) //determine the termination
	    {
		c.print ("4, 2, 1....");
		break;
	    }
	    else //print the output
	    {
		c.print (output [i] + ", ");
	    }

	}
    } // main method
} // Hailstone_Jane class
