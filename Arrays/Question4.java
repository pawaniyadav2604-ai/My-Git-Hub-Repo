import java.util.*;

class Question4 {

    public static int deleteElement(int[] arr, int n, int key) {
        int i;

        // find the element
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                break;
            }
        }

        // if element not found
        if (i == n) {
            System.out.println("Element not found");
            return n;
        }

        // shift elements left
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        return n - 1; // new size
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.print("Enter element to delete: ");
        int key = sc.nextInt();

        n = deleteElement(arr, n, key);

        System.out.println("Array elements after deleting the element:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}