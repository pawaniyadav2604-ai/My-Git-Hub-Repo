import java.util.Scanner;
class Question2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number of element you want to enter :" );
        float number = sc.nextFloat();
        int sum =0;

        System.out.println(" enter all elements :");
        for (int i = 0; i < number; i++) {
            float element = sc.nextFloat();
             sum+= element;
        }
        System.out.println("the sum of all elements is : "  +sum);
        System.out.println("the average of the alements is : " + sum/number);
    }
}
