class ComplexNo {
    int realNO,imgNO;
    ComplexNo() {
        realNO=2;
        imgNO=3;

    }
    ComplexNo(int realNO,int imgNO){
        this.realNO=realNO;
        this.imgNO=imgNO;
    }

    void addComplexNo(ComplexNo c1, ComplexNo c2){
        int totalRealNo = c1.realNO +c2.realNO;
        int totalImgNo = c1.imgNO + c2.imgNO;

        System.out.println("Sum = " +totalRealNo +" + " +totalImgNo+"i");
    }

}

public class ComplexNoDemo {

    public static void main(String[] args) {
        ComplexNo c1 = new ComplexNo();
        ComplexNo c2 = new ComplexNo(2,4);
        c1.addComplexNo(c1,c2);


    }

}