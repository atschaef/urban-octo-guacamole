package com.octoguac.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EuclidAlgorithmTest {
    EuclidAlgorithm algorithm = new EuclidAlgorithm();

    @Test
    public void gcdRecursive_test() {
        assertEquals(1, algorithm.gcdRecursive(25, 1));
        assertEquals(5, algorithm.gcdRecursive(25, 10));

        assertEquals(5, algorithm.gcdRecursive(5, 5));
        assertEquals(1, algorithm.gcdRecursive(16, 3));

        assertEquals(25, algorithm.gcdRecursive(25, 0));
        assertEquals(5, algorithm.gcdRecursive(0, 5));

        assertEquals(0, algorithm.gcdRecursive(-5, 5));
        assertEquals(0, algorithm.gcdRecursive(5, -5));
    }

    @Test
    public void gcd_test() {
        assertEquals(1, algorithm.gcd(25, 1));
        assertEquals(5, algorithm.gcd(25, 10));

        assertEquals(5, algorithm.gcd(5, 5));
        assertEquals(1, algorithm.gcd(16, 3));

        assertEquals(25, algorithm.gcd(25, 0));
        assertEquals(5, algorithm.gcd(0, 5));

        assertEquals(0, algorithm.gcd(-5, 5));
        assertEquals(0, algorithm.gcd(5, -5));
    }
}