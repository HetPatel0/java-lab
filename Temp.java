//Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-32*5/9 )
import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        System.out.println("Enter temprature in fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("Temp in Celsius : "+ c);

    }
    
}
