import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-19
 * Time: 上午9:51
 */
public class Erfen {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,6,8,10};
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=erfen(arr,n);
        if(i==-1){
            System.out.println("没找到");
        }else{
            System.out.println("找到了，下表为"+i);
        }
    }
    public static int erfen(int[] arr,int n){

        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(n<arr[mid]){
                right=mid;
            }else if(n==arr[mid]){
                return mid;
            }else if(n>arr[mid]){
                left=mid;
            }
        }
        return -1;
    }
}
