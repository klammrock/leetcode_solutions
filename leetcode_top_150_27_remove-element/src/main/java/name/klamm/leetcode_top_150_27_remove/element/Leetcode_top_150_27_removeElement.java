package name.klamm.leetcode_top_150_27_remove.element;

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0] == val ? 0 : 1;
        }
        
        int searchIndex = nums.length - 1;
        boolean wasRemove = false;
        
        for (int i = 0; i < nums.length && i < searchIndex; ++i) {
            if (nums[i] == val) {
                wasRemove = true;
                
                for (; searchIndex > i; --searchIndex) {
                    if (nums[searchIndex] != val) {
                        int temp = nums[searchIndex];
                        nums[searchIndex] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
            }
        }
        
        return wasRemove ? searchIndex : (nums[searchIndex] == val ? nums.length - 1 : nums.length);
    }
}

public class Leetcode_top_150_27_removeElement {
    public static void main(String[] args) {
    }
}
