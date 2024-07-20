class TimeDemo {
    int hr,min,sec;
     TimeDemo() {
        hr=12;
        min=30;
        sec =40;

    } 
     TimeDemo(int hr,int min, int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    void addTime(TimeDemo t1,TimeDemo t2){
      int hr_ans = t1.hr + t2.hr;
      int min_ans = t1.min + t2.min;
      int sec_ans = t1.sec + t2.sec;
      if (min_ans >59 ){
        min_ans = min_ans-60;
        hr_ans= hr_ans+1;
      }

      if (sec_ans >59 ){
        sec_ans = sec_ans-60;
        min_ans= min_ans+1;
      }
      
      System.out.println("Time" + hr_ans + ":" + min_ans + ":" + sec_ans);



    }

}

public class Time {
    public static void main(String[] args){
        TimeDemo t1 = new TimeDemo();
        TimeDemo t2 = new TimeDemo(11,30,30);
        t1.addTime(t1,t2);



    }
    
}
