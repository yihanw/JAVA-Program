// The "Roman_Jane" class.
/* Jane Wang
 * Feb.7.2015
 * Roman_Jane
 *This program will ask user to enter two roman numerals, then add them up and display the addition in roman numeral form.
 */
 
import java.awt.*;
import hsa.Console;

public class Roman_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	// Place your program here.  'c' is the output console
	String input1, input2, output; //the first and second roman numeral, the output roman numeral
	int addition; //the addition of the two roman numeral

	c.println ("please enter your first Roman numeral");
	input1 = c.readLine ();
	while (covertToInteger (input1) > 1000) //focus the user to enter a roman numeral smmaler than 1000
	{
	    c.println ("please enter a number smaller than 1000");
	    input1 = c.readLine ();
	}
	c.println ("please enter your second Roman numeral");
	input2 = c.readLine ();
	while (covertToInteger (input2) > 1000) //focus the user to enter a roman numeral smaller than 1000
	{
	    c.println ("please enter a number smaller than 1000");
	    input2 = c.readLine ();
	}
	addition = covertToInteger (input1) + covertToInteger (input2); //the addition of the two roman numeral
	output = convertToRoman (addition); //the output of the roman numeral addition
	c.println (output);
    } // main method


    public static int covertToInteger (String input)  //convert roman numeral to integer
    {
	int value = 0; //assign a value for the roman numeral
	char[] letter = new char [100]; //each letter of the roman numeral
	for (int i = 0 ; i < input.length () ; i++)
	{
	    letter [i] = input.charAt (i); //assign each letter
	    switch (letter [i]) //add up the value
	    {
		case 'I':
		    value += 1;
		    break;
		case 'V':
		    value += 5;
		    break;
		case 'X':
		    value += 10;
		    break;
		case 'L':
		    value += 50;
		    break;
		case 'C':
		    value += 100;
		    break;
		case 'D':
		    value += 500;
		    break;
		case 'M':
		    value += 1000;
		    break;
		default:
		    break;
	    }
	    if (i >= 1) //calculation for IV, IX, XL, XC,CD,CM
	    {
		if (letter [i - 1] == 'I' && letter [i] == 'V')
		{
		    value = value - 2;//reduce 2 for IV and IX
		}
		if (letter [i - 1] == 'I' && letter [i] == 'X')
		{
		    value -= 2;
		}
		if (letter [i - 1] == 'X' && letter [i] == 'L')
		{
		    value -= 20;//reduce 20 for XL ad XC
		}
		if (letter [i - 1] == 'X' && letter [i] == 'C')
		{
		    value -= 20;
		}
		if (letter [i - 1] == 'C' && letter [i] == 'D')
		{
		    value -= 200;//reduce 200 for CD and CM
		}
		if (letter [i - 1] == 'C' && letter [i] == 'M')
		{
		    value -= 200;
		}
	    }

	}
	return value;//return the value of roman numeral
    }


    public static String convertToRoman (int addition)//convert the integer to roman numeral
    {
	String roman = "";//assign a string representing the output
	if (addition > 1000)
	{
	    roman += "Greater tha 1000, error";//display "error" for any addition greater than 1000
	}
	else
	{
	    //add up the letter to the roman sting
	    while (addition >= 1000)
	    {
		roman += "M";
		addition -= 1000;
	    }
	    while (addition >= 900)
	    {
		roman += "CM";
		addition -= 900;
	    }
	    while (addition >= 500)
	    {
		roman += "D";
		addition -= 500;
	    }
	    while (addition >= 400)
	    {
		roman += "CD";
		addition -= 400;
	    }
	    while (addition >= 100)
	    {
		roman += "C";
		addition -= 100;
	    }
	    while (addition >= 90)
	    {
		roman += "XC";
		addition -= 90;
	    }
	    while (addition >= 50)
	    {
		roman += "L";
		addition -= 50;
	    }
	    while (addition >= 40)
	    {
		roman += "XL";
		addition -= 40;
	    }
	    while (addition >= 10)
	    {
		roman += "X";
		addition -= 10;
	    }
	    while (addition >= 9)
	    {
		roman += "IX";
		addition -= 9;
	    }
	    while (addition >= 5)
	    {
		roman += "V";
		addition -= 5;
	    }
	    while (addition >= 4)
	    {
		roman += "IV";
		addition -= 4;
	    }
	    while (addition >= 1)
	    {
		roman += "I";
		addition -= 1;
	    }
	}
	return roman;//return the roman numeral

    }
} // Roman_Jane class


