// The "ObjectQuiz_Jane" class.
import java.awt.*;
import hsa.Console;

public class ObjectQuiz_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int x1, x2, y1, y2;
	double r1, r2;
	c.println ("please enter the x,y and the radius for circle 1");
	x1 = c.readInt ();
	y1 = c.readInt ();
	r1 = c.readDouble ();
	c.println ("please enter the x,y and the radius for circle 2");
	x2 = c.readInt ();
	y2 = c.readInt ();
	r2 = c.readDouble ();
	Circle c1 = new Circle (x1, x2, r1);
	Circle c2 = new Circle (x2, y2, r2);
	c.println ("the area of circle 1 is " + c1.area ());
	c.println ("the smaller of c1 and c2 is "  + Circle.smaller (c1, c2));
	c.println ("r2 is entirely contained in r1: " + c1.isInside (c2));
    } // main method
} // ObjectQuiz_Jane class
class Circle
{
    private int x;
    private int y;
    private double radius;

    public Circle (int a, int b, double r)
    {
	this.x = a;
	this.y = b;
	this.radius = r;
    }


    public int getX ()
    {
	return this.x;
    }


    public int getY ()
    {
	return this.y;
    }


    public double getRadius ()
    {
	return this.radius;
    }


    public String toString ()
    {
	return "(" + x + "," + y + "), radius: " + radius;

    }


    public static Circle smaller (Circle c1, Circle c2)
    {
	int a, b;
	double r;

	if (c1.radius <= c2.radius)
	{
	    a = c1.x;
	    b = c1.y;
	    r = c1.radius;
	}
	else
	{
	    a = c2.x;
	    b = c2.y;
	    r = c2.radius;
	}
	Circle c3 = new Circle (a, b, r);
	return c3;
    }

    public boolean isInside (Circle c2)
    {
	int xDistance, yDistance;
	double distance;
	xDistance = Math.abs (this.x - c2.x);
	yDistance = Math.abs (this.y - c2.y);
	distance = Math.sqrt (xDistance * xDistance + yDistance * yDistance);
	if ((distance + this.radius) < c2.radius)
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }

    public double area ()
    {
	double area;
	final double pi = 3.14;
	area = this.radius * this.radius * pi;
	return area;
    }
}
