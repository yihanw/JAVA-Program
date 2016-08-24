// The "Matrix_Jane" class.
import java.awt.*;
import hsa.Console;

public class Matrix_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int row, column;
	c.println ("enter the number of rows of the matrix");
	row = c.readInt ();
	c.println ("enter the number of column of the matrix");
	column = c.readInt ();
	int[] [] rect1 = new int [row] [column];

	c.println ("please enter your numbers");
	for (int i = 0 ; i < row ; i++)
	{
	    for (int j = 0 ; j < column ; j++)
	    {
		rect1 [i] [j] = c.readInt ();
	    }
	}
	c.println ();
	c.println ("the original matrix is:");
	for (int i = 0 ; i < row ; i++)
	{
	    for (int j = 0 ; j < column ; j++)
	    {
		c.print (rect1 [i] [j] + " ");
	    }
	    c.println ();
	}
	c.println ("the transpose of the matrix is:");
	for (int i = 0 ; i < column ; i++)
	{
	    for (int j = 0 ; j < row ; j++)
	    {

		c.print (rect1 [j] [i] + " ");
	    }
	    c.println ();
	}




	// Place your program here.  'c' is the output console
    } // main method
} // Matrix_Jane class
