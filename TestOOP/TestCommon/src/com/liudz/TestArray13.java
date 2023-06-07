package com.liudz;

import java.util.Arrays;

/*

Arrays 工具类

 */
public class TestArray13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.asList(arr));

        int[] arr2 = {3,4,21,3,55,1,3,6,244,2};
        int[] emptyarry = new int[5];
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.binarySearch(arr2, 4));

        int[] arr3 = {1,2,3,4};
        //Copy 数组复制
        int[] arr4 = Arrays.copyOf(arr3,5);
        System.out.println(Arrays.toString(arr4));

        int[] arr3copy = {1,2,3,4};
        System.out.println(Arrays.equals(arr3,arr3copy));

        int[] arr5 = Arrays.copyOfRange(arr4,1,3);
        System.out.println(Arrays.toString(arr5));

        Arrays.fill(arr4,10);
        System.out.println(Arrays.toString(arr4));

    }
}
