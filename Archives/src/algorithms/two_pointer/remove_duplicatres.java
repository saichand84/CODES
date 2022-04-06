package algorithms.two_pointer;
class remdup{
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}
));

    }
    public static int removeDuplicates(int[] nums) {
        int l = 0, count = 1, cur = nums[0];
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] == cur) {
                count++;
            } else {
                count = 1;
                cur = nums[r];
            }
            if (count <= 2) {
                l++;
                nums[l] = nums[r];
            }
        }

        return l + 1;
    }
}