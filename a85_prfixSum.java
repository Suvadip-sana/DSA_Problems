public class a85_prfixSum {

    public static void prefixSum(int arr[]){

        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length]; // Create a new array, Its length is same as arr length



        prefix[0] = arr[0];

        // for calculate the prefix array[add ith index value of arr into the prefix array i-1 element]
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }




        for(int i = 0; i < arr.length; i++){

            for(int j = i; j < arr.length; j++){

                if(i == 0){
                    sum = prefix[j];
                    System.out.println("Sum is: " + sum);
                }
                else{
                    sum =  prefix[j] - prefix[i-1];
                    System.out.println("Sum is: " + sum);
                }

                if(sum > largest){
                    largest = sum;
                }
                
            }

        }

        System.out.println("The largest sum of sub arrays is: " + largest);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefixSum(arr);
    }    
}
