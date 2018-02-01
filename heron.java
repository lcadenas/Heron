//The goal of this program is to calculate the area of a triangle using the Heron's formula and the length of the sides entered by a user.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Heron
{
   public static void main (String [] args)
   {
   double side1, side2, side3, s, area;
   
   //Establish imput and prompt the user to enter the lengths of the sides. 
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the length of side 1: ");
   side1 = input.nextDouble();
   System.out.print("Enter the length of side 2: " );
   side2 = input.nextDouble();
   System.out.print("Enter the length of side 3: ");
   side3 = input.nextDouble();
   
   //Perform calculation 
   s = (side1 + side2 + side3)/2;
   area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
   DecimalFormat fmt = new DecimalFormat("0.###");
   
   //Set up output
   System.out.println("Area: " + fmt.format(area));
   }
}
