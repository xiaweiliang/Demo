package other;

public class FullArray {
    public void Perm(int list[], int start, int end) {
        if (start == end) {
            for (int i = 0; i <= end; i++){
                System.out.print(list[i]);
            }
            System.out.println();
        } else {
            for (int i = start; i <= end; i++) {
                // 从固定的数后第一个依次交换
                Swap(list, start, i);
                Perm(list, start + 1, end);
                // 这组递归完成之后需要交换回来
                Swap(list, start, i);
            }
        }
    }
    public void Swap(int[] list, int i, int j) {
        int t = list[i];
        list[i] = list[j];
        list[j] = t;
    }
    public static void main(String[] args) {
        FullArray d = new FullArray();
        int[] arr = {1,2,3};
        d.Perm(arr, 0, 2);
    }
}

