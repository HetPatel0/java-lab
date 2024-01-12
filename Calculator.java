import java.util.Scanner;

public class Calculator { 
    public static void main(String[] args) {
        
    
    System.out.println("Enter first No");
    Scanner sc = new Scanner(System.in);
    int first = sc.nextInt();
    System.out.println("Enter Opreator");
    char ch = sc.next().charAt(0);
    System.out.println("Enter second No");
    int sec = sc.nextInt();

    switch (ch) {
        case '+' : {
            System.out.println(first+sec);
            break;
        }
        case '-' :{
            System.out.println(first-sec);
            break;
        }
        case '*' : {
            System.out.println(first*sec);
            break;
        }
        case '/' :{
            System.out.println(first/(double)sec);
            break;
        }
        case '%' :{
            System.out.println(first%sec);
        }
     }

    
}
}
