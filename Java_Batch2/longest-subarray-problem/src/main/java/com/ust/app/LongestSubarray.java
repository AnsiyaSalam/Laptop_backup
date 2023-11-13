package com.ust.app;

/**
 * Hello world!
 *
 */
public class LongestSubarray
{
    public SubarrayResult findLongestSubarray(int[] array) {
        return null;
    }
}


class SubarrayResult {
    private int[] subarray;
    private int startIndex;
    private int endIndex;

    public SubarrayResult(int[] subarray, int startIndex, int endIndex) {
        this.subarray = subarray;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int[] getSubarray() {
        return subarray;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }
}



