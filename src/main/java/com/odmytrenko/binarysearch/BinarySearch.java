package com.odmytrenko.binarysearch;

public class BinarySearch {

    public static int find(int[] array, int target) {
        int result = -1;
        if (array != null) {
            int low = 0, high = array.length, mid;
            while (low < high) {
                mid = (low + high) >>> 1;
                if (target == array[mid]) {
                    return mid;
                } else {
                    if ((array[low] < array[high - 1] && target < array[mid]) || (target < array[mid] &&
                            target > array[low] || target > array[mid] && target > array[high - 1])) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return result;
    }
}
