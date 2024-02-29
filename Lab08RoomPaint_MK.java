//Muhammad Khurram
//10/25/2021
//Lab08RoomPaint
//I will create a program that will calculate how much
//paint needed to cover the walls of a room.

import java.util.Scanner;

public class Lab08RoomPaint_MK
{
    public static void main(String[] args) 
    {
     Scanner scan = new Scanner(System.in);
     final int COVERAGE = 350;
     int length;
     int width;
     int height;
     int door = 20;
     int window = 15;
     int doorcount;
     int windowcount;
          
     System.out.println("--- Paint Calculator ---");
     System.out.println("Enter the room's length:");
     length = scan.nextInt();
     System.out.println("Enter the room's width:");
     width = scan.nextInt();
     System.out.println("Enter the room's height:");
     height = scan.nextInt();
     System.out.println("Enter the amount of doors in the room:");
     doorcount = scan.nextInt();
     System.out.println("Enter the amount of windows in the room:");
     windowcount = scan.nextInt();
     
     double totalSqFt = width * height * 2 + length * height * 2;
     totalSqFt = totalSqFt - ((door * doorcount)+(window * windowcount));
     double paintNeeded = totalSqFt/COVERAGE;

     System.out.println("\nA room that is "+ length +" feet long, "+width+" feet wide, and "+height+" feet tall,\nwith "+doorcount+" doors and "+windowcount+" windows, has a total of "+totalSqFt+ " square feet.\nYou will need "+paintNeeded+" gallons of paint.");
     
    
    }
}