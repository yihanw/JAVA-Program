/*Jane Wang
  Dec.17.2013
  Picture_Jane
  this program performs a giraffe with tail moving down*/
// The "Picture_Jane" class.
import java.awt.*;
import hsa.Console;

public class Picture_Jane
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	//giraffe
	//1.head
	c.setColor (Color.black); //strech of the giraffe
	c.drawLine (75, 50, 200, 50); //first horizontal line of head
	c.drawLine (75, 50, 50, 75); //oblique line on the left
	c.drawLine (50, 75, 50, 100); //vertival line on the left
	c.drawLine (50, 100, 160, 100); //horizontal line downward
	c.drawLine (160, 100, 170, 110); //oblique line connecting head and neck
	//2.horns
	c.drawLine (150, 50, 150, 30); //left horn
	c.fillOval (147, 24, 6, 6);
	c.drawLine (175, 50, 175, 30); //right horn
	c.fillOval (172, 24, 6, 6);
	//3.ears
	c.drawLine (200, 50, 220, 30); //oblique line on the left
	c.drawLine (220, 30, 230, 30); //horizontal line
	c.drawLine (230, 30, 220, 60); //oblique line on the right
	c.drawLine (220, 60, 200, 80); //oblique line on the lower left
	//4.neck
	c.drawLine (170, 110, 170, 350); //left vertical line
	c.drawLine (200, 80, 200, 270); //right vertical line
	c.drawLine (200, 270, 210, 300); //oblique line connecting neck and body
	//5.body
	c.drawLine (210, 300, 380, 300); //horizontal line on top
	c.drawLine (380, 300, 400, 320); //oblique line on right
	c.drawLine (400, 320, 400, 470); //vertical line on right
	c.drawLine (170, 350, 180, 380); //oblique line on left
	c.drawLine (225, 370, 350, 370); //horizontal line downward
	//6.left legs
	c.drawLine (180, 380, 180, 470); //left vertical line on left leg
	c.drawLine (180, 470, 187, 477); //left oblique line on left leg
	c.drawLine (187, 477, 193, 477); //left horizontal line at bottom
	c.drawLine (193, 477, 200, 470); //right oblique line on left leg
	c.drawLine (200, 470, 200, 380); //line between two legs on left
	c.drawLine (200, 470, 207, 477); //left oblique line of right legs
	c.drawLine (207, 477, 213, 477); //right horizontal line
	c.drawLine (213, 477, 220, 470); //right oblique line
	c.drawLine (220, 470, 220, 390); //right vertical line
	c.drawLine (220, 390, 225, 370); //oblique line connecting leg and body
	//7.right legs
	c.drawLine (400, 470, 393, 477); //oblique line on right
	c.drawLine (393, 477, 387, 477); //horizontal line on right
	c.drawLine (387, 477, 380, 470); //oblique line on the left of right one
	c.drawLine (380, 470, 380, 380); //line between two legs
	c.drawLine (380, 470, 373, 477); //oblique line on right of the left
	c.drawLine (373, 477, 367, 477); //horizontal line on left
	c.drawLine (367, 477, 360, 470); //oblique line on left of the left one
	c.drawLine (360, 470, 360, 380); //vertical Line on left
	c.drawLine (360, 380, 350, 370); //oblique line connecting leg and body
	//9. colour
	c.setColor (Color.yellow);
	c.fillRect (171, 100, 29, 250); //rect at neck
	c.fillRect (200, 301, 180, 69); //rect at body
	c.fillRect (380, 320, 20, 50); //rect at body
	c.fillRect (381, 370, 19, 100); //rect at right legs
	c.fillRect (361, 370, 19, 100);
	c.fillRect (379, 370, 2, 10);
	c.fillRect (181, 370, 19, 100); //rect at left legs
	c.fillRect (201, 370, 19, 100);
	c.fillRect (199, 370, 2, 10);
	c.fillRect (180, 350, 20, 30); //rect at body
	int T1[] = {75, 51, 51, 200, 200}; //polygon on head
	int T2[] = {50, 75, 99, 100, 51};
	c.fillPolygon (T1, T2, 5);
	int T3[] = {200, 220, 229, 219, 199}; //polygon on ear
	int T4[] = {51, 30, 31, 60, 79};
	c.fillPolygon (T3, T4, 5);
	int T5[] = {160, 171, 171}; //polygon connecting head and neck
	int T6[] = {99, 99, 110};
	c.fillPolygon (T5, T6, 3);
	int T7[] = {199, 199, 209}; //polygon connecting neck and body
	int T8[] = {270, 301, 301};
	c.fillPolygon (T7, T8, 3);
	int T9[] = {171, 180, 180}; //polygon connecting neck and left leg
	int T10[] = {349, 349, 379};
	c.fillPolygon (T9, T10, 3);
	int T11[] = {220, 224, 219};
	int T12[] = {370, 370, 390};
	c.fillPolygon (T11, T12, 3);
	int T13[] = {380, 380, 400}; //polygon at bottom
	int T14[] = {301, 320, 320};
	c.fillPolygon (T13, T14, 3);
	int T15[] = {351, 361, 361}; //polygon connecting body and right leg
	int T16[] = {370, 370, 380};
	c.fillPolygon (T15, T16, 3);
	c.setColor (Color.darkGray);
	int T17[] = {181, 187, 193, 200}; //polygon of feet on left leg
	int T18[] = {470, 477, 477, 470};
	c.fillPolygon (T17, T18, 4);
	int T19[] = {201, 207, 213, 220};
	int T20[] = {470, 477, 477, 470};
	c.fillPolygon (T19, T20, 4);
	int T21[] = {360, 367, 373, 380}; //polygon of feet on right leg
	int T22[] = {470, 477, 477, 470};
	c.fillPolygon (T21, T22, 4);
	int T23[] = {380, 387, 393, 400};
	int T24[] = {470, 477, 477, 470};
	c.fillPolygon (T23, T24, 4);
	//10.details
	c.setColor (Color.black);
	c.drawLine (380, 300, 400, 280); //tail
	c.drawLine (400, 280, 410, 260);
	c.fillRect (410, 248, 12, 12);
	c.fillOval (140, 60, 18, 18); //eye
	c.drawLine (60, 85, 70, 90); //mouth
	c.drawLine (70, 85, 60, 90);
	//11.pattern
	c.setColor (Color.orange);
	c.fillRect (190, 100, 10, 30); //pattern on neck
	c.fillRect (190, 150, 10, 15);
	c.fillRect (171, 175, 10, 30);
	c.fillRect (190, 225, 10, 25);
	c.fillRect (171, 240, 10, 15);
	c.fillRect (175, 280, 15, 20);
	c.fillRect (171, 320, 10, 25);
	c.fillRect (220, 301, 30, 10); //pattern on body
	c.fillRect (200, 330, 20, 15);
	c.fillRect (240, 340, 15, 25);
	c.fillRect (270, 310, 30, 15);
	c.fillRect (280, 355, 30, 15);
	c.fillRect (325, 301, 15, 25);
	c.fillRect (335, 340, 25, 20);
	c.fillRect (350, 301, 25, 15);
	c.fillRect (385, 350, 15, 20);
	c.fillRect (181, 390, 10, 30); //pattern on left leg
	c.fillRect (201, 429, 15, 20);
	c.fillRect (210, 375, 10, 15);
	c.fillRect (361, 380, 10, 30); //pattern on right leg
	c.fillRect (370, 430, 10, 20);
	c.fillRect (390, 400, 10, 30);
	//12.text
	String s1, s2;
	s1="merry christmas";
	c.drawString(s1,450,200);
	s2="There is a gift!";
	c.drawString(s2,455,220);
	//background
	//1.grass
	c.setColor (Color.green); //grass near left leg
	int G1[] = {100, 110, 120};
	int G2[] = {470, 490, 490};
	c.fillPolygon (G1, G2, 3);
	int G3[] = {110, 120, 130};
	int G4[] = {490, 470, 490};
	c.fillPolygon (G3, G4, 3);
	int G5[] = {120, 130, 140};
	int G6[] = {490, 490, 470};
	c.fillPolygon (G5, G6, 3);
	int G7[] = {30, 40, 50}; //grass on left side
	int G8[] = {380, 400, 400};
	c.fillPolygon (G7, G8, 3);
	int G9[] = {40, 50, 60};
	int G10[] = {400, 380, 400};
	c.fillPolygon (G9, G10, 3);
	int G11[] = {50, 60, 70};
	int G12[] = {400, 400, 380};
	c.fillPolygon (G11, G12, 3);
	int G13[] = {230, 240, 250}; //grass between two legs
	int G14[] = {430, 450, 450};
	c.fillPolygon (G13, G14, 3);
	int G15[] = {240, 250, 260};
	int G16[] = {450, 430, 450};
	c.fillPolygon (G15, G16, 3);
	int G17[] = {250, 260, 270};
	int G18[] = {450, 450, 430};
	c.fillPolygon (G17, G18, 3);
	int G19[] = {310, 320, 330};
	int G20[] = {460, 480, 480};
	c.fillPolygon (G19, G20, 3);
	int G21[] = {320, 330, 340};
	int G22[] = {480, 460, 480};
	c.fillPolygon (G21, G22, 3);
	int G23[] = {330, 340, 350};
	int G24[] = {480, 480, 460};
	c.fillPolygon (G23, G24, 3);
	int G25[] = {420, 430, 440}; //grass near right leg
	int G26[] = {400, 420, 420};
	c.fillPolygon (G25, G26, 3);
	int G27[] = {430, 440, 450};
	int G28[] = {420, 400, 420};
	c.fillPolygon (G27, G28, 3);
	int G29[] = {440, 450, 460};
	int G30[] = {420, 420, 400};
	c.fillPolygon (G29, G30, 3);
	int G31[] = {460, 470, 480}; //grass on right side
	int G32[] = {460, 480, 480};
	c.fillPolygon (G31, G32, 3);
	int G33[] = {470, 480, 490};
	int G34[] = {480, 460, 480};
	c.fillPolygon (G33, G34, 3);
	int G35[] = {480, 490, 500};
	int G36[] = {480, 480, 460};
	c.fillPolygon (G35, G36, 3);
	int G37[] = {500, 510, 520};
	int G38[] = {370, 390, 390};
	c.fillPolygon (G37, G38, 3);
	int G39[] = {510, 520, 530};
	int G40[] = {390, 370, 390};
	c.fillPolygon (G39, G40, 3);
	int G41[] = {520, 530, 540};
	int G42[] = {390, 390, 370};
	c.fillPolygon (G41, G42, 3);
	//2.clouds
	c.setColor (Color.cyan);
	c.fillOval (250, 20, 40, 20); //cloud near ear
	c.fillOval (275, 15, 50, 30);
	c.fillOval (310, 20, 40, 20);
	c.fillOval (350, 100, 40, 20); //middle cloud
	c.fillOval (375, 95, 50, 30);
	c.fillOval (410, 100, 40, 20);
	c.fillOval (450, 40, 40, 20); //cloud on the right
	c.fillOval (475, 35, 50, 30);
	c.fillOval (510, 40, 40, 20);
	//animation
	int n1 = 280;
	while (n1 < 312)
	{
	    c.setColor (Color.white);
	    c.drawLine (380, 300, 400, n1);
	    n1 = n1 + 2;
	    c.setColor (Color.black);
	    c.drawLine (380, 300, 400, n1);
	    try
	    {
		Thread.sleep (100); //how fast the tail moves
	    }
	    catch (InterruptedException error)
	    {
		c.println ("sorry couldn't delay");
	    }
	}

	int n2 = 280;
	int n3 = 260;
	while (n2 < 312 && n3 < 292)
	{
	    c.setColor (Color.white);
	    c.drawLine (400, n2, 410, n3);
	    n2 = n2 + 2;
	    n3 = n3 + 2;
	    c.setColor (Color.black);
	    c.drawLine (400, n2, 410, n3);
	    try
	    {
		Thread.sleep (100); //how fast the tail moves
	    }
	    catch (InterruptedException error)
	    {
		c.println ("sorry couldn't delay");
	    }
	}

	int n4 = 248;
	while (n4 < 280)
	{
	    c.setColor (Color.white);
	    c.fillRect (410, n4, 12, 12);
	    n4 = n4 + 2;
	    c.setColor (Color.black);
	    c.fillRect (410, n4, 12, 12);
	    try
	    {
		Thread.sleep (100); //how fast the tail moves
	    }
	    catch (InterruptedException error)
	    {
		c.println ("sorry couldn't delay");
	    }
	}

















	// Place your program here.  'c' is the output console
    } // main method
} // Picture_Jane class
