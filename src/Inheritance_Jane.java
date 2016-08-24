/*Jane Wang
  Nov.26.2014
  Inheritance_Jane
  This program asks the user to choose a geometric object ,and then calculates and displays its perimeter and area.
*/
// The "Inheritance_Jane" class.
import java.awt.*;
import hsa.Console;

public class Inheritance_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	char choice; //user's choice on the shape
	double length, width, a, b, d, side; //sides for the geometric object

	c.println ("please enter the geometric object you are going to enter");
	c.println ("r represent rectangle, t represents triangle, s represents square");
	choice = c.readChar (); //read in the choice
	if (choice == 'r') //rectangle
	{
	    c.println ("please enter the length");
	    length = c.readDouble ();
	    width = c.readDouble (); //read in the numbers
	    Rectangle r = new Rectangle (length, width);
	    c.println ("the area of the rectangle is " + r.area ());
	    c.println ("the primeter of the rectangle is " + r.perimeter ());
	}
	if (choice == 't') //triangle
	{
	    c.println ("please enter the sides");
	    a = c.readDouble ();
	    b = c.readDouble ();
	    d = c.readDouble (); //read in the numbers
	    while ((a + b) <= d || (a + d) <= b || (d + b) <= a)
	    {
		c.println ("please enter valid values");
		a = c.readDouble ();
		b = c.readDouble ();
		d = c.readDouble ();
	    } //check if the numbers are valid
	    Triangle t = new Triangle (a, b, d);
	    c.println ("the area of the triangle is " + t.area ());
	    c.println ("the primeter of the triangle is " + t.perimeter ());
	}
	if (choice == 's') //square
	{
	    c.println ("please enter the sides");
	    side = c.readDouble (); //read in the number
	    Square s = new Square (side);
	    c.println ("the area of the square is " + s.area ());
	    c.println ("the primeter of the square is " + s.perimeter ());
	}
    } // main method
} // Inheritance_Jane class

abstract class Shape
{
    abstract public double area (); //abstrct methods
    abstract public double perimeter ();
}

class Rectangle extends Shape //rectangle class
{
    private double length;
    private double width;


    public Rectangle (double length, double width)  //constructor
    {
	this.length = length;
	this.width = width;
    }


    public double area ()  //area of rectangle
    {
	return length * width;
    }


    public double perimeter ()  //primeter of rectangle
    {
	return 2 * (length + width);
    }
}

class Triangle extends Shape //triangle class
{
    private double a;
    private double b;
    private double c;
    public Triangle (double a, double b, double c)  //constructor
    {
	this.a = a;
	this.b = b;
	this.c = c;
    }


    public double area ()  //area of triangle
    {
	double s = (a + b + c) / 2;
	return Math.round (Math.sqrt (s * (s - a) * (s - b) * (s - c))); //round up the values
    }


    public double perimeter ()  //perimeter of the triangle
    {
	return a + b + c;
    }
}
class Square extends Rectangle //square class
{


    Square (double s)  //contructor
    {
	super (s, s);
    }


    public double area ()  //area of square
    {
	return super.area ();
    }


    public double perimeter ()  //perimeter of square
    {
	return super.perimeter ();
    }
}
