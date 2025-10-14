package basic.array;

import java.util.Arrays;

/**
 * @author zhulx
 **/
public class MyArray {
    // 尾部增
    private static int[] addTail(int[] arr, int num) {
        int length = arr.length;
        int[] arrNew = new int[length + 1];
        for (int i = 0; i <= length - 1; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[length] = num;
        return arrNew;
    }

    // 首部增
    private static int[] addHead(int[] arr, int num) {
        int length = arr.length;
        int[] arrNew = new int[length+1];
        arrNew[0] = num;
        for (int i = 1; i <= length ; i++) {
            arrNew[i] = arr[i - 1];
        }
        return arrNew;
    }

    // 中间增
    private static void addMiddle(int[] arr, int num, int i) {

    }

    // 删

    // 改

    // 查

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] arrTail = addTail(arr, 5);
        System.out.println("尾部增------------------" + Arrays.toString(arrTail));

        int[] arrHead = addHead(arr, 0);
        System.out.println("首部增------------------" + Arrays.toString(arrHead));
    }
}
