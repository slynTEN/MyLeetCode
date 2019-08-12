package easy.easy26;

/**
 * Created by teds on 2019/2/2.
 */
public class Improve26 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        assert (removeDuplicates(nums) == 2);
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        assert (removeDuplicates(nums2) == 5);
        int[] nums3 = {1,1};
        assert (removeDuplicates(nums3) == 1);
    }
}
