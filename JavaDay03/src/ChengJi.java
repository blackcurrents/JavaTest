import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 上午10:11
 */
public class ChengJi {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int score=in.nextInt();
        if(score>=90&&score<=100){
            System.out.println("优秀");
        }else if(score>=80&&score<90){
            System.out.println("良好");
        }else if(score>=70&&score<80){
            System.out.println("中等");
        }else if(score>=60&&score<70){
            System.out.println("及格");
        }else if(score>=0&&score<60){
            System.out.println("不及格");
        }else{
            System.out.println("输入无效");
        }
    }
}
