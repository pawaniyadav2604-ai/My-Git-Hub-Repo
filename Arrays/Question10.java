class Question10 {
     public static int secondlargest(int arr[]){
        int max= 0;
        int min=-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max){
                min = max;
                max = arr[i];
            } else if (arr[i]> min && arr[i] != max) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,9,3,10};
        int result = secondlargest(arr);
        System.out.println(result);
    }
}
