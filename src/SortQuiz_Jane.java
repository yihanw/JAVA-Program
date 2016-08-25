// The "SortQuiz_Jane" class.
import java.awt.*;
import hsa.Console;

public class SortQuiz_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	// Place your program here.  'c' is the output console
	int list[] = new int [50];
	int frequency[] = new int [9];
	int length = 0;
	c.println("Enter a integer, 0 to stop")
	for (int i = 0 ; i < 50 ; i++)
	{
	    list [i] = c.readInt ();
	    if (list [i] == 0)
	    {
		break;
	    }
	    else
	    {
		length++;
	    }
	}
	for (int i = 0 ; i < length ; i++)
	{
	    switch (list [i])
	    {
		case 1:
		    frequency [0]++;
		    break;
		case 2:
		    frequency [1]++;
		    break;
		case 3:
		    frequency [2]++;
		    break;
		case 4:
		    frequency [3]++;
		    break;
		case 5:
		    frequency [4]++;
		    break;
		case 6:
		    frequency [5]++;
		    break;
		case 7:
		    frequency [6]++;
		    break;
		case 8:
		    frequency [7]++;
		    break;
		case 9:
		    frequency [8]++;
		    break;
	    }
	}

	for (int top = 1 ; top < length ; top++)
	{
	    int item = list [top];
	    int i = top;
	    while (i > 0 && item < list [i - 1])
	    {
		list [i] = list [i - 1];
		i--;
	    }
	    list [i] = item;
	}
	c.println();
	c.println ("Value " + "Frequency");
	for (int i = 0 ; i < 9 ; i++)
	{
	    if (frequency [i] != 0)
	    {
		c.print ((i + 1) + "    " + frequency [i]);
		c.println ();
	    }
	    else
	    {
	    }

	}


    } // main method
} // SortQuiz_Jane class
