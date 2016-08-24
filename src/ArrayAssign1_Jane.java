/*name: Jane Wang
  Date: Feb.27.2014
  class name: "ArrayAssign1_Jane" class
  display: the program will ask user to enter a series of array,
	   find out and display the larest one.
*/
// The "ArrayAssign_Jane" class.
import java.awt.*;
import hsa.Console;

public class ArrayAssign1_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int length;
	double number[];
	c.println ("how many number are you going to enter");
	length = c.readInt (); //ask and read in the length of the array
	number = new double [length];
	for (int i = 0 ; i < length ; i++) //read in all the element in array
	{
	    c.println ("enter your number");
	    number [i] = c.readInt ();
	}
	output (number); //display the output

	// Place your program here.  'c' is the output console
    } // main method


    public static double largestNum (double[] number)
    {
	double largest = 0;
	for (int i = 0 ; i < number.length ; i++)
	{
	    if (number [i] > largest) //find out the largest number in the array
	    {
		largest = number [i];
	    }
	}
	return largest; //return the value to largestNum
    }


    public static void output (double[] number)  //display the largest number
    {
	c.println ("the largest number in the array is " + largestNum (number));
    }
} // ArrayAssign_Jane class
