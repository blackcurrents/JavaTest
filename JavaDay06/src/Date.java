import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: LS
 * Date: 2025-12-22
 * Time: 上午10:22
 */
public class Date {
    public int year;
    public int month;
    public int day;
    public void setDay(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public void dayPrint(){
        System.out.println(this.year+"/"+this.month+"/"+this.day);
    }

    public static void main(String[] args) {
        Date d=new Date();
        Date d2=new Date();
        Date d3=new Date();
        d.setDay(2000,1,1);
        d2.setDay(2001,1,1);
        d3.setDay(2002,1,1);
        d.dayPrint();
        d2.dayPrint();
        d3.dayPrint();
    }
}
