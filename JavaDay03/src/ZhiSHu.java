/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 上午10:47
 */
public class ZhiSHu {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
                if(j>Math.sqrt(i)){
                    System.out.print(i+" ");
                    break;
                }
            }

        }
    }
}
