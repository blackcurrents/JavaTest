import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 上午10:23
 */
public class zuidagongyueshu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=a%b;
        while(c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        System.out.println("最大公约数是"+b);
    }
}
