# JAVA-Program
Some small-to-medium size java programs I wrote


##IOAssignment1_Jane

  - PART A: Generates 20 random number from 35 to 95, prints the numbers and their average on a file named "data01.txt".
  - PART B&C: Prints the first name and last name of a student, together with four numbers from "data01" as marks on a file named "data02.txt".
  - PART D: Uses tokenizer to calculate the average for each student, and prints the results for each student on "data02".
  
##Inheritance_Jane

  A program that asks the user to choose a geometric object (rectangle, triangle or square), calculates and displays its perimeter and area.
  - abstract class Shape: creates abstract methods
  - class Rectangle extends Shape
    - public Rectangle(double length, double width): constructors
    - public double area(): returns the area of a rectangle
    - public double perimeter(): returns the primeter of a rectangle
  - class Triangle extends Shape
    - public Triangle(double a, double b, double c): constructor
    - public double area(): returns the area of a triangle
    - public double perimeter(): returns the perimeter of a triangle
  - class Square extends Rectangle
    - Square(double s): constructor
    - public double area(): returns the area of a square
    - public double perimeter(): returns the perimeter of a square
     
##MethodAssignment2

  A program that takes two or three numbers are inputs, and displays the maxium, minimum and midian value.
  - public static int min(int a, int b, int d): returns the minimium
  - public static int max(int a, int b, int d): returns the maximium
  - public static boolean isFinished(int a, int b, int d): determines if the user's inputs are finished
  - public static void displayValues(int a, int b, int d): displays the results  

##Project1_Jane
  A program that takes the lengths of two retangels as inputs, calculates and prints their information and their intersected section, it also determines if the rectangles are contained in each other.
  - class Rectangle
    - public Rectangle(int a,int b, int c, int d): places any negative length with zero
	- public int getleft(): accessor
	- public int getbottom(): accessor
	- public int getwidth(): accessor
	- public int getheight(): accessor
	- public static Rectangle intersection(Rectangle r1, Rectangle r2): calculates and returns the area of the intersetion of two rectangles based on five cases
	- public static int totalPerimeter(Rectangle r1, Rectangel r2): returns the total perimeter of the intersection part
	- public static int area(Reactangle r1): returns the area of a rectangle
	- public static int perimeter(Rectangle r1): returns the perimeter of a rectangle
	- public boolean contain(Rectangele r1): determines if a rectangle is contained in the other
