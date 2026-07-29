package SlidingWindow;

public class minSubArrayLen {
    static void main(String[] args) {
int arr[]={1,2,4,4};
int target=4;
        System.out.println(minSubArrayLen(target, arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int result=Integer.MAX_VALUE;
        int sum=0;
        while(high<nums.length){
            sum=sum+nums[high];
            while (sum>=target){

                int len=high-low+1;
                result=Math.min(result,len);
                sum=sum-nums[low];
                low++;

            }
            high++;
        }

return result == Integer.MAX_VALUE ? 0 : result;
    }

}
