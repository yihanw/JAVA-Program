/*Jane Wang
 *Mar.12.2015
 *ICS4U1
 *This program will ask user to input a sentence, and then output all the letters in uppercase and in descending order,
  finally ask the user to input a letter to be searched, and output the number of occurences of that particular letter.
 */
// The "Sentence_Jane" class.
import java.awt.*;
import hsa.Console;
import java.util.StringTokenizer;
public class Sentence_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	// Place your program here.  'c' is the output console
	String sentence;
	char search;
	int time = 0;
	c.print ("Input -> "); //ask for input
	sentence = c.readLine ();
	sentence = sentence.toUpperCase (); //convert to uppercase
	sentence = sentence.replaceAll (" ", ""); //delete any spaces
	c.println ("All letters in uppercase -> " + sentence);

	char[] letter = sentence.toCharArray (); //assign the string to a char array
	for (int top = 0 ; top < letter.length ; top++)
	{
	    char item = letter [top]; // temporary storage of item
	    int i = top;
	    while (i > 0 && item > letter [i - 1])
	    {
		// shift larger items to the right by one
		letter [i] = letter [i - 1];
		// prepare to check the next item to the left
		i--;
	    }
	    letter [i] = item; // put sorted item in open location
	}
	c.print ("Letter in descending order -> ");
	for (int i = 0 ; i < letter.length ; i++)
	{
	    c.print (letter [i]); //output in descending order
	}
	c.println ();

	c.print ("Letter to be searched -> ");
	search = c.readChar ();
	search = Character.toUpperCase (search);//convert to uppercase
	for (int i = 0 ; i < letter.length ; i++)
	{
	    if (letter [i] == search)
	    {
		time++;//calculate the time
	    }
	}
	if (time == 0)//if the letter is not found
	{
	    c.println ("the letter is not found");
	}
	else//display the number of occurences
	{
	    c.println (search + " occurs " + time + " times.");
	}






    } // main method
} // Sentence_Jane class
