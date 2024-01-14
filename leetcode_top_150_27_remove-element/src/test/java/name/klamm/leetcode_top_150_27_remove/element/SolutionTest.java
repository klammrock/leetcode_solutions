package name.klamm.leetcode_top_150_27_remove.element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution instance = new Solution();
    private int[] nums;
    private int result;
    
    @Test
    public void testRemoveElement() {
        nums = new int[] { 3, 2, 2, 3 };

        result = instance.removeElement(nums, 3);

        assertEquals(2, result);
        assertArrayEquals(new int[] { 2, 2, 3, 3 }, nums);
    }
    
    @Test
    public void testRemoveElement2() {
        nums = new int[] { 3 };

        result = instance.removeElement(nums, 3);

        assertEquals(0, result);
        assertArrayEquals(new int[] { 3 }, nums);
    }
    
    @Test
    public void testRemoveElement3() {
        nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };

        result = instance.removeElement(nums, 2);

        assertEquals(5, result);
        assertArrayEquals(new int[] { 0, 1, 4, 0, 3, 2, 2, 2 }, nums);
    }
    
    @Test
    public void testRemoveElement4() {
        nums = new int[0];

        result = instance.removeElement(nums, 0);

        assertEquals(0, result);
        assertArrayEquals(new int[0], nums);
    }
    
    @Test
    public void testRemoveElement5() {
        nums = new int[] { 1, 2, 3, 4 };

        result = instance.removeElement(nums, 5);

        assertEquals(4, result);
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, nums);
    }
    
    @Test
    public void testRemoveElement6() {
        nums = new int[] { 4, 5 };

        result = instance.removeElement(nums, 5);

        assertEquals(1, result);
        assertArrayEquals(new int[] { 4, 5 }, nums);
    }
}
