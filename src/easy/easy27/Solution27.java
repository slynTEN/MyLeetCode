package easy.easy27;

/**
 * Created by teds on 2019/2/12.
 */
public class Solution27 {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        assert (removeElement(nums, 3) == 2);
        int[] nums2 = {0,1,2,2,3,0,4,2};
        assert (removeElement(nums2, 2) == 5);
    }
}
