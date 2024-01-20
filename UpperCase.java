//If an argument is found that does not begin with
//an upper case letter, display error message and terminate.
import java.util.Scanner;
public class UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String st= sc.next();
    char ch = st.charAt(0);
    if(ch>=65 && ch<=91){
        System.out.println("First char is Upper case");
    }
    else{
        System.out.println("ERROR");
    }
    }
}
    