import java.util.*;
public class AreaCircle {
    public static void main(String[] args) {
        System.out.println("Enter Radius");
        Scanner sc = new Scanner(System.in);    
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println(area);

    }
}
