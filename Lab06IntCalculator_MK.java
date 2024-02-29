//Muhammad Khurram
//10/14/2021
//Lab06IntCalculator
//I am creating a basic integer calcullator that can 
//add, subtract, multiply, divide, and use modulus.

import java.util.Scanner;

public class Lab06IntCalculator_MK
{
    public static void main(String[] args) 
    {
        int num1;
        int num2;
        
        int addition;
        int subtraction;
        int multiplication;
        int division;
        int modulus;
        
        String operation;
            
        Scanner input = new Scanner(System.in);

            System.out.println("Enter first integer");
            num1 = input.nextInt();

            System.out.println("Enter second integer");
            num2 = input.nextInt();
            
            addition = (num1 + num2);
            subtraction = (num1 - num2);
            multiplication = (num1 * num2);
            division = (num1 / num2);
            modulus = (num1 % num2);

               System.out.println("You entered the numbers: "+num1+" and "+num2+".");
               System.out.println(num1+" + "+num2+" = "+(addition));
               System.out.println(num1+" - "+num2+" = "+(subtraction));
               System.out.println(num1+" * "+num2+" = "+(multiplication));
               System.out.println(num1+" / "+num2+" = "+(division));
               System.out.println(num1+" % "+num2+" = "+(modulus));
    }
}