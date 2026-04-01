class Question6 {
    public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {11,12,13,14,15};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        // Copy first array
        for(int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }

        // Copy second array
        for(int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        // Print merged array
        System.out.println("Merged Array:");
        for(int num : merged) {
            System.out.print(num + " ");
        }
    }
}
}
