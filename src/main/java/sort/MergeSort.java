package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] num = {1, 5, 2, 9, 3, 7, 8};
        int[] num2 = {1, 5, 2, 9, 3, 7, 8};
        MergeSort sort = new MergeSort();
        System.out.println("排序前：" + Arrays.toString(num));
        sort.mergeSort(num, 0, num.length - 1);
        System.out.println("排序后：" + Arrays.toString(num));

    }

    public void mergeSort(int[] num, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            mergeSort(num, low, mid);
            mergeSort(num, mid + 1, high);
            this.merge(num, low, mid, high);
        }
    }

    public void merge(int[] num, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (num[i] < num[j]) {
                temp[k++] = num[i++];
            } else {
                temp[k++] = num[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = num[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = num[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int h = 0; h < temp.length; h++) {
            num[h + low] = temp[h];
        }
    }

}
