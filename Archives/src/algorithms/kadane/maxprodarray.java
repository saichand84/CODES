package algorithms.kadane;

public class maxprodarray {
    public static void main(String[] args) {
        System.out.println( maxProduct(new int[]{2,3,-2,4}));
    }
    public static int maxProduct(int[] nums) {
        int cs = 1;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cs=1;
            for(int j=i;j<nums.length;j++){
                cs = cs*nums[j];
                if(ms<cs)
                    ms=cs;
            }

        }
        return ms;
    }
}
