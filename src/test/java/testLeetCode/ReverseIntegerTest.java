package testLeetCode;

import org.junit.Assert;
import org.junit.Test;
import study.reverse_interger.ReverseIntegerSolution1;
import study.reverse_interger.ReverseIntegerSolution2;

import java.time.Instant;

/**
 * @author christinehsieh on 2023/5/4
 */
public class ReverseIntegerTest {

    @Test
    public void testReverseInteger(){

        ReverseIntegerSolution1 reverseInterger = new ReverseIntegerSolution1();

        long startTime = Instant.now().toEpochMilli();
        Assert.assertEquals(321, reverseInterger.reverse(123));
        Assert.assertEquals(-321, reverseInterger.reverse(-123));
        Assert.assertEquals(0, reverseInterger.reverse(2147483647));
        long endTime = Instant.now().toEpochMilli();

        ReverseIntegerSolution2 reverseInterger2 = new ReverseIntegerSolution2();

        long startTime2 = Instant.now().toEpochMilli();
        Assert.assertEquals(321, reverseInterger2.reverse(123));
        Assert.assertEquals(-321, reverseInterger2.reverse(-123));
        Assert.assertEquals(0, reverseInterger2.reverse(2147483647));
        long endTime2 = Instant.now().toEpochMilli();

        System.out.println("ReverseIntegerSolution1: " + (endTime - startTime) + " ms");
        System.out.println("ReverseIntegerSolution2: " + (endTime2 - startTime2) + " ms");


    }

}
