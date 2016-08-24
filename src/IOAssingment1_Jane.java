/*Jane Wang
  May 2, 2014
  ICS3U1-01
  This program generates 20 random numbers from 35 to 95, print them on a file named "data01", then copies the numbers to a file named "data02", 
  and then adds first name and last name for every 4 numbers, and prints them on a single line, use tokenizer to calculate the average for each student*/
// The "IOAssingment1_Jane" class.
import java.awt.*;
import java.io.*;
import java.util.*;
import hsa.Console;

public class IOAssingment1_Jane
{
    static Console c;           // The output console
    public static void main (String[] args)
    {
	c = new Console ();
	int total = 0; //total of the 20 numbers
	int totalAverage = 0; //average for the 20 numbers
	int[] number = new int [20]; //20 random numbers

	//PART A
	try
	{
	    FileWriter fw1 = new FileWriter ("data01.txt"); //create a file named data01
	    PrintWriter pw1 = new PrintWriter (fw1); //set up the print writer for data01
	    for (int i = 0 ; i < 20 ; i++)
	    {
		number [i] = (int) (Math.random () * 60 + 35); //generate 20 integers
		pw1.println (number [i]); //print the integers on the file
		c.println (number [i]);
		total = total + number [i]; //add up all the integers
	    }
	    totalAverage = total / 20; //calculate the average
	    c.println ("average for all 20 integer is " + totalAverage);
	    pw1.println ("average = " + totalAverage); //print the overall average ont the file
	    pw1.close ();
	}
	catch (IOException e)
	{
	} //end of data01

	//PART B&C
	//assign first name and last name
	String[] firstName = new String [5];
	firstName [0] = "abcd ";
	firstName [1] = "efgh ";
	firstName [2] = "ijkl ";
	firstName [3] = "mnop ";
	firstName [4] = "qrst ";
	String[] lastName = new String [5];
	lastName [0] = "ABCD";
	lastName [1] = "EFGH";
	lastName [2] = "IJKL";
	lastName [3] = "MNOP";
	lastName [4] = "QRST";

	//print first names, last names and marks on a line
	try //create a file writer for data02
	{
	    FileWriter fw2 = new FileWriter ("data02.txt"); //set up file writer for data02
	    PrintWriter pw2 = new PrintWriter (fw2); //set up print writer for data02
	    //information about first student
	    pw2.print (firstName [0] + lastName [0] + " ");
	    for (int i = 0 ; i < 4 ; i++)
	    {
		pw2.print (number [i] + " ");
	    }
	    pw2.println ();
	    //information about second student
	    pw2.print (firstName [1] + lastName [1] + " ");
	    for (int i = 4 ; i < 8 ; i++)
	    {
		pw2.print (number [i] + " ");
	    }
	    pw2.println ();
	    //information about third student
	    pw2.print (firstName [2] + lastName [2] + " ");
	    for (int i = 8 ; i < 12 ; i++)
	    {
		pw2.print (number [i] + " ");
	    }
	    pw2.println ();
	    //information about forth student
	    pw2.print (firstName [3] + lastName [3] + " ");
	    for (int i = 12 ; i < 16 ; i++)
	    {
		pw2.print (number [i] + " ");
	    }
	    pw2.println ();
	    //information about fifth student
	    pw2.print (firstName [4] + lastName [4] + " ");
	    for (int i = 16 ; i < 20 ; i++)
	    {
		pw2.print (number [i] + " ");
	    }
	    pw2.println ();
	    pw2.close (); //end of file printer for data02

	    //PART D
	    String fName = null, lName = null; //used to store the names
	    int sum = 0; //sum for each student
	    int average = 0; //average for each student
	    try //create a file reader for data02
	    {
		FileReader fr = new FileReader ("data02.txt"); //set up the file reader for data02
		BufferedReader br = new BufferedReader (fr); //set up the buffered reader for data02
		String line = null; //string that read in values in data02
		line = br.readLine (); //used to store data from data02

		while (line != null) //read the value to file reader
		{
		    int i = 0;
		    //use tokenizer to find the average for each student
		    StringTokenizer st = new StringTokenizer (line); //tokenize the string from data02
		    while (st.hasMoreTokens ())
		    {
			if (i == 0) //the first token is the first name
			{
			    fName = st.nextToken (); //store the first name
			}
			else if (i == 1) //the second token is the last name
			{
			    lName = st.nextToken (); //store the last name
			}
			else
			{
			    for (int j = 0 ; j < 4 ; j++) //for loop is used for calculate the sum for each student
			    {
				int nextNumber = Integer.parseInt (st.nextToken ()); //parse string into integer
				sum = sum + nextNumber; //calculate the sum for each student
			    }
			    average = sum / 4; //calculate the average for each student
			    c.println ("average of " + fName + " " + lName + " is " + average); //print the result on the screen
			}
			i++; //allow the loop to run again for the next student
			sum = 0; //set sum to zero in order to calculate the average for next student
		    }
		    line = br.readLine (); //read the second string from data02 and repeat the loop to calculate and diaplay the results
		}
		br.close (); //end of file reader
	    } //end of file reader for data02
	    catch (IOException e)
	    {
	    }

	} //end of file writer for data02
	catch (IOException e)
	{
	}
    } // main method
} // IOAssingment1_Jane class


