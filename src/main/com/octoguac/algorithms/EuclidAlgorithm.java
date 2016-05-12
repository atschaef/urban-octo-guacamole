package com.octoguac.algorithms;

/*
 * This method takes two positive integers and finds their gcd using Euclid's algorithm
 * Negative numbers return 0;
 *
 */
public class EuclidAlgorithm {
    public int gcdRecursive(int m, int n) {
        if (m < 0 || n < 0) {
            return 0;
        }

        return n == 0 ? m : gcdRecursive(n, m % n);
    }

    public int gcd(int m, int n) {
        if (m < 0 || n < 0) {
            return 0;
        }

        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
}