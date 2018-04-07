package other;

public class Fibo {
    public static void main(String[] args) {
        for (Integer i = 100; i <110 ; i++) {
            System.out.println(i.hashCode());
        }
    }
    public int getNum(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return getNum(i - 1) + getNum(i - 2);
    }
}
