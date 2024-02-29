// ***********************************611742*************************************
// Program Title: Lab10Grade_MK
// Programmer Name: Muhammad Khurram
// Date: 11/30/21
// Desc.:Program will calculate grade
//
//*******************************************************************************
import java.util.Scanner;
public class Lab10Grade_MK
{
        public static void main(String[] args)
        {
                Scanner scan = new Scanner(System.in);
                double grade1, grade2, grade3, grade4, grade5;
                double totalGrade;
               
                System.out.println("\t*** Grade Calculator ***");
                System.out.println(" ");
                System.out.print("Please enter 5 grades so I can determine your average: ");
               
                grade1 = scan.nextInt();
                grade2 = scan.nextInt();
                grade3 = scan.nextInt();
                grade4 = scan.nextInt();
                grade5 = scan.nextInt();
               
                totalGrade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
                System.out.println(" ");
                System.out.println("Your average is " + totalGrade);
               
                if (totalGrade >= 90)
                {
                        System.out.println("Your grade is an A.");
                        System.out.println("Keep up the great work.");
                        System.out.println(" ");
                }
                else if (totalGrade >= 87)
                {
                        System.out.println("Your grade is a B+.");
                        System.out.println("You are doing very well.");
                        System.out.println(" ");
                }
                else if (totalGrade >= 80)
                {
                        System.out.println("Your grade is a B.");  
                        System.out.println("You are doing well.");
                        System.out.println(" ");            
                }
                else if (totalGrade >= 77)
                {
                        System.out.println("Your grade is a C+.");
                        System.out.println("You are doing fine.");
                        System.out.println(" ");
                }
                else if (totalGrade >= 70)
                {
                        System.out.println("Your grade is a C.");
                        System.out.println("You are doing alright, could use improvement.");
                        System.out.println(" ");            
                }        
                else if (totalGrade >= 67)
                {              
                        System.out.println("Your grade is a D+.");
                        System.out.println("Try harder, you can do it.");
                        System.out.println(" ");
                }  
                else if (totalGrade >= 60)
                {
                        System.out.println("Your grade is a D.");
                        System.out.println("You can do this. Ask for help.");
                        System.out.println(" ");
                }
                else if (totalGrade <= 59)
                {
                        System.out.println("Your grade is an F.");
                        System.out.println("You are failing. Please ask for help.");
                        System.out.println(" ");
                }
                System.out.println("If you want to improve your grade, make sure you get missing work turned in,");
                System.out.println("and take advantage of retakes when needed.");
        
        
        }
}