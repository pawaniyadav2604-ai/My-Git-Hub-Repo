class Question9 {
    public static int duplicate(int [] arr){
        int remove = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[remove] != arr[i]){
                remove++;
                arr[remove] = arr[i];
            }
        }
        return remove+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,4,4,4,5};
        System.out.print(" The original array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+" ");
        }
        int rd = duplicate(arr);
        System.out.println();
        System.out.print("After the removal of duplicate :");
        for (int i = 0; i < rd; i++) {
            System.out.print( arr[i] + " ");
        }
    }
}
