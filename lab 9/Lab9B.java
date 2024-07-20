

public class Lab9B {
    public static void main(String[] args) {
        Thread odd = new PrintNum(1);
        Thread even = new PrintNum(2);
        odd.start();
        even.start();
    }
    
}
        
class PrintNum extends Thread {
    int start;
    public PrintNum(int a){
        start=a;
    }
    public void run(){
        try{
            for( int i= start;i<=20;i+=2){
                System.out.println(i);
                Thread.sleep(500);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    
}
