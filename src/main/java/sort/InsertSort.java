package sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        InsertSort insert = new InsertSort();
        int[] num = {2, 1, 5, 7, 9, 8};
        System.out.println("排序前：" + Arrays.toString(num));
        insert.sort(num);
        System.out.println("排序后：" + Arrays.toString(num));
    }

    public void sort(int[] num) {
        for (int i =1; i < num.length; i++) {
            int temp=num[i];
            int k=i;
            for (int j = i-1 ; j >= 0; j--) {
                //当要插入排序的值小于前一个值，前一个值向后移，不断比较类推
                if (num[j] >num[i]) {
                    num[j+1]=num[j];
                    k--;
                }

            }
            //插入要插入的位置
            num[k]=temp;
        }
    }
}
