//This program calculates the class average of the students by asking them their names and the scores in 4 exams and homework. 
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ClassAvg
{
    public static void main(String[] arg)
    {
      //Declare variables
      double exam1, exam2, exam3, finalexam, homework;
      double avg;
      
      //Establish input
      Scanner input = new Scanner(System.in);
         System.out.print("Enter your name: ");
         String name = input.next();
         
         System.out.print("Enter your score for exam 1, exam 2, exman 3, and final exam " +
                          "(separeted by space): ");
         DecimalFormat fmt1 = new DecimalFormat("0.##");
        
         exam1 = input.nextDouble();
         exam2 = input.nextDouble();
         exam3 = input.nextDouble();
         finalexam = input.nextDouble();
         
         System.out.print("Enter your homework average: ");
         homework = input.nextDouble();
       
       //Perform calculations  
      avg = exam1*0.15 + ((exam2 + exam3)/2)*0.50 + finalexam*0.30 + homework*0.05;
      
      NumberFormat fmt2 = NumberFormat.getPercentInstance();
      
      //Set up output
      System.out.println("Hello " + name + "!! \nYour class average is: " + fmt1.format(avg) + " or " + fmt2.format(avg/100));
       if (avg >= 90.00)
         System.out.println("Exellent " + name + "!!. Congratulations!! You got an A.");  
       else
         if(80.00 <= avg && avg <= 89.99)
            System.out.println("Well done "+ name +"!!. You got a B.");
         else
           if (70.00 <= avg && avg <= 79.99)
             System.out.println("Good Job " + name + "!!. You got a C.");
           else
             System.out.println("Sorry "+ name + "You will have to take the class again.");

    }
}
