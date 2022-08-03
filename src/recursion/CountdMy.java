package recursion;

public class CountdMy {

    public static void main(String[] args) {
        countDown(5);
    }

    private static void countDown(int i) {
        if (i == 0) {
            return;
        } else {
            System.out.println(i);
            countDown(i - 1);
        }
    }
}
