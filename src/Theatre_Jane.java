/*Jane Wang
 *April.21.2015
 *ICS4U1
 *This program will ask user to input the seats they want to take in a theatre, then enter the seats they want to search for,
  then the program will calculate the best row avaliable and display it for the user.
*/
// The "Theatre_Jane" class.
import java.awt.*;
import hsa.Console;

public class Theatre_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	// Place your program here.  'c' is the output console
	boolean[] [] seatsSold = new boolean [25] [36];
	int row, column, noOfTickets;
	char answer;
	do //ask the user to put in the seats being taken
	{
	    c.println ("please enter the seats you want to take");
	    c.println ("row:");
	    row = c.readInt ();
	    c.println ("column:");
	    column = c.readInt ();
	    seatsSold [row] [column] = true; //assign the boolean to true
	    c.println ("another ticket? answer with 'y' or 'n'");
	    answer = c.readChar ();
	    if (answer != 'y' && answer != 'n') //force the user to enter with 'y' or 'n'
	    {
		c.println ("please enter with 'y' or 'n'");
		answer = c.readChar ();
	    }
	}
	while (answer == 'y');
	c.println ("please enter the number of tickets you want to search");
	noOfTickets = c.readInt ();
	for (int i = 1 ; i < 25 ; i++) //output the seats
	{
	    for (int j = 1 ; j < 36 ; j++)
	    {
		if (seatsSold [i] [j] == false)
		{
		    c.print ("F");
		}
		else
		{
		    c.print ("T");
		}
	    }
	    c.println ();
	}


	c.println ("the best row avaible is " + bestRowAvailable (seatsSold, noOfTickets));
    } // main method


    static void clearSeats (boolean[] [] seatsSold)
    {
	for (int i = 0 ; i < 25 ; i++)
	{
	    for (int j = 0 ; j < 37 ; j++)
	    {
		seatsSold [i] [j] = false; //reset all the seats to false
	    }
	}
    }


    static int bestRowAvailable (boolean[] [] seatsSold, int noOfTickets)
    {
	int time = 0, bestRow = 0;
	for (int i = 1 ; i < 25 ; i++) //row
	{
	    for (int j = 1 ; j < 36 ; j++) //column
	    {
		if (seatsSold [i] [j] == false)
		{
		    time++;
		    if (time == noOfTickets)
		    {
			bestRow = i;
			break; //break out the column array
		    }
		}
		else
		{
		    time = 0; //reset the count
		}

	    }
	    if (time == noOfTickets)
	    {
		bestRow = i;
		break; //break out the row array
	    }

	}
	if (bestRow == 0)
	{
	    bestRow = -1;
	}
	return bestRow; //return the best row avalaible
    }



} // Theatre_Jane class


