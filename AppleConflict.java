/* Activity: Lab Activity #8
   Name: John Roland C. Luzong
   Section: BSIS-2A
   Subject: Object-Oriented Programming, Laboratory
   Schedule: Friday - 10:00 - 13:00
   Date Submitted: November 12, 2021
*/

import java.util.Scanner;

public class AppleConflict {

    public static void main(String[] args){

    int Apple;

    Scanner in = new Scanner(System.in);

    System.out.print("Enter the number of apples: ");
    Apple = in.nextInt();

    if(Apple >= 0 && Apple <= 5) {
        System.out.print("No, ask for more");
    }
    else if(Apple >= 6 && Apple <=10) {
        System.out.print("Okay, sure");
    }
    else if(Apple > 10){
        System.out.print("No way, that's too much");
    }
    }
}
