import java.util.Arrays;

public class Simulation {

private int numberOfDies =2;
private int numberOfTosses =1000;
private int []bin;
private String finalresultString = "";

    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public Simulation() {
    };

    public static void main(String[] args){
        Simulation simulation = new Simulation(2, 1000);
        System.out.println(simulation.runSimulation());
        System.out.println(simulation.printResults());

    }


    public String runSimulation(){
        // create bin outside of loop to store values.

        Bins results = new Bins();
        //loop the number of tosses
        for(int i= 0; i< numberOfTosses; i++){

            for(int j=0; j<numberOfDies; j++){
                // in each toss throw numberofdies amount and store value inside bin

                Dice dice = new Dice();
                int toss = dice.tossAndSum();
                results.incrementBin(toss);
            }
        }
        this.bin = results.getCompleteBin();

        return results.printBin();

    }
    public String printResults(){
        // loop through bin and store in line in writing file
            this.finalresultString += "***\n" +
                    "Simulation of " + numberOfDies +  " dice tossed for "  + numberOfTosses + " times.\n" +
                    "*** \n";
        for(int i =2; i< this.bin.length; i++){
            //System.out.println(this.bin[i]);
            double percentageNum =  (bin[i] / (double) numberOfTosses );
           // percentageNum = percentageNum /1000;
            this.finalresultString += (i +  ":    " + this.bin[i] + ": " + String.format("%.2f", percentageNum) +  " *".repeat((int) (percentageNum * 100)) + "\n");
        }
        return this.finalresultString;
    }






    public int getNumberOfDies() {
        return numberOfDies;
    }

    public void setNumberOfDies(int numberOfDies) {
        this.numberOfDies = numberOfDies;
    }

    public int getNumberOfTosses() {
        return numberOfTosses;
    }

    public void setNumberOfTosses(int numberOfTosses) {
        this.numberOfTosses = numberOfTosses;
    }
}
