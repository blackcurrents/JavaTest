import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 下午7:21
 */
public class bubble {
    public static void main(String[] args) {
        int[] arr=new int[]{11,32,45,32,65,22,12};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  bubble(int[] arr){
        for(int j=0;j<arr.length;j++) {
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
