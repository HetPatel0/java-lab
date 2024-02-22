public class Myclass {
    public static int objectCounter=0;
    public Myclass(){
        objectCounter ++;
    }
    public static int getObjectCounter() {
        return objectCounter;
    }

    public static void main(String[] args) {
        Myclass obj1 = new Myclass();
        Myclass obj2 = new Myclass();

        System.out.println(Myclass.getObjectCounter());

    }

}


   