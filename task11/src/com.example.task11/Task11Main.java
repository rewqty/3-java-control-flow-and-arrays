package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //int[] arr = {};
        //swap(arr);
        //System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0){
            return;
        }
        int min = arr[0];
        int posMin = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                posMin = i;
            }
        }
        arr[posMin] = arr[0];
        arr[0] = min;
    }

}