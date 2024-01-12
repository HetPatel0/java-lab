//The marks obtained by a student in 5 different subjects are input through the keyboard.
//The student gets a division as per the following rules:
//I. Percentage above or equals to 60-􀆒rst division
//II. Percentage between 50 to 59-second division
//III. Percentage between 40 and 49-Third division
//IV. Percentage less than 40-fail
import java.util.Scanner;
public class Percentage {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sub1");
        int s1 = sc.nextInt();
        System.out.println("Sub2");
        int s2 = sc.nextInt();
        System.out.println("Sub3");
        int s3 = sc.nextInt();
        System.out.println("Sub4");
        int s4 = sc.nextInt();
        System.out.println("Sub5");
        int s5 = sc.nextInt();

        double p = (s1+s2+s3+s4+s5)/5;
        System.out.println("Percentage : " + p);
        
        if(p>=60) {
            System.out.println("First Division");

        }
        else if(p>=50 && p<59) {
            System.out.println("Second Division");
        }
        else if(p>=40 && p<49) {
            System.out.println("Third Division");
        }
        else if(p<40) {
            System.out.println("FAIL ");
        }
        

    }
}
