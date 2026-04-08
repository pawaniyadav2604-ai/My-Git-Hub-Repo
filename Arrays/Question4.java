import java.util.*;

class Question4 {
    public static int removeelement(int arr[] , int n , int value){
        int index= -1;
        
        for(int i =0 ;i< n; i++){
            if (arr[i] == value){
                index = i;
                break;
            }
        }
        if(index != -1) {
        for (int i = index ; i< n-1 ; i++){
            arr[i] = arr[i+1];
        }
        n--;
    }else {
        System.out.print(" Element not found. ");
    }
    return n;
}
    
public static void main(String[] args) {
    int arr[] = {1,0,2,0,4,0,5,0,6,0,7,0};
    int n = arr.length;
    
    Scanner sc= new Scanner (System.in);
    System.out.print("enter the element you want to delete :");
    int value = sc.nextInt();
    
       n = removeelement(arr, n, value);
       System.out.print(" the array after deleting the element :");
       for(int i=0 ; i<n; i++){
           System.out.print(arr[i] + " ");
       }
    }
}
