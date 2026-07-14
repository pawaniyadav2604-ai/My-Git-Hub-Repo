package GreedyAlgorithm;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int tendoller = 0;
        int fivedoller = 0;
        //int twentydoller = 0;

        for(int i = 0 ; i<bills.length ; i++){
            if(bills[i] == 5){
                fivedoller++;
            }else if(bills[i] == 10){
                if( fivedoller > 0){
                    fivedoller--;
                    tendoller++;
                }else{
                    return false;
                } 
                }else {
                    if(fivedoller > 0 && tendoller> 0){
                        tendoller--;
                        fivedoller--;
                    }else if(fivedoller > 2){
                        fivedoller -= 3;
                    }else{
                        return false;
                    }
                }

            }
            return true;
        }
        

    

    public static void main(String[] args) {
        int bills[] = {5,5,5,10,15};

        System.out.println(lemonadeChange(bills));
        
    }
}
