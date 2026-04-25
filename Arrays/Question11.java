import java.util.Scanner;

class Question11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Input elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } 
            else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found");
        } else {
            System.out.println("Second smallest element in: " + secondMin);
        }
        sc.close();
    }

} 


