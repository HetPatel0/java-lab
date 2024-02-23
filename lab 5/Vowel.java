import java.util.Scanner;

import javax.sound.midi.Soundbank;



public class Vowel {
  


    void Counter() {
        Scanner sc = new Scanner(System.in);
        String st= sc.nextLine();
        int va=0,ve=0,vo=0,vu=0,vi=0;


        while(!st.equals("quit")){
            for(int i=0;i<=st.length()-1;i++) {
                char ch =st.charAt(i);
                if(ch=='a'||ch=='A'){
                    va++;

                }if(ch=='u'||ch=='U'){
                    vu++;

                }
                if(ch=='e'||ch=='E'){
                    ve++;

                }
                if(ch=='i'||ch=='I'){
                    vi++;

                }
                if(ch=='o'||ch=='O'){
                    vo++;

                }


     
             }

             st=sc.nextLine();





        }
        System.out.println("Count of a:"+ va);
        System.out.println("Count of e:"+ ve);
        System.out.println("Count of i:"+ vi);
        System.out.println("Count of o:"+ vo);
        System.out.println("Count of u:"+ vu);
      

       


       }
       public static void main(String[] args) {
        Vowel v = new Vowel();
        v.Counter();


       }
       

    }
    
    

