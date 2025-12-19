import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 上午8:37
 */
public class Test_1 {
    public static void main(String[] args) {
//        System.out.print("判断是否为素数\n请输入任意数字:");
//        Scanner scanner=new Scanner(System.in);
//        int i=scanner.nextInt();
        int i=0;
        int j=0;
        for(i=2;i<=100;i++){

            for(j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    break;
                }
            }
            if(i>Math.sqrt(i)){
                System.out.println(i+"是素数");
            }
        }

    }
    public static void main1(String[] args) {
        System.out.print("请输入任意整数：");
        Scanner scanner = new Scanner(System.in);
        int j=scanner.nextInt();
        int i = 0;
        int ret = 0;
        for (i = 0; i < j; i++) {
            if (i / 10 == 9 || i % 10 == 9) {
                ret++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("0-"+j+"中包含9的数字总共有" + ret + "个");
    }
}
