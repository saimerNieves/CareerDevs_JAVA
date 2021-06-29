package com.company;

import java.util.Arrays;

public class Difference {

    private int[] elements;
    public int maximumDifference;

    Difference (int [] elements) {
        this.elements = elements;
    }

    //          Runtime: O(n)
    // Space Complexity: O(1)
    void computeDifference() {
        int max = Arrays.stream(elements).max().getAsInt();
        int min = Arrays.stream(elements).min().getAsInt();
        maximumDifference = max - min ;
    }
} // End of Difference class
