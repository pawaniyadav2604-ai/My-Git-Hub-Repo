public class Question13 {
    public static void main(String[] args) {
        int arr[] = {20,-10,-15,00,-85,25,98,00};
        int zerocount = 0;
        int positivecount = 0;
        int negcount = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zerocount++;
            }else if ( arr[i] > 0){
                positivecount++;
            }else{
                negcount++;
            }
        }

        System.out.println(" positive numbers are :" + positivecount);
        System.out.println(" negative numbers are :" + negcount);
        System.out.println(" zero count are : " +  zerocount);
    }
}
