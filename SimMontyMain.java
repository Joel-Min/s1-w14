public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(100000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
         SimMonty m = new SimMonty();
         int countRuns = 0;
         myWinTotal = 0;
         int x = 0;
         int a =0;
         int strategy = 2;
         //you write this...
        while(x< numGames){
            a += m.playGame(strategy);
            x ++;


        }
        myWinTotal = a;
        //  }
         //stop here...
        System.out.println("your win percetage" +(myWinTotal * 1.0)/numGames);
    }
    
    
}      
