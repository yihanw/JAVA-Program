/*name: Jane
  date: march.18.2014
  calss name: ArrayAssign2_Jane
  display: this program will ask the user a sequence of number,
	   count the frequency, mode, mean and madian, and then return
	   the result.*/
// The "ArrayAssign2_Jane" class.
import java.awt.*;
import hsa.Console;

public class ArrayAssign2_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int length; //initialize the number that going to be entered
	int[] number; //array that hold the numbers entered by user
	//ask the length and read in
	c.println ("how many number are you going to enter");
	length = c.readInt ();
	number = new int [length];
	//ask to enter the numbers and read them into the array
	for (int i = 0 ; i < length ; i++) //read in all the elements in array
	{
	    c.println ("enter your number, from 1 to 10");
	    number [i] = c.readInt ();
	    //focus the user to enter the number in the specific rage
	    while (number [i] > 10 || number [i] < 0)
	    {
		c.println ("out of rage, enter again");
		number [i] = c.readInt ();
	    }
	}
	//display all the things including frequecy chart, mean, mode and median
	display (number);
    } // main method


    public static int[] frequency (int[] number)  //method that used to find frequency
    {
	int[] count = new int [11];
	//go through the sequence
	for (int i = 0 ; i <= (number.length - 1) ; i++)
	{ //add the count if the specific number appears
	    if (number [i] == 0)
	    {
		count [0] = count [0] + 1;
	    }
	    if (number [i] == 1)
	    {
		count [1] = count [1] + 1;
	    }
	    if (number [i] == 2)
	    {
		count [2] = count [2] + 1;
	    }
	    if (number [i] == 3)
	    {
		count [3] = count [3] + 1;
	    }
	    if (number [i] == 4)
	    {
		count [4] = count [4] + 1;
	    }
	    if (number [i] == 5)
	    {
		count [5] = count [5] + 1;
	    }
	    if (number [i] == 6)
	    {
		count [6] = count [6] + 1;
	    }
	    if (number [i] == 7)
	    {
		count [7] = count [7] + 1;
	    }
	    if (number [i] == 8)
	    {
		count [8] = count [8] + 1;
	    }
	    if (number [i] == 9)
	    {
		count [9] = count [9] + 1;
	    }
	    if (number [i] == 10)
	    {
		count [10] = count [10] + 1;
	    }
	}
	return count; //return the array
    }


    public static void display (int[] number)
    { //display the title of frequency chart
	c.println ("sample input    sample output");
	c.println ("                marks   frequency");
	//display the top part of frequency chart
	for (int i = 0 ; i < number.length ; i++)
	{
	    c.println ((number [i]) + "               " + i + "        " + frequency (number)[i]);
	}
	//display the rest part of frequency chart
	for (int i = number.length ; i >= number.length && i <= 10 ; i++)
	{
	    c.println ("                " + i + "        " + frequency (number)[i]);
	}
	//display the mean, mode and madian number
	c.println ("the mean is " + mean (number));
	c.println ("the mode is " + mode (number));
	c.println ("the madian is " + madian (number));
    }


    public static double mean (int[] number)
    {
	int sum = 0; //initialize the totle
	double mean = 0; //initialize the mean value
	//go through the array entered by user
	for (int i = 0 ; i < number.length ; i++)
	{
	    sum = sum + number [i]; //add the numbers up
	}
	//find the mean using the math formula: average=totle/number
	mean = sum / number.length;
	mean = Math.round (mean); //round the mean value
	return mean; //return the mean value to the method
    }


    public static int mode (int[] number)
    {
	int mode = 0; //initialize the mode
	int[] count = new int [11];
	//go through the sequence
	for (int i = 0 ; i <= (number.length - 1) ; i++)
	{ //add the count if the specific number appears
	    if (number [i] == 0)
	    {
		count [0] = count [0] + 1;
	    }
	    if (number [i] == 1)
	    {
		count [1] = count [1] + 1;
	    }
	    if (number [i] == 2)
	    {
		count [2] = count [2] + 1;
	    }
	    if (number [i] == 3)
	    {
		count [3] = count [3] + 1;
	    }
	    if (number [i] == 4)
	    {
		count [4] = count [4] + 1;
	    }
	    if (number [i] == 5)
	    {
		count [5] = count [5] + 1;
	    }
	    if (number [i] == 6)
	    {
		count [6] = count [6] + 1;
	    }
	    if (number [i] == 7)
	    {
		count [7] = count [7] + 1;
	    }
	    if (number [i] == 8)
	    {
		count [8] = count [8] + 1;
	    }
	    if (number [i] == 9)
	    {
		count [9] = count [9] + 1;
	    }
	    if (number [i] == 10)
	    {
		count [10] = count [10] + 1;
	    }
	}

	for (int j = 0 ; j <= 9 ; j++)//go through the array named count
	{
	    if (count [j] >= mode)//find the largest count
	    {
		mode = number [j];
	    }
	}

	return mode;
    }


    public static int madian (int[] number)
    {
	int madian = 0; //initialize the madian
	//odd number of the sequence, find the middle value
	if (number.length % 2 != 0)
	{
	    int i = (number.length - 1) / 2; //find the middle value
	    madian = number [i];
	}
	//even number of the sequence, find the average of the middle two
	if (number.length % 2 == 0)
	{
	    int i = number.length / 2;
	    madian = (number [i] + number [(i + 1)]) / 2; //the average of the two middle value
	}

	return madian; //return the value to the method
    }
} // ArrayAssign2_Jane class


