import java.util.ArrayList;

public class Container {
    public static int Containerwithmostwater(ArrayList<Integer> height){
        int n = height.size();

        int i = 0 ;
        int j = n-1;

        int maxwater = 0 ;

        while (i < j) {
            int w = j - i;
            int h = Math.min(height.get(i), height.get(j));
            int area = w * h;

            maxwater = Math.max(maxwater, area);

            if (height.get(i) > height.get(j)) {
                j--;
            }else{
                i++;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

     height.add(1);
     height.add(8);
     height.add(6);
     height.add(2);
     height.add(5);
     height.add(4);
     height.add(8);
     height.add(3);
     height.add(7);
     

     System.out.println("the max area which contains water is :" + Containerwithmostwater(height));
    }
}
