//Name: Muhammad Khurram
//Date: 11/19/2021
//ID: 611742
//Program Name: Lab09B_MK
//Desc.: I will be revising Lab09 with if-else statements

import java.util.Scanner;

public class Lab09B_MK
{   
   public static void main(String[] args)
   {
    Scanner scan = new Scanner(System.in);
    int num1, num2;
          
         System.out.print("Enter two integers: ");
         num1 = scan.nextInt();
         num2 = scan.nextInt();
         
         System.out.println("You entered " + num1 + " and " + num2 + "\n");
         
         if (num1 > 0 && num2 < 0)
         {
            System.out.println("The number " + num1 + " is positive");
            System.out.println("The number " + num2 + " is negative\n");
         }else if (num1 < 0 && num2 > 0)
         {
            System.out.println("The number " + num1 + " is negative");
            System.out.println("The number " + num2 + " is positive\n");
         }
         if (num1 > 0 && num2 > 0)
         {
            System.out.println("The number " + num1 + " is positive");
            System.out.println("The number " + num2 + " is positive\n");
         }else if (num1 < 0 && num2 < 0)
         {
            System.out.println("The number " + num1 + " is negative");
            System.out.println("The number " + num2 + " is negative\n");
         }
         if (num1 % 2 == 0 && num2 % 2 == 0)
         {
            System.out.println("The number " + num1 + " is even");
            System.out.println("The number " + num2 + " is even\n");
         }else if (num1 % 2 == 0 && num2 % 2 != 0)
         {
            System.out.println("The number " + num1 + " is even");
            System.out.println("The number " + num2 + " is odd\n");
         }
 
         if (num1 % 2 != 0 && num2 % 2 != 0)
         {
            System.out.println("The number " + num1 + " is odd");
            System.out.println("The number " + num2 + " is odd\n");
         }else if (num1 % 2 != 0 && num2 % 2 == 0)
         {
            System.out.println("The number " + num1 + " is odd");
            System.out.println("The number " + num2 + " is even\n");
         }
        
         if (num1 < num2)
         {
            System.out.println("The number " + num2 + " is larger than the number " + num1);
            }else 
            System.out.println("The number " + num2 + " is smaller than the number " + num1);
         
            if (num1 % num2 == 0)
            {
               System.out.println("The number " + num1 + " is divisible by " + num2);
               System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
            } else
            {
               System.out.println("The number " + num1 + " isn't divisble by " + num2);
               System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
            } 
            
              
               
               
}
}