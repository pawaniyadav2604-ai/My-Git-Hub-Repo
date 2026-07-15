package GreedyAlgorithm;

public class Jumpgame1 {

    public static boolean Jumpgame(int[] arr){
        int maxindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > maxindex) {
                return false;
            }
            maxindex = Math.max(maxindex, i + arr[i]);
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,0,0,4,0,1};

        System.out.println(Jumpgame(arr));
    }
}
