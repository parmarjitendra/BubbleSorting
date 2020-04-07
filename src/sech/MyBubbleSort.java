package sech;

import java.util.Arrays;

public class MyBubbleSort {
    public void BubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++)
        {
            for (int j =0; j < arr.length - 1;j++)
            {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args)
    {
     int[] arr = {25,8,40,6,70,7};
     MyBubbleSort obj = new MyBubbleSort();
     obj.BubbleSort(arr);
        System.out.println("sorted array" + Arrays.toString(arr));
    }

}
