package Leetcode75;

import LeetCode75.EatingBananas_875;
import LeetCode75.EatingBananas2_875;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author christinehsieh on 2023/12/25
 */
public class TestEatingBananas {

    @Test
    public void testEatingBananas(){
        EatingBananas_875 eatingBananas = new EatingBananas_875();
        assertEquals(4, eatingBananas.minEatingSpeed(new int[]{3,6,7,11}, 8));
        assertEquals(30, eatingBananas.minEatingSpeed(new int[]{30,11,23,4,20}, 5));
        assertEquals(23, eatingBananas.minEatingSpeed(new int[]{30,11,23,4,20}, 6));
        assertEquals(3, eatingBananas.minEatingSpeed(new int[]{805306368,805306368,805306368},1000000000));
    }

    @Test
    public void testEatingBananas2(){
        EatingBananas2_875 eatingBananas = new EatingBananas2_875();
        assertEquals(4, eatingBananas.minEatingSpeed(new int[]{3,6,7,11}, 8));
        assertEquals(30, eatingBananas.minEatingSpeed(new int[]{30,11,23,4,20}, 5));
        assertEquals(23, eatingBananas.minEatingSpeed(new int[]{30,11,23,4,20}, 6));
        assertEquals(3, eatingBananas.minEatingSpeed(new int[]{805306368,805306368,805306368},1000000000));
    }
}
