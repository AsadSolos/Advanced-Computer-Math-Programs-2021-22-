//Muhammad Khurram, 10/19/21
//I will be making a circle radius and circumference calculator
//using doubles, integers, and Scanner.
import java.util.Scanner;
public class Lab07Circles_MK
{
   public static void main(String[] args) 
   {
      // The prefix "final" tells Java the variable can NOT have a new value assigned to it after the first value
      final double PI = 3.14159;
      int radius;
      Scanner scan = new Scanner(System.in);
      System.out.println("Input a radius");
      radius = scan.nextInt();
      
      double Area1 = PI * radius * radius;
      double Circle1 = PI * 2 * radius;
     
      System.out.println("The area of a circle with the radius " + radius + " is " + Circle1);
      System.out.println("The circumference of a circle with the radius of " + radius + " is " + Circle1);
     
      radius = 2 * radius;
      double Area2 = PI * radius * radius;
      double Circle2 = PI * 2 * radius;

      System.out.println("\nThe area of a circle with radius " + radius + " is " + Area2);
      System.out.println("The circumference of a circle with the radius " + radius + " is " + Circle2);
      
      double RatioOfArea = Area2 / Area1;
      double RatioOfCircle = Circle2 / Circle1;
      
      System.out.println("\nThe ratio of the areas when the radius is doubled is " + RatioOfArea);
      System.out.println("The ratio of the circumference when the radius is doubled is " + RatioOfCircle);
   }
}
