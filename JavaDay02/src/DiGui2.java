/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 下午7:56
 */
public class DiGui2 {
    public static int Print(int n){
        if(n<10){
          return n;
        }else{
            return n%10+Print(n/10);
        }
    }
    public static void main(String[] args) {
        int sum=0;
        sum=Print(1729);
        System.out.println(sum);
    }
}
