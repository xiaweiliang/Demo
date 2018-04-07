package sort;

import java.util.Arrays;

public class BucketSort {

    public static void main(String[] args) {
        BucketSort bucket = new BucketSort();
        int[] num = {1, 6, 9, 2, 5, 9,2, 3, 6, 4};
        int[] buckets = new int[20];
        System.out.println("排序前" + Arrays.toString(num));
        bucket.bucketSort(num, buckets);
        System.out.println("排序后" + Arrays.toString(buckets));
    }

    public int[] bucketSort(int[] nums, int[] buckts) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            buckts[nums[i]] = nums[i];
        }
        return buckts;
    }
}
