package BinarySearch;

public class Search2DMatrix {
    
    public int search(int[] nums, int target , int start , int end ) {
        while(start <= end){
            int mid = start + (end -start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][0] <= target && matrix[i][n-1]>=target){
                return search(matrix[i] , target , 0 , n-1) != -1;
            }
        }
        return false;
    }
}
