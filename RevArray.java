//Write a program to print given array in reverse order
import java.util.Scanner;
public class RevArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for (int k=arr.length;k>0;k--) {
            System.out.println(arr[k]);
        }
    }
    
}
