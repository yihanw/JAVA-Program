/*Jane Wang
  Nov.14.2013
  Aloop2_Jane
  This program asks users to input numbers, and dispalys the aveage, total,largest and smallest of the numbers*/
// The "Aloop2_Jane" class.
import java.awt.*;
import hsa.Console;

public class Aloop2_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int total = 0, count = 0, number;
	int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
	char choice;
	double average = 0;
	do
	{
	    c.println ("please enter an integer");
	    number = c.readInt ();
	    total = total + number;
	    count++;

	    if (number > largest)
	    {
		largest = number;
	    }
	    if (number < smallest)
	    {
		smallest = number;
	    }

	    c.println ("is there are any more numbers, Y or N");
	    choice = c.readChar ();
	}
	while (choice == 'Y');

	average = total / count;
	c.println ("average= " + average);
	c.println ("total= " + total);
	c.println ("smallest number= " + smallest);
	c.println ("largest number= " + largest);
    } // main method
} // Aloop2_Jane class


