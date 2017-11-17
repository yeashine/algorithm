package sort;

import sort.bubble.Bubble;
import sort.divide.DivideAndConquer;
import sort.insertion.InsertionSort;

/**
 * @autthor Mchi
 * @since 2017/11/16
 */

public class Sort {

    static int[] arr = {5,3,4,7,1,8,2,6,0};
    //static int[] arr = {11,12,1,14,15,5,6,7,8,9,10,1,3,0,0,0,0};
    //static int[] arr = {8,9,11,10,0,1,2,1};
    public static void main(String[] args) {

      //  Bubble.sort(arr);
        //InsertionSort.sort(arr);
        int r = arr.length-1;
        int p = 0;
        int q = (r+p)/2;
        print();
        DivideAndConquer.mergeSort(arr,p,r);
        print();

    }

    static void print(){

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}