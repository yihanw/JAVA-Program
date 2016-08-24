/*Jane Wang
 *Oct 30.2014
 *Project2_Jane
 *This program asks the user for two fractions, and compares them, and displays the results
 */
// The "Project2_Jane" class.
import java.awt.*;
import hsa.Console;

public class Project2_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int num1, den1; //the numerator and the denominator for the first fraction
	int num2, den2; //the numerator and the denominator for the second fraction
	c.println ("This program will ask for the fractions and display some information about them.");
	c.println ("please enter the numerator of fraction1");
	num1 = c.readInt ();
	c.println ("please enter the denominator of fracion1");
	den1 = c.readInt ();
	c.println ("please enter the numerator of fraction2");
	num2 = c.readInt ();
	c.println ("please enter the denominator of fraction2");
	den2 = c.readInt ();

	Fraction f1 = new Fraction (num1, den1); //initialize the values for fraction1
	Fraction f2 = new Fraction (num2, den2); //initialize the values for fradcton2
	c.println ("the first fraction is " + f1.toString ()); //display information of the fractions
	c.println ("the second fraction is " + f2.toString ());
	c.println ("the size of the first fraction is " + f1.size ()); //display the size
	c.println ("the size of the second fraction is " + f2.size ());
	Fraction f3 = f1.larger (f2); //assign the larger value to f3
	c.println ("Fraction: " + f3.toString () + " is larger"); //display the larger fraction
	c.println ("the product of fraction " + f1.toString () + " and " + f2.toString () + " : " + Fraction.reduce (Fraction.product (f1, f2))); //display the product
	c.println ("the sum of fractions " + f1.toString () + " and " + f2.toString () + " : " + Fraction.reduce (Fraction.sum (f1, f2))); //display the sum
	c.println ("two fractions are equal: " + Fraction.equals (f1, f2)); //determine whether or not the fractions are equal
    } // main method
} // Project2_Jane class


class Fraction
{
    int num;
    int den;

    public Fraction (int a, int b)  //place the negative numbers if both the num and den are nagetive
    {
	if (a < 0 && b < 0)
	{
	    this.num = -a; //convert the negative number to positive
	    this.den = -b;
	}
	else
	{
	    this.num = a;
	    this.den = b;
	}
    }

    public String toString ()  //toString method
    {
	return (this.num + "/" + this.den);
    }

    public Fraction fetFraction (Fraction f)  //getFraction method, returning the object
    {
	return f;
    }

    public double size ()  //size method, calculate the size of a fraction
    {
	double size1, size2;
	
	size1 = Math.abs ((double) this.num / this.den);
	size2 = (double) Math.round (size1 * 100) / 100;
	return size2;
    }

    public Fraction larger (Fraction f2)  //larger method, used to compare two fractions and return the larger one
    {
	if (this.size () >= f2.size ())
	{
	    return this; //return the larger fraciton
	}
	else
	{
	    return f2;
	}
    }

    public static Fraction product (Fraction f1, Fraction f2)
    {
	int product1, product2; //numerator and denominator of the product
	product1 = f1.num * f2.num; //the numerator of the product
	product2 = f1.den * f2.den; //the denominator of the product
	Fraction product = new Fraction (product1, product2); //assign the values
	return product;
    }

    public static Fraction sum (Fraction f1, Fraction f2)
    {
	int sum1, sum2; //numerator and denominator of the sum
	sum1 = f1.num * f2.den + f1.den * f2.num; //the numerator of the sum
	sum2 = f1.den * f2.den; // the denominator of the sum
	Fraction sum = new Fraction (sum1, sum2); //assign the values
	return sum;
    }

    public static Fraction reduce (Fraction f)
    {
	int reduce1, reduce2; //numerator and denominator of the reduce formed fraction
	for (int i = 1 ; i < 100 ; i++) //find any common factor of the fractions
	{
	    reduce1 = f.num % i; //find the reminder when numerator is divided by an integer
	    reduce2 = f.den % i; //find the reminder when denominator is divided by an integer
	    if (reduce1 == 0 && reduce2 == 0) //if the reminders equal to zero, this means the integer is a factor
	    {
		f.num = f.num / i; //assign the values
		f.den = f.den / i;
	    }
	    else
	    {
	    }
	}
	return f; //return the reduced fraction
    }

    public static boolean equals (Fraction f1, Fraction f2)
    {
	int num1, num2, den1, den2; //the reduced fields of fraction 1 and fraction 2
	num1 = (Fraction.reduce (f1)).num;
	den1 = (Fraction.reduce (f1)).den;
	num2 = (Fraction.reduce (f2)).num;
	den2 = (Fraction.reduce (f2)).den;
	if (num1 == num2 && den1 == den2) // if both the numerators and the denominators equal to each other, the fractions are equal
	{
	    return true; //returnt the result
	}
	else
	{
	    return false;
	}
    }
}
