/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 上午10:32
 */
public class Fenshuqiuhe {
    public static void main(String[] args) {
        double sum=0;
        int flag=1;
        for(int i=1;i<=100;i++){
            sum=sum+1.0/i*flag;
            flag=-flag;
        }
        System.out.println(sum);
    }
}
