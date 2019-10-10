package offer.pack;

import java.util.*;

public class Solution {
    public static int[] mergeSort(int[] A, int n) {
        // write code here
        if(A == null || n < 2){
            return A;
        }
        process(A, 0, n-1);
        return A;
    }

    private static void process(int[] A, int left, int right) {
        if(left >= right){
            return ;
        }

        int mid = left + (right - left)/2;
        process(A, left, mid);
        process(A, mid+1, right);
        merge(A, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right) {


        int[] arr = new int[right - left + 1];
        int index = 0, l = left, r = mid + 1;
        while (l <= mid && r <= right){
            if(a[l] < a[r]){
                arr[index++] = a[l++];
            }else{
                arr[index++] = a[r++];
            }
        }
        while(l <= mid){
            arr[index++] = a[l++];
        }
        while(r <= right){
            arr[index++] = a[r++];
        }
        for (int i = 0; i < arr.length; i++) {
            a[left + i] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,3};
        mergeSort(arr, 6);
    }
}