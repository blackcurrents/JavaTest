/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-18
 * Time: 下午3:24
 */
public class ShuZuChuancan {
    public static void Fac(int[] arr1){
        arr1[0]=100;
    }
    public static void Fac1(int[] arr2){
        arr2=new int[]{11,22,33,44};
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        Fac(arr);
        for (int x : arr) {
            System.out.print(x+" ");
        }
        Fac1(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
//java传参只有值传递 ，应用类型的特殊之处是“地址是值”，能否修改原对象，取决于是通过地址修改内容还是直接修改地址本身。
