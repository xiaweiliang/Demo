package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort select = new SelectionSort();
        int[] num = {2, 1, 5, 7, 9, 8};
        System.out.println("排序前：" + Arrays.toString(num));
        select.sort(num);
        System.out.println("排序后：" + Arrays.toString(num));
    }

    public void sort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int min = i;//最小数
            for (int j = i+1; j < num.length; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(num, i, min);//交换
            }
        }
    }

    //交换数字
    public void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
