import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 下午3:59
 */
public class Erjinzhi{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        int count=0;
        while(i!=0){
            count++;
            i=i&(i-1);
        }
        System.out.println("二进制位中1有"+count+"个");
    }
}
