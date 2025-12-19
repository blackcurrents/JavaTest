import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-19
 * Time: 下午4:18
 */
public class Date {
    public int year;
    public int month;
    public int day;
    public void setDay(int year,int m,int d){
        this.year =year;
        month=m;
        day=d;
    }

    public static void main1(){

    }

    public static void main(String[] args) {
        Date date=new Date();
        date.setDay(1999,1,1);
        Date.main1();
        Scanner in= new Scanner(System.in);
        int m=in.nextInt();
        int[] arr=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(arr));
        Date date1=new Date();
        date1.setDay(2000,2,2);
    }
}



