/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-17
 * Time: 下午6:49
 */
public class ChongZai {
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return  a+b+c;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        int sum1=add(1,2);
        int sum2=add(1,2,3);
        double sum3=add(1.2,2.2);
        System.out.println(sum1+" "+sum2+" "+sum3);
    }
}
