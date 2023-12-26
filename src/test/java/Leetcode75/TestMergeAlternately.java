package Leetcode75;

import LeetCode75.MergeStringAlternately2_1768;
import LeetCode75.MergeStringAlternately_1768;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author christinehsieh on 2023/12/25
 */
public class TestMergeAlternately {

    @Test
    public void testMergeAlternately(){
        MergeStringAlternately_1768 mergeStringAlternately = new MergeStringAlternately_1768();
        assertEquals("apbqrs", mergeStringAlternately.mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", mergeStringAlternately.mergeAlternately("abcd", "pq"));
        assertEquals("apbqcrds", mergeStringAlternately.mergeAlternately("abcd", "pqrs"));
    }


    @Test
    public void testMergeAlternately2(){
        MergeStringAlternately2_1768 mergeStringAlternately = new MergeStringAlternately2_1768();
        assertEquals("apbqrs", mergeStringAlternately.mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", mergeStringAlternately.mergeAlternately("abcd", "pq"));
        assertEquals("apbqcrds", mergeStringAlternately.mergeAlternately("abcd", "pqrs"));
    }


}
