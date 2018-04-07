package sort;

import java.util.ArrayList;

public class MergeArray {
    public static ArrayList<Integer> mergeArrays(int[] arrayOne, int[] arrayTwo){
        int arrayOneLen = arrayOne.length;
        int arrayTwoLen = arrayTwo.length;
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        int i= 0, j=0;

        while(i<arrayOneLen || j<arrayTwoLen){
            if(i==arrayOneLen && j<arrayTwoLen){
                resultArray.add(arrayTwo[j]);
                j++;
            }else if(i<arrayOneLen && j==arrayTwoLen){
                resultArray.add(arrayOne[i]);
                i++;
            }else{
                if(arrayOne[i]<=arrayTwo[j]){
                    resultArray.add(arrayOne[i]);
                    i++;
                }else if(arrayOne[i]>arrayTwo[j]){
                    resultArray.add(arrayTwo[j]);
                    j++;
                }
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] arrA = {1,3,5,7,8,9,11,12};
        int[] arrB = {2,4,6,8,10,12,13};

        ArrayList<Integer> arrList = mergeArrays(arrA,arrB);

        for(Integer intItem:arrList){
            System.out.print(intItem);
        }
    }
}
