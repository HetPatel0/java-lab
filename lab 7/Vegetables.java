abstract class InnerVegetables {
    String name;
    String color;
    abstract public String toString();
}
 class Potato extends InnerVegetables{
    String name;

    Potato(){
        super.name="Potato";
        super.color="brown";

    }
    @Override
    public String toString(){
        return "Vegtabale: " + super.name + "  Color : " + super.color;
    }

    
}
class Brinjal extends InnerVegetables{
    String name;

    Brinjal(){
        super.name="Brinjal";
        super.color="purple";

    }
    @Override
    public String toString(){
        return "Vegtabale: " + super.name + "  Color : " + super.color;
    }

    
}
class Tomato extends InnerVegetables{
    String name;

    Tomato(){
        super.name="Tomato";
        super.color="red";

    }
    @Override
    public String toString(){
        return "Vegtabale: " + super.name + "  Color : " + super.color;
    }

    
}

public class Vegetables {
    public static void main(String[] args) {
        Potato p1 = new Potato();
        System.out.println(p1.toString());
        Brinjal p2 = new Brinjal();
        System.out.println(p2.toString());
        Tomato p3 = new Tomato();
        System.out.println(p3.toString());

        
    }
    
}
