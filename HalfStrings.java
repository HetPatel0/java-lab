import java.util.Scanner;
public class HalfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        for (int i =st.length()/2; i<=st.length()-1 ;i++) {
            
            System.out.println(st.charAt(i));
        }
    }
    
}
