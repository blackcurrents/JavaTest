import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 上午11:05
 */
public class Caishuzi {
    public static void main(String[] args) {
        Random random=new Random();
        int ranDum=random.nextInt(101);
        Scanner scanner=new Scanner(System.in);
        int count=0;
        while(true) {
            int num = scanner.nextInt();
            if (num < ranDum) {
                System.out.println("猜小了");
            } else if (num > ranDum) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜对了");
                break;
            }
            if(++count==5){
                System.out.println("游戏结束，正确数字是"+ranDum);
                break;
            }

        }
    }
}
