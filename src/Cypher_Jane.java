// The "Cypher_Jane" class.
import java.awt.*;
import hsa.Console;

public class Cypher_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	// Place your program here.  'c' is the output console
	char[] plain = new char [26]; //the original alphabet
	char[] cipher = new char [26]; //the encrypted alphabet

	int i = 0;
	int shiftNum;
	char rotation;
	String plainText;
	for (char letter = 'A' ; letter <= 'Z' ; letter++)
	{
	    plain [i] = letter; //assign the original alphabet
	    i++;
	}
       
	c.println ("please enter which way you would like to rotate, 'l' for left and 'r' for right");
	rotation = c.readChar ();
	c.println ("please enter the shift value, between 1 and 25");
	shiftNum = c.readInt ();
	if (rotation == 'l') //for left rotation
	{
	    for (int j = 0 ; j < 26 ; j++)
	    {
		if ((j + shiftNum) < 26)
		{
		    cipher [j] = plain [j + shiftNum]; //assign the first part of the encrypted alphabet
		}
		else
		{
		    cipher [j] = plain [j + shiftNum - 26]; //assign the second part of the encrypted alphabet
		}
	    }
	}

	if (rotation == 'r') //for right rotation
	{
	    for (int j = 0 ; j < 26 ; j++)
	    {
		if (j < shiftNum)
		{
		    cipher [j] = plain [26 - shiftNum + j]; //assign the first part of the encrypted alphabet

		}
		else
		{
		    cipher [j] = plain [j - shiftNum]; //assign the second part of the encrypted alphabet

		}
	    }
	}
	c.println ("please enter your plain text");
	plainText = c.readLine ();
	plainText = plainText.toUpperCase ();
	char text[] = plainText.toCharArray (); //the text entered by user

	for (int j = 0 ; j < 26 ; j++)
	{
	    if (text [j] == plain [k])
	    {
		text [j] = cipher [k];
	    }

	}





    } // main method
} // Cypher_Jane class


