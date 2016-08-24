/*Jane Wang
  Feb 07, 2014
  MethodQuiz_Jane
  This program asks user for grades, and displays the grade for the mark.*/
// The "MethodQuiz_Jane" class.
import java.awt.*;
import hsa.Console;

public class MethodQuiz_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int mark;
	char answer;
	do //continue diaplaying if user wants to continue
	{
	    do //force user to enter a positive integer
	    {
		c.println ("enter the mark");
		mark = c.readInt ();
	    }
	    while (mark < 0); //"positive integer" loop ends

	    char grade = grade (mark);
	    c.println ("your grade is " + grade); //printout the grade

	    c.println ("continue? answer 'Y' or 'N'"); 
	    answer = c.readChar ();
	}
	while (answer == 'Y'); //"continue loop" ends
	c.println ("end of the program");
    } // main method

    public static char grade (int mark)
    {
	if (mark >= 0 && mark <= 49)
	{
	    return 'F';
	}
	else if (mark >= 50 && mark <= 59)
	{
	    return 'D';
	}
	else if (mark >= 60 && mark <= 69)
	{
	    return 'C';
	}
	else if (mark >= 70 && mark <= 79)
	{
	    return 'B';
	}
	else if (mark >= 80 && mark <= 100)
	{
	    return 'A';
	}
	else
	{
	    return 'X';
	}
    }
} // MethodQuiz_Jane class
