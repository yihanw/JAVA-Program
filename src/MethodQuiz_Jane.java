/*Name:Jane Wang
  Date:Feb.07.2014
  Class Name:MethodQuiz_Jane
  Display:this program will ask user for grade, focus to enter positive number,
	       continue diaplaying if user choose to continue,
	       and display the grade for the mark.*/
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
	    do //focus user to enter a positive integer
	    {
		c.println ("enter the mark");
		mark = c.readInt ();
	    }
	    while (mark < 0); //"positive integer" loop ends

	    char grade = grade (mark);
	    c.println ("your grade is " + grade); //printout the grade

	    c.println ("continue? answer 'Y' or 'N'"); //ask for continueing
	    answer = c.readChar ();
	}
	while (answer == 'Y'); //"continue loop" ends
	c.println ("end of the program");


	// Place your program here.  'c' is the output console
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
