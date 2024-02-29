//*******611742**************
//*Name: Muhammad Khurram   *
//*Desc.: I am creating a   *
//*program that will convert*
//*decimal to binary.       *
//***************************


import java.util.Scanner;
public class BasicBinaryLab_MK
{
        public static void main(String[] args)
        {
                Scanner scan = new Scanner(System.in);
                int a, aB, b, bB, c, cB, d, dB, e, eB, f, fB, g, gB, h, hB, i, iB, j, jB, k, kB;
                int num;
                
                System.out.print("Input a number up to 2047 : ");
                num = scan.nextInt();
                
                a = num / 1024;
                aB = num % 1024;
                
                b = aB / 512;
                bB = aB % 512;
                
                c = bB / 256;
                cB = bB % 256;
                
                d = cB / 128;
                dB = cB % 128;
                
                e = dB / 64;
                eB = dB % 64;
                
                f = eB / 32;
                fB = eB % 32;

                g = fB / 16;
                gB = fB % 16;

                h = gB / 8;
                hB = gB % 8;
                
                i = hB / 4;
                iB = hB % 4;
                
                j = iB / 2;
                jB = iB % 2;
                
                k = jB / 1;
                kB = jB % 1;
                
                System.out.print("Number " + num +" in base 10 is ");
                
                System.out.print(a);     
                System.out.print(b);
                System.out.print(c);
                System.out.print(d);
                System.out.print(e);
                System.out.print(f);                
                System.out.print(g);
                System.out.print(h);                 
                System.out.print(i);                
                System.out.print(j);
                System.out.print(k);
                
                System.out.print(" in binary (base 2).");
                
               
        }
}                