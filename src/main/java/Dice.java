public class Dice {
private int craps = 0;
private int yatzee =0;
private static int diceRollNum = 0;

    public Dice() {
        Dice.diceRollNum++;
      //  System.out.println("you rolled " + Dice.diceRollNum + " amount of times");
            this.craps =  (int) (Math.random() * (7 - 1)) + 1;
            this.yatzee = (int) (Math.random() * (7 - 1)) + 1;

    }

//    public static void main(String[] args){
//
//        Dice dice1 = new Dice();
//        Dice dice2 = new Dice();
//
//        System.out.println(dice1.tossAndSum());
//
//    }

   // public Dice() {
    //}

    public static int getDiceRollNum() {
        return Dice.diceRollNum;
    }

    public static void setDiceRollNum(int diceRollNum) {
        Dice.diceRollNum = diceRollNum;
    }

    public int getCraps() {
        return this.craps;
    }

    public void setCraps(int craps) {
        this.craps = craps;
    }

    public int getYatzee() {
        return this.yatzee;
    }

    public void setYatzee(int yatzee) {
        this.yatzee = yatzee;
    }

    public int tossAndSum(){
return this.craps + this.yatzee;
    };

}
