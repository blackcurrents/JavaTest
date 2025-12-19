/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 下午7:43
 */
public class DiGui1 {
    public static void Fac(int n){
        if(n/10!=0){
            Fac(n/10);
            System.out.print(n%10+" ");
        }else{
            System.out.print(n%10+" ");
        }
    }
    public static void main(String[] args) {
        Fac(1234567);
    }
}
