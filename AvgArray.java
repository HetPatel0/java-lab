import java.util.Scanner;

public class AvgArray {
    public static void main (String[] args) {
        int arr[] = new int[10];
        int sum =0;
        
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
             sum = sum+arr[i];
        }
        double avg = sum/(double)10;
        System.out.println(avg);
    }
    
}
