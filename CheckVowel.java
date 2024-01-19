import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String");
        String st = sc.next();
        int v=0,c=0;

        for (int i=0;i<=st.length()-1;i++) {
            char ch=st.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("No of vowels :"+ v+"No of Consonent" + c);

    }
    
}
