package sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        ShellSort shell = new ShellSort();
        int[] num = {2, 1, 5, 7, 9, 8, 10, 23, 3, 0, 6};
        System.out.println("排序前：" + Arrays.toString(num));
        shell.sort(num);
        System.out.println("排序后：" + Arrays.toString(num));
    }

    //希尔排序
    public void sort(int[] data) {
        int j = 0;
        int temp = 0;
        for (int increment = data.length / 2; increment > 0; increment /= 2) {
            System.out.println("increment:" + increment);
            for (int i = increment; i < data.length; i++) {
                temp = data[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    if (temp < data[j]) {
                        data[j + increment] = data[j];
                    } else {
                        break;
                    }
                }
                data[j + increment] = temp;
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
