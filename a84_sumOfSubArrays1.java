public class a84_sumOfSubArrays1 {

    public static void sumOfSubArrays(int arr[]) {

        int ta = 0; // For calculating total number of subarrays
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // Outer loop - At first stay on index 0 which one is start then update

            for (int j = i; j < arr.length; j++) { // inner loop - At first stay on index 0 which one is end then
                                                   // update, (first present in index 0 because single element is also
                                                   // sub arrays.)

                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];

                    if (smallest > sum) {
                        smallest = sum;
                    }
                    if (largest < sum) {
                        largest = sum;
                    }
                }

                System.out.println();

                System.out.println("Sum = " + sum);
                sum = 0;
                ta++;

            }
            System.out.println();

        }

        System.out.println("total number of sub array is: " + ta);
        System.out.println("The largest sum of the sub array is: " + largest);
        System.out.println("The smallest sum of the sub array is: " + smallest);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        sumOfSubArrays(arr);
    }    
}
