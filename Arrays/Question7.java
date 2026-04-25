import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the number of rows :" );
        int rows = sc.nextInt();

        System.out.print(" Enter the number of columns :" );
        int col = sc.nextInt();

        int matrix[][] = new int[rows][col];

         System.out.print(" Enter the matrix elemrnts: ");
         /// to take inputs
        for (int  i = 0; i < rows; i++) {
            for(int j = 0 ; j< col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
       //// to print outputt
         for (int  i = 0; i < rows; i++) {
            for(int j = 0 ; j< col ; j++){
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
