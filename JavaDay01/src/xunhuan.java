import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-16
 * Time: 下午5:18
 */
public class xunhuan {
    public static void main(String[] args) {
        int n=0;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for(int j=0;j<=n;j++){
            int ret=1;
            for(int i=1;i<=j;i++){
                ret*=i;
            }
            sum+=ret;
        }
        System.out.println(sum);
    }
}
