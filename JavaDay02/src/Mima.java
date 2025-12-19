import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 下午2:56
 */
public class Mima {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=3;
        while(count!=0){
            System.out.print("请输入你的密码：");
            String str=in.nextLine();
            if(str.equals("1234")){
                System.out.println("密码正确");
                break;
            }else{
                System.out.println("密码错误");
                count--;
            }
        }
        if(count==0){
            System.out.println("密码输入错误过多，已退出");
        }
    }
}
