package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        int[] num = {2, 1, 5, 7, 9, 8};
        System.out.println("排序前：" + Arrays.toString(num));
        bubble.sort(num);
        System.out.println("排序后：" + Arrays.toString(num));
    }

    //排序
    public void sort(int[] num) {
        boolean flag = true;//冒泡优化，设置标志位，有数据交换则执行，否则不继续执行
        for (int i = num.length - 1; i > 0 && flag; i--) {
            flag = false;
            for (int j = 0; j < i; j++) {
                if (num[j] > num[j + 1]) {
                    swap(num, j, j + 1);
                    flag = true;
                }
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
