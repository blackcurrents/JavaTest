/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 下午3:40
 */
public class Shuixianshu {
    public static void main(String[] args) {
        for (int i=0;i<999999;i++){
            int count=0;
            int temp=i;
            while(temp!=0){
                count++;
                temp=temp/10;
            }
            temp=i;
            int sum=0;
            while(temp!=0){
                sum=sum+(int)Math.pow(temp%10,count);
                temp/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
