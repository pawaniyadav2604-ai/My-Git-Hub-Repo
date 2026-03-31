public class Question5 {
    public static void evenodd(int arr[]){
        System.out.print (" even numbers are ");
        for(int i =0 ; i< arr.length ;i++){ 
        if(arr[i] % 2 == 0){
            System.out.print( arr[i] + " ");
        }
    }
    System.out.println();
    System.out.print(" odd numbers are : ");
    for (int i = 0; i < arr.length; i++) {
        
        if (arr[i] %2 != 0){
            System.out.print( arr[i] + " ");
        }
    }

}
    public static void main(String[] args) {
        int arr[] = {10,11,12,13,14,15};
        evenodd(arr);
    }
}
