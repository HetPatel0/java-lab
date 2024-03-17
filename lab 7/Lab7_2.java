
interface A {
    int a=1;
     void showA();
    
}
interface A1 extends A{
    int a1=2;
    void showA1();
    
}
interface A2 extends A{
    int a2=2;
    void showA2();
    
}
interface A12 extends A1,A2{
    int a12=2;
    void showA12();
      
}
class B implements A12{
    public void showA(){
        System.out.println(a);
    }
    public void showA1(){
        System.out.println(a1);
    } 
    public void showA2(){
        System.out.println(a2);
    }
    public void showA12(){
        System.out.println(a12);
    }


}


public class Lab7_2 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.showA();
        b1.showA1();
        b1.showA2();
        b1.showA12();


    }
    
}
