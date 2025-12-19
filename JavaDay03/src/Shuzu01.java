/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 上午10:20
 */
public class Shuzu01 {
    public static void main(String[] args) {
        int[] arr=new int[]{12,45,89,23,56};
        int max=arr[0];
        int min=arr[0];
        double sum=0;
        for(int i=0;i<=arr.length-1;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
            sum+=arr[i];
        }
        double ave=sum/(double)arr.length;
        System.out.println("最大值为"+max+" 最小值为"+min);
        System.out.printf("平均值为 %.2f %n", ave);
    }
}
