package com.sparta.ss;

import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {

        int[] ar1 = {1, 2, 3, 4};
        int[] ar2 = {5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(mergedArray(ar1, ar2)));
    }

    static int[] mergedArray(int[] a, int [] b){
        int alen =  a.length;
        int bLen = b.length;

        int[] merged = new int[alen + bLen];

        System.arraycopy(a, 0, merged, 0, alen);
        System.arraycopy(b, 0, merged, alen, bLen);

        return merged;
    }

}
