package ArraysAndHashing;

public class ProductExceptSelf {
    
     public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        // for(int i=0;i<n;i++){
        //     int prod = 1;
        //     for(int j=0;j<n;j++){
        //         if(j != i)prod *= nums[j];
        //     }
        //     ans[i] = prod;
        // }

        int left[] = new int[n];
        //int right[] = new int[n];
        left[0] = 1;
        //right[n-1] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        // for(int i=n-2;i>=0;i--){
        //     right[i] = right[i+1]*nums[i+1];
        // }
        int suff = 1;
        for(int i=n-1;i>=0;i--){
            ans[i] = left[i]*suff;
            suff *= nums[i];
        }
        return ans;
    }
}
