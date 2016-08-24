// The "GraphicsQuiz_Jane" class.
import java.awt.*;
import hsa.Console;

public class GraphicsQuiz_Jane
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.setColor(Color.black);
	c.drawRect(0,0,401,401);
	c.setColor(Color.green);
	c.fillOval(1,1,50,50);
	c.fillOval(101,301,50,50);
	c.fillOval(201,101,50,50);
	c.fillOval(301,201,50,50);
	c.setColor(Color.cyan);
	c.fillOval(1,101,50,50);
	c.fillOval(101,201,50,50);
	c.fillOval(201,301,50,50);
	c.fillOval(301,1,50,50);
	c.setColor(Color.magenta);
	c.fillOval(1,201,50,50);
	c.fillOval(101,101,50,50);
	c.fillOval(201,1,50,50);
	c.fillOval(301,301,50,50);
	c.setColor(Color.red);
	c.fillOval(1,301,50,50);
	c.fillOval(101,1,50,50);
	c.fillOval(201,201,50,50);
	c.fillOval(301,101,50,50);
	c.setColor(Color.blue);
	c.fillOval(51,351,50,50);
	c.fillOval(151,251,50,50);
	c.fillOval(251,151,50,50);
	c.fillOval(351,51,50,50);
	c.setColor(Color.orange);
	c.fillOval(51,51,50,50);
	c.fillOval(151,151,50,50);
	c.fillOval(251,251,50,50);
	c.fillOval(351,351,50,50);
	c.setColor(Color.pink);
	c.fillOval(51,151,50,50);
	c.fillOval(151,351,50,50);
	c.fillOval(251,51,50,50);
	c.fillOval(351,251,50,50);
	c.setColor(Color.yellow);
	c.fillOval(51,251,50,50);
	c.fillOval(151,51,50,50);
	c.fillOval(251,351,50,50);
	c.fillOval(351,151,50,50);
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // GraphicsQuiz_Jane class
