package String;

public class ContinuouspartofString {
    public static void main(String[] args) {
        // String str = "pakhi";
        // System.out.println(str.substring(2, 5));

        // String s = "physics";
        // for (int i = 2; i < 4; i++) {
        //     System.out.println(s.substring(i));
        // }

        // print all substring 

        String str = "abcd";
        for (int i = 0; i <=3; i++) {
            for (int j = i+1; j <=4; j++) {
                System.out.print(str.substring(i,j) + " ");
            }
        }
    }
}
