package com.practice.array;

public class NextPermutation {

    public void nextPermutation(int[] A) {
        if (A == null || A.length <= 1) return;
        int i = A.length - 2;

        // finding longest non-increasing suffix
        while (i >= 0 && A[i] >= A[i + 1]) i--;
        // i th element is pivot

        if (i >= 0) {
            int j = A.length - 1;

            // find rightmost successor to pivot in the suffix
            while (A[j] <= A[i]) j--;

            // swap with pivot
            swap(A, i, j);
        }

        // reverse the suffix
        reverse(A, i + 1, A.length - 1);
    }

    private void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    private void reverse(int[] A, int i, int j) {
        while (i < j) swap(A, i++, j--);
    }
}
