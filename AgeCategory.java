/* Activity: Lab Activity #7
   Name: John Roland C. Luzong
   Section: BSIS-2A
   Subject: Object-Oriented Programming, Laboratory
   Schedule: Friday - 10:00 - 13:00
   Date Submitted: November 12, 2021
*/

import java.util.Scanner;

public class AgeCategory {

    public static void main(String[] args){

        int Age;

        Scanner in = new Scanner (System.in);

        System.out.print("Enter the age: ");
        Age = in.nextInt();

        if(Age <= 12){
            System.out.print("Child");
        }
        else if(Age <= 17){
            System.out.print("Teenager");
        }
        else if(Age <= 59) {
            System.out.print("Adult");
        }
        else{
            System.out.print("Senior Citizen");

        }
    }
}
