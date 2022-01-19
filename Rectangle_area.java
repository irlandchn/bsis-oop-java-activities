/* Activity: Lab Quiz 1
   Name: John Roland C. Luzong
   Section: BSIS-2A
   Subject: Object-Oriented Programming, Laboratory
   Schedule: Friday - 10:00 - 13:00
   Date Submitted: October 29, 2021
*/

import java.util.Scanner;

public class Rectangle_area{

        public static void main(String[] args){

        double length, width, area;

        Scanner in = new Scanner (System.in);

        System.out.print("Enter the length: ");
        length = in.nextDouble();

        System.out.print("Enter the width: ");
        width = in.nextDouble();

        area = length * width;

        System.out.printf("The Area of the Rectangle is: %.2f", area);


    }
}
