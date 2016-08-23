/*Jane Wang
  Sept.27.2013
  A1Q1_Jane 
  This program calculates the area and the circumference of a circle based on the value of radius entered by a user*/
//The "Assignment1" class.
import java.awt.*;
import hsa.Console;

public class A1Q1_Jane
{
    static Console c;           // The output console
    // Place your program here.  'c' is the output console
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
    } // main method
} // Assignment class
