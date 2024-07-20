public class Try {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.increment();
        Singleton s1 = Singleton.getInstance();
        s1.increment();
        Singleton s2 = Singleton.getInstance();
        s2.increment();



        Sing ss3 = new Sing();
        ss3.increment();
        Sing ss2 = new Sing();
        ss2.increment();
        Sing ss1 = new Sing();
        ss1.increment();
        
    }
}

class Singleton {

    private static Singleton instance;

        int i=0;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    void increment(){
System.out.println(""+i++);
    }
}

class Sing {


   int i=0;

    void increment(){
System.out.println(""+i++);
    }
}
