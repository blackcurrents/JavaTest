/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 下午3:50
 */
public class ShuZufanhuizhi {
    public static int[] fac() {
        int[] ret = new int[2];
        ret[0] = 1;
        ret[1] = 2;
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = fac();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
