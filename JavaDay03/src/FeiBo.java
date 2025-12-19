/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 上午8:50
 */
public class FeiBo {
    public static int Fab(int n){
        if(n==1||n==2){
            return 1;
        }
        return Fab(n-1)+Fab(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Fab(10));
    }
}
//效率极低，有大量重复计算