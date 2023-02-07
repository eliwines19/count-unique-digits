public class CountUniqueDigits {

    static void printUniqueDigits(int[][] arr) {

        // iterate through input array
        for (int i = 0; i < arr.length; i++) {
            
            // establish start and end of range
            int start = arr[i][0];
            int end = arr[i][1];
            int count = 0;

            // iterate through the range of numbers
            for (int j = start; j <= end; j++) {

                // if number is unique increment count
                if (isUnique(j) == true) {
                    count++;
                }

            }

            // print total count of unique numbers
            System.out.println(count);

        }

    }

    static boolean isUnique(int num) {
        // initialize count as 0
        int count = 0;

        // compare each digit with others
        // starts comparing rightmost digit with leftmost digit
        while (num > 0) {

            // get rightmost digit
            int digit = num % 10;
            // remove the rightmost digit
            num = num / 10;
            // assing rightmost digit to temp variable
            int temp = num;

            // check if rightmost digit matches leftmost digits
            while (temp > 0) {

                // if rightmost digit matches with any leftmost digits increase count by 1
                if (temp % 10 == digit) {
                    count = 1;
                    break;
                }

                // remove rightmost digit from temp and get updated temp value
                temp = temp / 10;

            }
        }

        if (count == 0) {return true;}
        return false;
    }

    public static void main(String args[]) {
        int arr[][] = {{1, 10}, {1, 20}, {30, 45}};
        printUniqueDigits(arr);
    }
}