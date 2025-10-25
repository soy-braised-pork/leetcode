package algorithm.dynamicprogram;

/**
 * @author zhulx
 * 1716. 计算力扣银行的钱
 **/
public class CountMoneyInBank {
    public static int totalMoney(int n) {
        int week = 1, day = 1;
        int res = 0;
        for (int i = 1; i < n; ++i) {
            res += week + day - 1;
            ++day;
            if (day == 8) {
                day = 1;
                ++week;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(totalMoney(8));
    }
}
