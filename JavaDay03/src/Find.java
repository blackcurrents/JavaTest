/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-19
 * Time: 上午9:03
 */
public class Find {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,5,6};
        System.out.println(find(arr, 10));
    }

    public static int find(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;  // 表示没有找到
    }

}
