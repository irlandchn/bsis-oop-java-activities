/* Activity: Lab Quiz 1
   Name: John Roland C. Luzong
   Section: BSIS-2A
   Subject: Object-Oriented Programming, Laboratory
   Schedule: Friday - 10:00 - 13:00
   Date Submitted: October 29, 2021
*/

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args){

       int inputNum, sumNum = 0;

       System.out.println("Enter the five numbers: ");

       Scanner num = new Scanner (System.in);

        for(int i = 0 ; i < 5 ; i++) {

            inputNum = num.nextInt();

            sumNum += inputNum;
        }

        System.out.println("The sum of the five numbers is: " + sumNum);

    }
}
