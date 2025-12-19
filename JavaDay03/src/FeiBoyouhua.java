/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 上午9:00
 */
public class FeiBoyouhua {
    public static int Fab(int n){
        if(n==1||n==2){
            return 1;
        }
        int a1=1;
        int a2=1;
        int a3=1;
        for(int i=3;i<=n;i++){
            a3=a1+a2;
            a1=a2;
            a2=a3;
        }
        return a3;
    }
    public static void main(String[] args) {
        System.out.println(Fab(3));
    }
}
