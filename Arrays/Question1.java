class Question1 {
    public static int missing(int arr[]){
        // last element of the array which is 7;
        int n = arr[arr.length-1];
        int formula = n*(n+1)/2;
        int actualsum = 0;


        for (int i = 0; i < arr.length; i++) {
            // find sum of all array
            actualsum +=  arr[i];
        }
        int missing = formula - actualsum;
        return missing;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,5,6,7};
        System.out.println(missing(arr));
    }
}
