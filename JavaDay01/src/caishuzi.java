import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-16
 * Time: 下午7:08
 */
public class caishuzi {
    public static void main(String[] args) {
        Random random=new Random();
        int ranDum=random.nextInt(101);
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("请输入你的数字：");
            int num=scanner.nextInt();
            if(num<ranDum){
                System.out.println("小了");
            } else if (num>ranDum) {
                System.out.println("大了");
            }else{
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
