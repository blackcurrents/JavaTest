import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-19
 * Time: 下午2:40
 */
public class Erwei1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
//        for(int i=0;i<2;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y+" ");
            }
        }
    }
}
//四种打印方式
