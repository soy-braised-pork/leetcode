package algorithm.dynamicprogram;

/**
 * @author zhulx
 **/
public class CoinChange {
    static int res = Integer.MAX_VALUE;

    public static int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return -1;
        }

        findWay(coins, amount, 0);

        // 如果没有任何一种硬币组合能组成总金额，返回 -1。
        if (res == Integer.MAX_VALUE) {
            return -1;
        }
        return res;
    }

    public static void findWay(int[] coins, int amount, int count) {
        if (amount < 0) {
            return;
        }
        if (amount == 0) {
            res = Math.min(res, count);
        }

        for (int i = 0; i < coins.length; i++) {
            findWay(coins, amount - coins[i], count + 1);
        }
    }


    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
