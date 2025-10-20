package algorithm.dynamicprogram;

/**
 * 509. 斐波那契数
 *
 * @author zhulx
 **/
public class FibonacciNumber {

    public static int fib(int n) {
        if (n < 2) return n;
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
