package GreedyAlgorithm;

import java.util.Arrays;

public class Shortestjobfirst {
    public static void main(String[] args) {
        int bt[] = {4,3,7,1,2,6,7};
        Arrays.sort(bt);

        int time = 0;
        int waitingtime = 0;

        for (int i = 0; i < bt.length - 1; i++) {
             waitingtime += time;
             time += bt[i];
        }
        double ans = (double) waitingtime/bt.length;
        System.out.println(ans);
    }
}
