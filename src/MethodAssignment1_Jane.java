/*Jane Wang
 *Jan.17.14
 *MethodAssignment1_Jane
 *This program will continue asking user to enter a string and a positon,
  then display the character.
*/  
// The "MethodAssignment1_Jane" class.
import java.awt.*;
import hsa.Console;

public class MethodAssignment1_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	String txt;
	int n,length;
	char letter;
	
	c.println ("please enter a string");
	txt = c.readString ();
	c.println ("please enter a position,negetive to stop");
	n = c.readInt ();

	do//continue ask user to enter a position
	{
	    length = txt.length ();
	    while (n > (length - 1))//continue ask user to enter a valid position
	    {
		c.println ("out of range,enter again");
		n = c.readInt ();
	    }
	  
	    letter = getLetter (txt, n);
	    c.println (letter);
	    c.println ("please enter a position,negetive to stop");//keep asking
	    n = c.readInt ();
	} while (n >= 0);
	c.println("end of the program");//if position is negetive
    
	// Place your program here.  'c' is the output console
    } // main method

    public static char getLetter (String txt, int n)
    {
	char letter = txt.charAt(n);
	return letter;
    }
} // MethodAssignment1_Jane class
