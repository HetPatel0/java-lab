import java.math.*;
class Area{
    double circle (int radius){
        return Math.PI*radius*radius;

    }
}

public class AreaOfCircle{
    public static void main(String[] args){
        Area ar = new Area();
        int r =10;
        double ans =ar.circle(r);
        System.out.println(ans);

    }
}