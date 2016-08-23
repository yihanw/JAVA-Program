/*Jane Wang
  Dec.3.2013
  Aloop3_Jane
  this program will ask user for number of the month and the start date,
  then provide a calender*/
//The "Aloop3_Jane" class
import java.awt.*;
import hsa.Console;

public class Aloop3_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int num, space = 0, i;
	String date;

	do
	{
	    c.println ("enter the number of days in the month");
	    num = c.readInt ();
	}
	while (num < 28 || num > 31);

	c.println ("enter the date");
	date = c.readString ();
	c.println ("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

	if (date.equals ("sunday"))
	{
	    space = 0;//number of space in the first line
	}
	if (date.equals ("monday"))
	{
	    c.print ("\t");
	    space = 1;//number of space in the first line
	}
	if (date.equals ("tuesday"))
	{
	    c.print ("\t\t");
	    space = 2;//number of space in the first line
	}
	if (date.equals ("wednesday"))
	{
	    c.print ("\t\t\t");
	    space = 3;//number of space in the first line
	}
	if (date.equals ("thursday"))
	{
	    c.print ("\t\t\t\t");
	    space = 4;//number of space in the first line
	}
	if (date.equals ("friday"))
	{
	    c.print ("\t\t\t\t\t");
	    space = 5;//number of space in the first line
	}
	if (date.equals ("saturday"))
	{
	    c.print ("\t\t\t\t\t\t");
	    space = 6;//number of space in the first line
	}

	for (i = 1 ; i <= num ; i++)
	{
	    c.print (i + "\t");
	    space++;
	    if (space == 7)
	    {
		c.println ();
		space = 0;
	    }
	}







	// Place your program here.  'c' is the output console
    } // main method
} // Aloop3_Jane class
