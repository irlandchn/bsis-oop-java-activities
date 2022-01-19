/* Activity: Lab Quiz 1
   Name: John Roland C. Luzong
   Section: BSIS-2A
   Subject: Object-Oriented Programming, Laboratory
   Schedule: Friday - 10:00 - 13:00
   Date Submitted: October 29, 2021
*/

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args){

    double meters, conversion;

    Scanner con = new Scanner (System.in);

    System.out.print("Enter the length in meters: ");
    meters = con.nextDouble();

    conversion = meters / 1000;

    System.out.printf("The length of %.2f meters in kilometers is %.6f", meters, conversion);

    }
}
