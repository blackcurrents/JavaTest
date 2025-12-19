/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 下午7:17
 */
public class DiGui {
    public static int fac(int n){
        if(n==1){
            return 1;
        }else{
            int temp=n*fac(n-1);
            return temp;
        }
    }
    public static void main(String[] args) {
        System.out.println(fac(3) );
    }

}
