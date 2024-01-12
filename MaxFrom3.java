import java.util.Scanner;
public class MaxFrom3 {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first No");
        int a = sc.nextInt();
        System.out.println("Enter second No");
        int b = sc.nextInt();
        System.out.println("Enter third No");
        int c = sc.nextInt();

        if(a>b) {
            if(a>c) {
                System.out.println("A is largest");

            }
            else {
                System.out.println("C is largest");
            }
        } 
        else {
            if (b>c) {
                System.out.println("B is Largest");
            }
            else{
                System.out.println("C is largest");
            }
        }
       

    }
    
}
