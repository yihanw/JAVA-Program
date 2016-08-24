/*Jane Wang
 *Jan,25,2015
 *Triangle_Jane
 *This program will ask the user to input three values of sides for each triangle, and then determine the triangle's type.
 */
// The "Triangle_Jane" class.
import java.awt.*;
import hsa.Console;

public class Triangle_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	// Place your program here.  'c' is the output console

	int[] [] side = new int [100] [3]; //creat an integar array to store the sides
	String message;//the message being displayed to determine the triangle's type
       
	c.println("Provide three side lengths - 0  0  0 to terminate");
	 for (int row = 0 ; row < side.length ; row++) //read in rows
	{
	    for (int col = 0 ; col < side [row].length ; col++) //read in columns
	    {
		side [row] [col] = c.readInt ();//

	    }
	    if (side [row] [0] == 0 && side [row] [1] == 0 && side [row] [2] == 0) //stop reading in sides when 0 0 0 is entered
	    {
		c.println ("Program terminated by user.");//displat the message for terminating values

		return; //stop reading in the values
	    }


	    //determine whether the triangle can be formed
	    if (side [row] [0] <= 0 || side [row] [1] <= 0 || side [row] [2] <= 0 || side [row] [0] + side [row] [1] < side [row] [2] || side [row] [0] + side [row] [2] < side [row] [2] || side [row] [1] + side [row] [2] < side [row] [0])
	    {
		message = "Triangle can't be formed";
	    }
	    else
	    {
		//determine whether the triangle is equilateral
		if (side [row] [0] == side [row] [1] && side [row] [0] == side [row] [2] && side [row] [2] == side [row] [1])
		{
		    message = "Triangle possible: equilateral";
		}
		else
		{   //determine whether the triangle is isosceles
		    if (side [row] [0] == side [row] [1] || side [row] [0] == side [row] [2] || side [row] [2] == side [row] [1])
		    {
			message = "Triangle possible: isosceles";
		    }
		    else
		    {   
			message = "Triangle possible: scalene";
		    }
		}

	    }
	    //assign the squared values of triangle's three sides
	    int a = (int) Math.pow (side [row] [0], 2);
	    int b = (int) Math.pow (side [row] [1], 2);
	    int d = (int) Math.pow (side [row] [2], 2);
	    //determine whether the triangle is right
	    if (a + b == d || a + d == b || d + b == a)
	    {
		message = message + " and right";
	    }
	    else
	    {   
		//determine whether the triangle is acute
		if (a + b > d || a + d > b || d + b > a)
		{
		    message = message + " and acute";
		}
		else
		{
		    //determine whether the triangle is obtuse
		    if (a + b < d || a + d < b || d + b < a)
		    {
			message = message + " and obtuse";
		    }
		}
	    }

	    c.println (message);//display the message corresponding to the input


	}










    }
} // Triangle_Jane class


