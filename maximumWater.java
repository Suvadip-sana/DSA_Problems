public class maximumWater {

    // Approach 1 with time complexity O(n^2)
    public static void largeContainer(int arr[]){
        int maxArea = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int minHight = Math.min(arr[i], arr[j]);
                int width = j - i;

                int area = minHight * width;

                maxArea = Math.max(maxArea, area);
            }
        }

        System.out.println("The maximum water can be stored is: " + maxArea);
    }


    // Approach 2 with time complexity O(n)
    public static void largeContainer2(int arr[]){
        int l = 0;
        int r = arr.length - 1;
        int maxArea = 0;

        while (l < r) {
            int minHeight = Math.min(arr[l], arr[r]);
            int w = r - l;
            int area = minHeight*w;

            maxArea = Math.max(maxArea, area);

            if(arr[l] < arr[r]){
                l++;
            }
            else{
                r--;
            }
        }

        System.out.println("Maximum water can be store as: " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        largeContainer2(arr);
    }
    
}
