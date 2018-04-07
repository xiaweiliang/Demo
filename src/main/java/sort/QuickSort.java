package sort;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] num = {4, 5, 8, 1, 2, 9, 12, 55};
        QuickSort quick = new QuickSort();
        System.out.println("排序前" + Arrays.toString(num));
        quick.sort(0, 7, num);
        System.out.print("排序后" + Arrays.toString(num));
    }

    //排序
    public void sort(int low, int hight, int[] num) {
        int pivot;
        if (hight > low) {
            pivot = partition(low, hight, num);
            sort(low, pivot - 1, num);
            sort(pivot + 1, hight, num);
        }
    }

    //分区
    public int partition(int low, int hight, int[] num) {
        int pivot = num[low];
        int left = low;
        int right = hight;
        while (left < right) {
            while (pivot >= num[left]) {
                left++;
            }
            while (pivot < num[right]) {
                right--;
            }
            if (left < right) {
                swap(num, left, right);
            }
        }
        num[low] = num[right];
        num[right] = pivot;
        return right;
    }

    //交换
    public static void swap(int[] num, int left, int right) {
        int temp = num[left];
        num[left] = num[right];
        num[right] = temp;
    }
}
