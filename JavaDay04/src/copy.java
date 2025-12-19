import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-19
 * Time: 下午2:23
 */
public class copy{
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        int[] copy=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            copy[i]=arr[i];
        }
        System.out.println(Arrays.toString(copy));
        int[] copy1=Arrays.copyOf(copy,copy.length*2);
        System.out.println(Arrays.toString(copy1));
        int[] copy2=Arrays.copyOfRange(copy,0,3);
        System.out.println(Arrays.toString(copy2));
    }
}
