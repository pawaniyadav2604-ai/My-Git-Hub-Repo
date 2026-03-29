class Question3 {
    public static void movezeroes(int[] arr) {
        int j = 0; // position for next non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2};

        movezeroes(arr);

        // print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
