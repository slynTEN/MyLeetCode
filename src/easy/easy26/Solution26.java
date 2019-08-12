package easy.easy26;

/**
 * Created by teds on 2019/2/1.
 */
public class Solution26 {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                if(nums[i] == nums[j]) {
                    int k = j;
                    while(k + 1 < length) {
                        nums[k] = nums[k+1];
                        k++;
                    }
                    length--;
                    j--;
                }
            }
        }
        return length;
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
