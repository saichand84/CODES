package algorithms.kadane;
//o(n)
class maxsubarray{
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1,-2,4,-5,7}));
    }
    public static int maxSubArray(int[] nums) {
        int csum = nums[0];
        int msum=csum;
        for(int i=1;i<nums.length;i++){
            csum = Math.max(csum+nums[i],nums[i]);
            msum = Math.max(csum,msum);

        }
        return msum;

    }
}