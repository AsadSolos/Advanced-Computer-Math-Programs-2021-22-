//********611742********
//*Name: Muhammad Khurram
//*Date: 3/9/22
//*Desc: Writes a program which prints numbers from -10 up to 10 on the same line with a single space between them,
//*Checks each integer number and prints the odd numbers 0 and 50 each on their own line
//*Print the multiples of 3 from 30 down to 3 on the same line with a hyphen between them
//*Ask the user to enter a low and high value and have the loop print values in the range that are divisible by 4 but not by 5 each on its own line
import java.util.Scanner;
public class ForLoops_MK {
        public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int low, high;
        
        System.out.println("BEGIN Loop Practice #1");
        
        for (int i = -10; i <= 10; i = i + 1)
        {
                System.out.print(i + " ");
        }
        
        System.out.println("\nEND Loop Practice #1\n");   
        
        System.out.println("BEGIN Loop Practice #2");
        
        for (int i = 1; i < 50; i = i + 2)
        {
                System.out.println(i);
        }
        
        System.out.println("END Loop Practice #2\n");
        
        System.out.println("BEGIN Loop Practice #3");
        
        for (int i = 30; i > 1; i = i - 3)
        {
                if (i == 3)
                {
                        System.out.print(i);
                }
                else
                {
                        System.out.print(i + "-");
                }
        }
        
        System.out.println("\nEND Loop Practice #3\n");
        
        System.out.println("BEGIN Loop Practice #4\nEnter a LOW value: ");
        low = scan.nextInt();
        System.out.println("Enter a HIGH value: ");
        high = scan.nextInt();
        
        System.out.println("The values below are divisible by 4 but not 5.");
        
        for (int i = 0; i <= high; i = i + 4)
        {
                if (i % 5 != 0 && i >= low)
                {
                        System.out.println(i);
                }
        }
        System.out.println("END Loop Practice #4");
            
            
        }

}
