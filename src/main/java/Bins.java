import java.sql.Array;
import java.util.Arrays;

public class Bins {
private int []bin = new int []{0,0,0,0,0,0,0,0,0,0, 0,0,0};

    public Bins(int[] bin) {
        this.bin = bin;
    }

    public Bins() {
    }

//    public static void main(String[] args){
//
//        Dice dice1 = new Dice();
//        Dice dice2 = new Dice();
//
//       int toss1= dice1.tossAndSum();
//        System.out.println(dice1.tossAndSum());
//       int toss2 = dice2.tossAndSum();
//        System.out.println(dice2.tossAndSum());
//        Bins results = new Bins();
//        results.incrementBin(toss1);
//        results.incrementBin(toss2);
//        System.out.println(results.printBin());
//
//
//
//    }

    public int getBin(int num) {
        return bin[num];
    }
    public int[]getCompleteBin(){
        return this.bin;
    }


    public void setBin(int[] bin) {
        this.bin = bin;
    }
    public void incrementBin(int num){
        bin[num]++;
    }
    public String printBin(){
        return Arrays.toString(bin);
    }


}
