public class Questions {
    public static int main(String[] args) {
        int arr[] = {1,3,2,4,5,2,6};
        int target = 2;
        int index = 0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1 ; j--) {
                
                if (arr[i] == target) {
                    return arr[index];
                }
            }
        }
        return index;
    }
}
