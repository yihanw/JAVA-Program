/*name:Jane
  date:mar.17.2014
  class name:ArrayAssign3_Jane
  display:this program will ask user ten questions, compare their answers
	  to the correct answers, and give the users some feed back,
	  then display the points the user get and some comments.*/
// The "ArrayAssign3_Jane" class.
import java.awt.*;
import hsa.Console;

public class ArrayAssign3_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	String[] myQuestions = new String [10]; //initialize my questions
	String[] [] rightAnswers = new String [10] [7]; //initialize the right answers to the questions
	String[] userAnswers = new String [10]; //initialize user's answers
	//assign my questions to the string array
	myQuestions [0] = "1. What's the full name of our school?(7)";
	myQuestions [1] = "2. What's our principal's last name?(10)";
	myQuestions [2] = "3. Which school board does our school belongs to?(4)";
	myQuestions [3] = "4. What's the course code for calculus?(6)";
	myQuestions [4] = "5. Which language do students learn in ICS class?(2)";
	myQuestions [5] = "6. What is the unit of force in physics?(1)";
	myQuestions [6] = "7. What is acceleration?(9)";
	myQuestions [7] = "8. What is the atomic mass for hydrogen?(3)";
	myQuestions [8] = "9. What is the unit of mole in chemistry?(5)";
	myQuestions [9] = "10.Which university has the only math faculty in Canada?(8)";
	//assign correst answers to the string array
	rightAnswers [0] [0] = "Sir John A Macdonald Collegiate Institute";
	rightAnswers [0] [1] = "Sir John A Macdonald";
	rightAnswers [0] [2] = "sir john a macdonald";
	rightAnswers [0] [3] = "Sir John A Macdonald CI";
	rightAnswers [0] [4] = "sir john a macdonald ci";
	rightAnswers [0] [5] = "sir john a Macdonald collegiate institute";
	rightAnswers [0] [6] = "SIR JOHN A MACDONALD COLLEGIATE INSTITUTE";
	rightAnswers [1] [0] = "Tarasuk";
	rightAnswers [1] [1] = "tarasuk";
	rightAnswers [2] [0] = "TDSB";
	rightAnswers [2] [1] = "tdsb";
	rightAnswers [2] [2] = "Toronto District School Board";
	rightAnswers [2] [3] = "toronto district school board";
	rightAnswers [3] [0] = "MCV4U";
	rightAnswers [3] [1] = "mcv4u";
	rightAnswers [3] [2] = "MCV";
	rightAnswers [3] [3] = "mcv";
	rightAnswers [4] [0] = "java";
	rightAnswers [4] [1] = "Java";
	rightAnswers [4] [2] = "JAVA";
	rightAnswers [5] [0] = "newton";
	rightAnswers [5] [1] = "Newton";
	rightAnswers [5] [2] = "N";
	rightAnswers [5] [3] = "n";
	rightAnswers [6] [0] = "the rate of change in velocity";
	rightAnswers [6] [1] = "rate of change in velocity";
	rightAnswers [6] [2] = "RATE OF CHANGE IN VELOCITY";
	rightAnswers [7] [0] = "1.01";
	rightAnswers [8] [0] = "mol";
	rightAnswers [8] [1] = "MOL";
	rightAnswers [8] [2] = "mole";
	rightAnswers [8] [3] = "Mole";
	rightAnswers [8] [4] = "MOLE";
	rightAnswers [9] [0] = "university of waterloo";
	rightAnswers [9] [1] = "University Of Waterloo";
	rightAnswers [9] [2] = "UNIVERSITY OF WATERLOO";
	rightAnswers [9] [3] = "waterloo";
	rightAnswers [9] [4] = "WATERLOO";
	rightAnswers [9] [5] = "Waterloo";
	rightAnswers [9] [6] = "Waterloo University";

	//read in user's answers
	for (int i = 0 ; i < 10 ; i++)
	{
	    /*give the user a choice to continue to the next one,
	      or she/he can pick a option*/
	    c.print ("next question or chose an option? ");
	    c.println ("answer with 1 or 2");
	    int choice = c.readInt ();
	    //focus user to enter an integer between 1 and 2
	    while (choice != 1 && choice != 2)
	    {
		c.println ("enter again,answer with 1 or 2");
		choice = c.readInt ();
	    }

	    //if the user choose to continue with the next question in order
	    if (choice == 1)
	    {
		c.println (myQuestions [i]);
		userAnswers [i] = c.readLine ();
	    }

	    //if the user choose to pick an option
	    if (choice != 1)
	    { //ask user what kind of potion would she/he like
		c.print ("random question, specific question or quit? ");
		c.println ("answer with 1,2 or 3");
		int option = c.readInt ();
		//focus user to enter an integer between 1 and 3
		while (option != 1 && option != 2 && option != 3)
		{
		    c.println ("enter again, answer with 1,2 or 3");
		    option = c.readInt ();
		}

		if (option != 3)
		{
		    //if the user choose to answer a random question
		    if (option == 1)
		    {
			c.println (myQuestions [((int) (10 * Math.random ())) * i]);
			userAnswers [((int) (10 * Math.random ())) * i] = c.readLine ();
		    }
		    //if the user choose to answer a specific question
		    if (option == 2)
		    { //read in the specific question number the user would like to answer
			c.println ("which question would you like? enter from 1 to 10");
			int questionNum = c.readInt ();
			//print out the specific question the user choose to answer
			c.println (myQuestions [questionNum - 1]);
			userAnswers [questionNum - 1] = c.readLine ();
		    }
		}
		//if the user choose to quit
		else
		{
		    result (rightAnswers, userAnswers);
		    c.println ("end of program");
		}

	    }
	}
	result (rightAnswers, userAnswers); //call from the result method
	// Place your program here.  'c' is the output console
    } // main method


    public static void result (String[] [] rightAnswers, String[] userAnswers)
    {
	int sum = 0;    //initialize the totol points that the user get
	int[] value = new int [10]; //initialize the array
	//assign values to the array
	value [0] = 7;
	value [1] = 10;
	value [2] = 4;
	value [3] = 6;
	value [4] = 2;
	value [5] = 1;
	value [6] = 9;
	value [7] = 3;
	value [8] = 5;
	value [9] = 8;
	//determine the whether the answer is right or wrong
	boolean decide[]=new boolean[10];
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 7 ; j++)
	    {
		if (userAnswers [i].equals (rightAnswers [i] [j]))
		{
		    decide[i] = true;
		}
	    }
	}
	//go through the array
	for (int i = 0 ; i <10 ; i++)
	{
	    c.print ((i + 1) + ". " + userAnswers [i]); //print the question number
	    //if the answer is right
	    if (decide[i] == true)
	    {
		c.println (", Right");
		sum = sum + value [i];
	    }
	    //if the answer is wrong
	    if (decide[i] == false)
	    {
		c.println (", Wrong, " + rightAnswers [i] [0]);
	    }
	}
	 c.println ("your score is " + sum); //print the points that the users get
	//print a qualitative message based on the user's answers
	if (sum >= 50)
	{
	    c.println ("excellent, you are a genius!");
	}


	if (sum > 40 && sum < 50)
	{
	    c.println ("good job, you are great!");
	}


	if (sum > 30 && sum < 40)
	{
	    c.println ("not bad, keep it on!");
	}


	if (sum > 20 && sum < 30)
	{
	    c.println ("it's okay, try harder!");
	}


	if (sum > 10 && sum < 20)
	{
	    c.println ("don't give up, I've seen worse");
	}


	if (sum >= 0 && sum < 10)
	{
	    c.println ("need to do better");
	}


       
    }
} // ArrayAssign3_Jane class


