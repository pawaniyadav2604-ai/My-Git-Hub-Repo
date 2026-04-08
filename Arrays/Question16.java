class Question16 {
    public static int linear(int[] arr, int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 4;
        int array= linear(arr, target);
        if(array== -1){
            System.out.println(" Target not found");
        }
        else {
            System.out.println("Target found at index:" + array);
        }
    }
}
