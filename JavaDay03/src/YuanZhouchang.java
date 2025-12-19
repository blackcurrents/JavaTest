import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 上午10:05
 */
public class YuanZhouchang {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("请输入半径");
        double a=3.14159;
        double r=in.nextDouble();
        System.out.println("周长为"+2*a*r);
        System.out.println("面积为"+a*r*r);
    }
}
