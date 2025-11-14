package TwoPointers;

public class TrappingRainWater {
    
    public int trap(int[] height) {
        int n = height.length;
        int totalWater = 0;
        // for(int i=0;i<n;i++){
        //     int leftMax = height[i];
        //     int rightMax = height[i];
        //     for(int j=0;j<i;j++){
        //         leftMax = Math.max(leftMax, height[j]);
        //     }

        //     for(int j=i+1;j<n;j++){
        //         rightMax = Math.max(rightMax, height[j]);
        //     }
        //     totalWater += Math.min(rightMax , leftMax)-height[i];

        // }

        int leftMax = 0;
        int rightMax = 0;
        int i=0;
        int j = n-1;
        while(i<j){
            leftMax = Math.max(leftMax , height[i]);
            rightMax = Math.max(rightMax , height[j]);

            if(leftMax<rightMax){
                totalWater += leftMax-height[i];
                i++;
            }
            else{
                totalWater += rightMax-height[j];
                j--;
            }

        }
         return totalWater;
    }
}
