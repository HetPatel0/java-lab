import java.util.Scanner;
public class StringPyramid {
    public static void main (String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println("Pyramid: ");
        for(int i=0;i<=st.length()-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(st.charAt(j));
            }
            System.out.println();

        }

    }
    
}
