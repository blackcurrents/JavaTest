/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 下午7:01
 */
public class BiDaxiao {
    public static int fac(int a,int b){
        return a>b?a:b;
    }
    public static int fac2(int a,int b,int c){
        return fac(c,fac(a,b));
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        System.out.println(fac2(a,b,c));
    }
}
