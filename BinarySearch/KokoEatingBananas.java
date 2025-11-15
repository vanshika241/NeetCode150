package BinarySearch;
public class KokoEatingBananas {
    
    public boolean canEatAll(int[] piles, int h  , int mid){
        int actualHours = 0;
        for(int num : piles){
            actualHours += num/mid;
            if(num % mid != 0)actualHours++;
        }
        return actualHours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int r = 0;
        for(int num : piles)r = Math.max(r , num);
        while(l<r){
            int mid = l+(r-l)/2;
            if(canEatAll(piles , h , mid)){
                   r = mid;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}
