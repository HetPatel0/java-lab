import java.io.*;


public class Lab10A1 {
    public static void main(String[] args) {
        try {
            FileWriter fw =  new FileWriter(abc.txt);
        PrintWriter pw = new PrintWriter(fw);
        pw.write("Rajkot");
        fw.close();
        pw.close();
        int lineCount=0,wordCount=0,charCount=0;

        }
        catch(Exception e){
            e.printStackTrace();
        }

        

        
    }
    
}
