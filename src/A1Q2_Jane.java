/*Jane Wang
  Sept.27.2014
  A1Q2_Jane 
  This program shows a user's first name, initial, grade, and mark*/
// The "Assignment2" class.
import java.awt.*;
import hsa.Console;

public class A1Q2_Jane
{
    static Console c;           // The output console
    public static void main (String[] args)
    {
      // Place your program here.  'c' is the output console	
      c = new Console ();
      String S;
      char C;
      int I;
      double F;
      c.println("enter your first name");
      S=c.readString();
      c.println("enter your initial");
      C=c.readChar();  
      c.println("enter your grade");
      I=c.readInt();
      c.println("enter your mark");
      F=c.readDouble();
      c.print("your name is ");
      c.println(S);
      c.print("your age is ");
      c.println(C);
      c.print("your grade is ");
      c.println(I);
      c.print("your mark is ");
      c.println(F);
    } // main method
} // Assignment2 class
