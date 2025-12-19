/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 下午5:10
 */
public class Jiecheng {
    public static int fac1(int n){
        int ret=1;
        for(int i=1;i<=n;i++){
            ret*=i;
        }
        return ret;
    }
    public static int fac2(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=fac1(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fac2(5));
    }
}
