/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 上午9:40
 */
public class BianLi{
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int x:arr ) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
