public class Question15 {

    public static void main(String[] args) {
        int arr[] = {10,11,12,13,14,15,16,17,18,19,20};

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            boolean isprime = true;

            if (num <= 1) {
                isprime = false;
            } else {
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        isprime = false;
                        break;
                    }
                }
            }

            if (isprime) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }
}