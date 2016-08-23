/*Jane Wang
  Oct. 25. 2013
  A2IF_Jane
  This program will calculate the order cost, tax, and total for the pizza */ 
// The "A2IF_Jane" class.
import java.awt.*;
import hsa.Console;

public class A2IF_Jane
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	double toppingCost=0, sizeCost=0;
	final double HST=0.13;
	double orderCost, tax, total;
	
	String size;
	c.println("please enter the size, large or extraLarge");
	size=c.readString();//input the size
		
	if(size.equals("large"))
	{
	sizeCost=6.00;
	}
	else
	if (size.equals("extraLarge"))
	{
	sizeCost=10.00;
	}
	else
	{
	c.println("invalid size");
	}
	 
	int toppingNum;
	c.println("please enter the number of topping");
	toppingNum=c.readInt();//input the topping number
	
	switch(toppingNum)
	{
	case 1:
	toppingCost=1.00;
	break;
	case 2:
	toppingCost=1.75;
	break;
	case 3:
	toppingCost=2.50;
	break;
	case 4:
	toppingCost=3.25;
	break;
	default:
	c.println("invalid topping number");
	break;
	}
	
	orderCost=sizeCost+toppingCost;
	tax= Math.round (orderCost*HST);
	total=Math.round (orderCost+tax);
	
	c.print("You order a "+ size);
	c.println(" pizza with "+toppingNum + " topping(s) ");
	c.print("Your order cost $"+orderCost);
	c.println(", tax $"+tax);
	c.println("Total $"+total);
	
		  
		 
	
	
	
	
	
      
	// Place your program here.  'c' is the output console
    } // main method
} // A2IF_Jane class
