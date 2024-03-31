
public class lab9A {
    public static void main(String[] args) {
        Runnable r1 = new PrintMsg("Good morning", 1000);
        Runnable r2 = new PrintMsg("Good afternoon", 3000);

        Thread gm = new Thread(r1);
        Thread ga = new Thread(r2);
        gm.start();
        ga.start();

    }
    
}

 class PrintMsg implements Runnable {
    String msg;
    int delay;
    PrintMsg(String msg,int delay){
        this.msg =msg;
        this.delay=delay;
    }
    public void run(){
        try{
            while (true) {
                System.out.println(msg);
                Thread.sleep(delay);
                
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
}
