/*Jane Wang
  spt.27
  A1Q1_Jane 
  the program will calculate the area and the circumference of a circle*/
//The "Assignment1" class.
import java.awt.*;
import hsa.Console;

public class A1Q1_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	double A;
	double C;
	final double PI = 3.1415;
	double R;
	c.println ("please enter the radius");
	R = c.readDouble ();
	A = PI * Math.pow (R, 2);
	c.print("the area is ");
	c.println(A);
	C = 2*PI*R;
	c.print("the circumference is ");
	c.print(C);

	// Place your program here.  'c' is the output console
    } // main method
} // Assignment class
