/*Jane Wang
 *Oct 27.2014
 *Projecta-Jane
 *This program asks the user for lengths of two rectangle, calculates and displays the information about rectangle 1, rectanalge 2
 and their intersected section, the program also determines whether or not rectangle 1 is contained in rectangle 2
*/
// The "Project1_Jane" class.
import java.awt.*;
import hsa.Console;

public class Project1_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int left1, bottom1, width1, height1; //the values of rectangle 1
	int left2, bottom2, width2, height2; //the values of rectangle 2
	int totalPerimeter = 0;
	//ask user for the lengths of the first rectangle
	c.println ("please enter the x-coordinator of the left edge of the rectangle1");
	left1 = c.readInt ();
	c.println ("please enter the y-coordinator of the left edge of the rectangle1");
	bottom1 = c.readInt ();
	c.println ("please enter the value of width of the rectangle1");
	width1 = c.readInt ();
	c.println ("please enter the value of the height of the reactangle1");
	height1 = c.readInt ();
	Rectangle r1 = new Rectangle (left1, bottom1, width1, height1);
	//ask user for the lengths of the second rectangle
	c.println ("please enter the x-coordinator of the left edge of the reactangle2");
	left2 = c.readInt ();
	c.println ("please enter the y-coordiantor of the left edge of reactangle2");
	bottom2 = c.readInt ();
	c.println ("please enter the width of rectangle2");
	width2 = c.readInt ();
	c.println ("please enter the height of rectangle2");
	height2 = c.readInt ();
	Rectangle r2 = new Rectangle (left2, bottom2, width2, height2);
	//output informations of rectangle 1
	c.println ("For rectangle 1:");
	c.println (r1.toString ());
	c.println ("Area of rectangle 1: " + Rectangle.area (r1));
	c.println ("Perimeter of rectangle 1: " + Rectangle.perimeter (r1));
	c.println ();
	//output informations of rectangle 2
	c.println ("For rectangle 2:");
	c.println (r2.toString ());
	c.println ("Area of rectangle 2: " + Rectangle.area (r2));
	c.println ("Perimeter of rectangle 2: " + Rectangle.perimeter (r2));
	c.println ();
	//output informations of the intersection part
	Rectangle r3 = Rectangle.intersection (r1, r2);
	c.println ("For the intersection rectangle: ");
	c.println (r3.toString ());
	c.println ("Area of the intersection: " + Rectangle.area (r3));
	c.println ("Pramitar of the intersection: " + Rectangle.totalPerimeter (r1, r2));
	c.println ();
	c.println ("rectangle 1 contains rectange 2: " + r1.contain (r2));
    } // main method
} // Project1_Jane class

class Rectangle
{
    private int left;        //x-coordinate of left edge
    private int bottom;     //y-coordinate of bottom edge
    private int width;      //width of rectangle
    private int height;     //height of rectangle

    public Rectangle (int a, int b, int c, int d)  //place any negative length with zero
    {
	this.left = a; //x-coordinate of the rectangle will not change
	this.bottom = b; //y-coordinate of the rectangle will not change
	if (c < 0)
	{
	    this.width = 0; //place the negative width with zero
	}
	else
	{
	    this.width = c;
	}
	if (d < 0)
	{
	    this.height = 0; //place the nagetive height with zero
	}
	else
	{
	    this.height = d;
	}

    }

    //accessor and mutator
    public int getleft ()
    {
	return this.left;
    }

    public int getbottom ()
    {
	return this.bottom;
    }

    public int getwidth ()
    {
	return this.width;
    }

    public int getheight ()
    {
	return this.height;
    }

    //toString method
    public String toString ()
    {
	return "base: (" + this.left + ", " + this.bottom + ") W: " + this.width + " h: " + this.height;
    }

    //class method: intersection
    public static Rectangle intersection (Rectangle r1, Rectangle r2)
    {
	int x = 0, y = 0, w = 0, h = 0; //represent the four fields of intersection rectangle

	//case1: rectangle 1 at left, rectangle 2 at right, have intersection or touch
	if (r2.left <= (r1.left + r1.width))
	{
	    x = r2.left;
	    w = r1.left + r1.width - r2.left;
	    //three cases
	    if (r2.bottom <= r1.bottom && r2.bottom > r1.bottom - r1.height)
	    {
		y = r2.bottom;
		h = r2.bottom - r1.bottom + r1.height;
	    }
	    if (r2.bottom > r1.bottom && r2.bottom - r2.height < r1.bottom)
	    {
		y = r1.bottom;
		h = r1.bottom - r2.bottom + r2.height;
	    }
	    if (r2.bottom < r1.bottom && (r2.bottom - r2.width > r1.bottom - r1.height))
	    {
		y = r2.bottom;
		h = r2.height;
	    }
	}

	//case2: rectangle 1 at right, rectangle 2 at left, have intersection or touch
	if (r1.left <= (r2.left + r2.width))
	{
	    x = r1.left;
	    w = r2.left + r2.width - r1.left;
	    //three cases
	    if (r1.bottom <= r2.bottom && r1.bottom > r2.bottom - r2.height)
	    {
		y = r1.bottom;
		h = r1.bottom - r2.bottom + r2.height;
	    }
	    if (r1.bottom > r2.bottom && r1.bottom - r1.height < r2.bottom)
	    {
		y = r2.bottom;
		h = r2.bottom - r1.bottom + r1.height;
	    }
	    if (r1.bottom < r2.bottom && (r1.bottom - r1.width > r2.bottom - r2.height))
	    {
		y = r1.bottom;
		h = r1.height;
	    }
	}
	//case3: rectangle 2 is above rectangle 1, have touch
	if (r2.bottom == r1.bottom - r1.height)
	{
	    x = r2.left;
	    y = r2.bottom;
	    h = 0;
	    if (r2.left > r1.left && r2.left < r1.left + r2.width)
	    {
		w = r1.left + r1.width - r2.left;
	    }
	    if (r2.left < r1.left && r2.left + r2.width > r1.left)
	    {
		w = r2.left + r2.width - r1.left;
	    }
	    if (r2.left > r1.left && r2.left + r2.width < r1.left + r1.width)
	    {
		w = r2.width;
	    }
	}
	//case4: rectangle 1 is above rectangle 2, have touch
	if (r1.bottom == r2.bottom - r2.height)
	{
	    x = r1.left;
	    y = r1.bottom;
	    h = 0;
	    if (r1.left > r2.left && r1.left < r2.left + r1.width)
	    {
		w = r2.left + r2.width - r1.left;
	    }
	    if (r1.left < r2.left && r1.left + r1.width > r2.left)
	    {
		w = r1.left + r1.width - r2.left;
	    }
	    if (r1.left > r2.left && r1.left + r1.width < r2.left + r2.width)
	    {
		w = r1.width;
	    }
	}

	//case 5: one is contained in another
	if (r2.left > r1.left && r2.left + r2.width < r1.left + r1.width && r2.bottom - r2.height > r1.bottom - r1.height && r2.bottom < r1.bottom)
	{
	    x = r2.left;
	    y = r2.bottom;
	    w = r2.width;
	    h = r2.height; //return the inner area
	}
	if (r1.left > r2.left && r1.left + r1.width < r2.left + r2.width && r1.bottom - r1.height > r2.bottom - r2.height && r1.bottom < r2.bottom)
	{
	    x = r1.left;
	    y = r1.bottom;
	    w = r1.width;
	    h = r1.height;
	}

	Rectangle r3 = new Rectangle (x, y, w, h);

	return r3;
    }

    public static int totalPerimeter (Rectangle r1, Rectangle r2)
    {
	Rectangle r3;
	r3 = intersection (r1, r2);
	return (r3.width + r3.height) * 2; //return the total perimeter of the intersection part
    }

    public static int area (Rectangle r1)
    {
	int area;
	area = r1.width * r1.height;
	return area; //return the area of a rectangle
    }

    public static int perimeter (Rectangle r1)
    {
	int perimeter;
	perimeter = (r1.width + r1.height) * 2;
	return perimeter; //return the perimeter of a rectangle
    }

    public boolean contain (Rectangle r1)  //contain method
    {
	if (this.left <= r1.left && this.bottom <= r1.bottom && this.left + this.width >= r1.left + r1.width && this.bottom + this.height >= r1.bottom + r1.height)
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }
}
