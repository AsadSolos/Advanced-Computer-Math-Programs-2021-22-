//Muhammad Khurram
//10/14/2021
//Lab06IntCalculator
//I am creating a basic integer calcullator that can 
//add, subtract, multiply, divide, and use modulus.

import java.util.Scanner;

public class Lab06IntCalculator
{
    public static void main(String[] args) 
    {
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer");
        num1 = input.nextInt();

        System.out.println("Enter second integer");
        num2 = input.nextInt();
        System.out.print("You entered the numbers: ");
        System.out.print(num1);
        System.out.print(", ");
        System.out.println(num2);
         
            System.out.print(num1);
            System.out.print(" + ");
            System.out.print(num2);
            System.out.print(" = ");
            System.out.println(num1 + num2);
            
            System.out.print(num1);
            System.out.print(" - ");
            System.out.print(num2);
            System.out.print(" = ");
            System.out.println(num1 - num2);
            
            System.out.print(num1);
            System.out.print(" * ");
            System.out.print(num2);
            System.out.print(" = ");
            System.out.println(num1 * num2);
            
            System.out.print(num1);
            System.out.print(" / ");
            System.out.print(num2);
            System.out.print(" = ");
            System.out.println(num1 / num2);
            
            System.out.print(num1);
            System.out.print(" % ");
            System.out.print(num2);
            System.out.print(" = ");
            System.out.println(num1 % num2);
    }
}