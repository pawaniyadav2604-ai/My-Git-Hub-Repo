package GreedyAlgorithm;

import java.util.Arrays;

public class AssignCookies {

    // public static int findContentChildren(int[] greed, int[] size) {
    //     int n = greed.length;
    //     int m = size.length;
    //     int leftpointer = 0, rightpointer = 0;

    //     Arrays.sort(greed);
    //     Arrays.sort(size);

    //     while(leftpointer < m && rightpointer < n){
    //         if(greed[rightpointer] <= size[leftpointer]){
    //             rightpointer = rightpointer+1;
    //         }
    //         leftpointer = leftpointer + 1;
    //     }

    //     return rightpointer;
    // }
public static int findContentChildren(int[] greed, int[] size) {
    Arrays.sort(greed);
    Arrays.sort(size);

    int child = 0;
    int cookie = 0;

    while (child < greed.length && cookie < size.length) {
        if (size[cookie] >= greed[child]) {
            child++;
        }
        cookie++;
    }

    return child;
}


    public static void main(String[] args) {
        int greed[] = {1,5,3,3,4};
        int size[] = {4,2,1,2,1,3};
         System.out.println(findContentChildren(greed, size));
        
    }
}