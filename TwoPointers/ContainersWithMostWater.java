package TwoPointers;

public class ContainersWithMostWater {
    
    public int maxArea(int[] height) {
        int maxi = 0;
        int n = height.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int h = Math.min(height[i] , height[j]);
        //         int w = j-i;
        //         maxi = Math.max(maxi , h*w);
        //     }
        // }

        int i=0;
        int j = n-1;
        while(i<j){
            int h = Math.min(height[i] , height[j]);
                 int w = j-i;
                maxi = Math.max(maxi , h*w);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxi;
    }
}
