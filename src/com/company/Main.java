package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[10];
        arr[0] = 9;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 6;
        arr[4] = 0;
        arr[5] = 4;
        arr[6] = 3;
        arr[7] = 2;
        arr[8] = 1;
        arr[9] = 5;

        System.out.println(Arrays.toString(arr));


        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selection (int arr[])
    {

        for (int i = 0; i < arr.length-1; i++)
        {
            int min = i;

            for (int x = i+1; x < arr.length; x++)
                if (arr[x] < arr[min])
                    min = x;
                
            swap (arr,min,i);
        }


    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
