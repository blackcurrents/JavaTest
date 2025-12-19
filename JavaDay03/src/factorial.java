import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 上午10:43
 */
public class factorial {
    public int factorial(int n){
        Scanner in  =new Scanner(System.in);
        int a =in.nextInt();
        int ret=0;
        for(int i=1;i<=n;i++){
            ret*=i;
        }
        return ret;
    }
}
