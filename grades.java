import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class grades {
    public static void main(String[] args) {
        int[] myTestResults;                       // create an array called "mtTestResults"
        myTestResults = new int[5];                // the array must have 5 values inside it
        System.out.println("PLEASE ENTER 5 TEST SCORES");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Test1:");               // ask the user to enter the test scores
        int test1 = input.nextInt();
        myTestResults[0] = test1;                  // add the users input into the array

        System.out.println("Test2:");
        int test2 = input.nextInt();
        myTestResults[1] = test2;

        System.out.println("Test3:");
        int test3 = input.nextInt();
        myTestResults[2] = test3;

        System.out.println("Test4:");
        int test4 = input.nextInt();
        myTestResults[3] = test4;

        System.out.println("Test5:");
        int test5 = input.nextInt();
        myTestResults[4] = test5;

        System.out.println(Arrays.toString(myTestResults));

        int average = (test1 + test2 + test3 + test4 + test5)/5; // calculate the test scores average

        if(average >= 80)                     // based on the average this will determine which symbol the score belongs to
            System.out.println(average + " " + "= A");
        else if(average >= 70)
            System.out.println(average + " " + "= B");
        else if(average >= 60)
            System.out.println(average + " " + "= C");
        else if(average >= 50)
            System.out.println(average + " " + "= D");
        else
            System.out.println(average + " " + "= F");

    }
    
}
