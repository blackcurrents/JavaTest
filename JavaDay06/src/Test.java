/**
 * Created with IntelliJ IDEA.
 * Description:静态导入
 * User: LS
 * Date: 2025-12-22
 * Time: 下午4:17
 */
import static java.lang.Math.*;
public class Test {
    public static void main(String[] args) {
        double x=30;
        double y=40;
        double result=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        //可以优化成
        double result1=sqrt(pow(x,2)+pow(y,2));
    }
}
