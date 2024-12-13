public class a87_trappedWater {

    public static int trappedWater(int height[]){

        int n = height.length;

        // Calculate the left max boundary -> array 
        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]); // here i-1 because the loop run from start and we have to check present values previous value 
        }


        // Calculate the right max boundary -> array (Start calculate from end of the array)
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]); // here i+1 because the loop run from end and we have to check present values previous value 
        }


        int trapWater = 0; 
        // Run a loop
        for(int i = 0; i < n; i++){

            // Calculate waterLevel = min(left max boundary, right max boundary)
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);

            // trapped water = waterLevel - height[i]
            trapWater += (waterLevel - height[i]);
        }

        return trapWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int result = trappedWater(height);

        System.out.println("The trapped water among this height bar is: " + result);
    }    
}
