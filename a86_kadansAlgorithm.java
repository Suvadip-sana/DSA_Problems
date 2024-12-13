public class a86_kadansAlgorithm {

    public static void kadansAlgorihm(int num[]){
        
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int maxElement = Integer.MIN_VALUE; // ** Create a maxElement variable, store -infinity 


        for(int i = 0; i < num.length; i++){

            currSum = currSum + num[i];

            if(currSum < 0){
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
            maxElement = Math.max(maxElement, num[i]); // ** Compare each element with maxElement and store maximum
        }


        // ** check if the final currsum is negative then return the max number, [Checking if the all array element is negetive.]
        if(currSum == 0){
            maxSum = maxElement;
        }


        System.out.println("Our maximum sub array sum is: " + maxSum);
    }
    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int num[] = {-2, -3, -4, -6, -2, -10, -5, -3};
        kadansAlgorihm(num);
    }    
}
