package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaPRoblem {
    public static void main(String[] args) {
        int n = 8, m= 8;
        Integer Costver[] = {2,1,3,1,4,3,1,5}; //m-1
        Integer Costhor[] = {4,1,2,4,3,5,1,3}; //n-1

        Arrays.sort(Costver ,Collections.reverseOrder());
        Arrays.sort(Costhor,Collections.reverseOrder());

        int h = 0, v = 0 ;
        int hp =1, vp = 1;
        int cost = 0;

        while (h < Costhor.length && v < Costver.length) {
            // vertical < hor
            if (Costver[v] <= Costhor[h]) { //horizontal cut
                cost += (Costhor[h] * vp);
                hp++;
                h++;
            }else{
                cost += (Costver[v] * hp);
                vp++;
                v++;
            }
        }

        while (h< Costhor.length) {
            cost += (Costhor[h] * vp);
                hp++;
                h++;
        }

        while (v< Costver.length) {
            cost += (Costver[v] * hp);
                vp++;
                v++;
        }

        System.out.println("min cost of cuts =" + cost);
    }
}
